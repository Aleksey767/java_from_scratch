package com.sazonau.ticket;

import com.sazonau.interfaces.Print;
import com.sazonau.interfaces.Share;
import lombok.Getter;
import com.sazonau.overall.Entity;

public class Ticket extends Entity implements Print, Share {

    private final String concertHall;
    private final int eventCode;
    private long time;
    private boolean isPromo;
    @Getter
    private char stadiumSector;
    private double maxAllowedBackpackWeight;

    // Constructor with all parameters
    public Ticket(int id, String concertHall, int eventCode, long time, boolean isPromo, char stadiumSector, double maxAllowedBackpackWeight) {
        super(id);

        checkId(id);
        checkConcertHall(concertHall);
        checkEventCode(eventCode);
        checkStadiumSector(stadiumSector);
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.maxAllowedBackpackWeight = maxAllowedBackpackWeight;
    }

    // Constructor with limited parameters
    public Ticket(String concertHall, int eventCode, long time) {
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
    }

    // Default constructor for empty ticket
    public Ticket() {
        this.id = 0;
        this.concertHall = "unknown";
        this.eventCode = 0;
        this.time = 0;
        this.isPromo = false;
        this.stadiumSector = '\u0000';
        this.maxAllowedBackpackWeight = 0.0;
    }

    // Validators
    private void checkStadiumSector(char sector) {
        if (sector > 'C' || sector < 'A') throw new TicketException("Stadium sector must be 'A', 'B','C'");
    }

    private void checkConcertHall(String hall) {
        if (hall.length() > 10) throw new TicketException("Concert hall title must contain no more than 10 chars");
    }

    private void checkEventCode(int code) {
        if (code / 100 > 9 || code / 100 < 1) throw new TicketException("Event code must contain only 3 digits");
    }

    private void checkId(int id) {
        if (id > 9999) throw new TicketException("Should be max 4 digits chars");
    }

    //Setters
    public void setTime(long time) {
        this.time = time;
    }

    public void setStadiumSector(char stadiumSector) {
        checkStadiumSector(stadiumSector);
        this.stadiumSector = stadiumSector;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    public void shareByPhone(String phoneNumber) {
        System.out.printf("Ticket has been successfully shared to %s\n", phoneNumber);
    }

    public void shareByPhone(int phoneNumber) {
        System.out.printf("Ticket has been successfully shared to %d\n", phoneNumber);
    }

    public void shareByEmail(String email) {
        System.out.printf("Ticket has been successfully shared to %s\n", email);
    }

    @Override
    public String toString() {
        String paddedId = String.format("%-4s", id);
        String paddedConcertHall = String.format("%-10s", concertHall);
        String paddedTime = String.format("%-10d", time);
        String paddedPromo = String.format("%-5s", isPromo);
        String paddedEventCode = String.format("%-3s", eventCode);

        return String.format("\t| ID - %s| Concert Hall - %s| Event code - %s| Time - %s| Promo - %s| Stadium Sector - %s| maxAllowedBackpackWeight - %.1f |",
                paddedId, paddedConcertHall, paddedEventCode, paddedTime, paddedPromo, stadiumSector, maxAllowedBackpackWeight);
    }


}