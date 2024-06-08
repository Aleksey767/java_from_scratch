package com.sazonau.lesson_2;

public class Ticket {
    private String id; // Max 4 digits and/or chars
    private String concertHall; // Max 10 chars
    private int eventCode; // 3 digits
    private long time; // Unix timestamp
    private boolean isPromo;
    private char stadiumSector; // From 'A' to 'C'
    private double maxAllowedBackpackWeight; // In kg, with grams precision

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
        this("null", "AnyFree", 100, 0L, false, 'A', 0.0);
    }

    // Getter for Lesson#3
    public String getId() {
        return id;
    }
    @Override
    // making output evener in terminal
    public String toString() {
        String paddedId = String.format("%-4s", id);
        String paddedConcertHall = String.format("%-10s", concertHall);
        String paddedTime = String.format("%-10d", time);
        String paddedPromo = String.format("%-5s", isPromo);

        return String.format("\t Ticket{id='%s', concertHall='%s', eventCode=%d, time=%s, isPromo=%s, stadiumSector='%s', maxAllowedBackpackWeight=%.1f}",
                paddedId, paddedConcertHall, eventCode, paddedTime, paddedPromo, stadiumSector, maxAllowedBackpackWeight);
    }


}