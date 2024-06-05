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
        if (id.length() > 4) throw new IllegalArgumentException("ID cannot exceed 4 characters.");
        if (concertHall.length() > 10) throw new IllegalArgumentException("Concert hall name cannot exceed 10 characters.");
        if (eventCode < 100 || eventCode > 999) throw new IllegalArgumentException("Event code must be 3 digits.");
        if (stadiumSector < 'A' || stadiumSector > 'C') throw new IllegalArgumentException("Stadium sector must be between 'A' and 'C'.");

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

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.length() > 4) throw new IllegalArgumentException("ID must be max 4 characters.");
        this.id = id;
    }

    public String getConcertHall() {
        return concertHall;
    }

    public void setConcertHall(String concertHall) {
        if (concertHall.length() > 10) throw new IllegalArgumentException("Concert hall name must be <= 10 characters.");
        this.concertHall = concertHall;
    }

    public int getEventCode() {
        return eventCode;
    }

    public void setEventCode(int eventCode) {
        if (eventCode < 100 || eventCode > 999) throw new IllegalArgumentException("Event code must be 3 digits.");
        this.eventCode = eventCode;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isPromo() {
        return isPromo;
    }

    public void setPromo(boolean promo) {
        isPromo = promo;
    }

    public char getStadiumSector() {
        return stadiumSector;
    }

    public void setStadiumSector(char stadiumSector) {
        if (stadiumSector < 'A' || stadiumSector > 'C') throw new IllegalArgumentException("Stadium sector must be between 'A' and 'C'.");
        this.stadiumSector = stadiumSector;
    }

    public double getMaxAllowedBackpackWeight() {
        return maxAllowedBackpackWeight;
    }

    public void setMaxAllowedBackpackWeight(double maxAllowedBackpackWeight) {
        this.maxAllowedBackpackWeight = maxAllowedBackpackWeight;
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
