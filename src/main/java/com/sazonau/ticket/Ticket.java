package com.sazonau.ticket;

import lombok.Getter;

public class Ticket {
    // Getters
    @Getter
    private String id;
    private final String concertHall;
    private final int eventCode;
    private final long time;
    private boolean isPromo;
    @Getter
    private char stadiumSector;
    private double maxAllowedBackpackWeight;

    // Constructor with all parameters initialized
    public Ticket(String id, String concertHall, int eventCode, long time, boolean isPromo, char stadiumSector, double maxAllowedBackpackWeight) {

        this.id = id;
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
        this("null", "null", 0, 0, false, ' ', 0.0);
    }

    @Override
    // making output evener in terminal
    public String toString() {
        String paddedId = String.format("%-4s", id);
        String paddedConcertHall = String.format("%-10s", concertHall);
        String paddedTime = String.format("%-10d", time);
        String paddedPromo = String.format("%-5s", isPromo);
        String paddedEventCode = String.format("%-3s", eventCode);

        return String.format("\t ID - %s, Concert Hall - %s, Event code - %s, Time - %s, Promo - %s, Stadium Sector - %s, maxAllowedBackpackWeight - %.1f",
                paddedId, paddedConcertHall, paddedEventCode, paddedTime, paddedPromo, stadiumSector, maxAllowedBackpackWeight);
    }


}