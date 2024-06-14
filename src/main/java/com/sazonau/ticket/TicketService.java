package com.sazonau.ticket;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TicketService {
    private final Map<String, Ticket> tickets;


    public TicketService() {
        tickets = new HashMap<>();
        initializeTickets();
    }

    private void initializeTickets() {
        Ticket[] ticketArray = {
                new Ticket("01", "MainHall", 111, 1728547200, false, 'C', 6.0),
                new Ticket("02", "SmallHall", 112, 1728547200, true, 'B', 5.5),
                new Ticket("03", "MediumHall", 113, 1728547200, false, 'A', 7.0),
                new Ticket("04", "MediumHall", 114, 1733821200, true, 'B', 4.0),
                new Ticket("05", "SmallHall", 115, 1733821200, false, 'A', 5.5),
                new Ticket("06", "MediumHall", 116, 1733821200, false, 'B', 4.0),
                new Ticket("07", "MainHall", 117, 1717829102, false, 'B', 4.0),
                new Ticket("08", "MediumHall", 118, 1717829102, false, 'A', 10.0),
                new Ticket("09", "MainHall", 119, 1717829102, true, 'C', 4.0),
                new Ticket("10", "SmallHall", 120, 1717829102, false, 'A', 4.0)
        };

        for (Ticket ticket : ticketArray) {
            tickets.put(ticket.getId(), ticket);
        }
    }

    public Ticket getTicketById(String id) {
        return tickets.get(id);
    }

    public List<Ticket> getTicketsByStadiumSector(char stadiumSector) {

        List<Ticket> matchingTickets = new ArrayList<>();
        for (Ticket ticket : tickets.values()) {
            if (ticket.getStadiumSector() == stadiumSector) {
                matchingTickets.add(ticket);
            }
        }
        return matchingTickets;
    }


}
