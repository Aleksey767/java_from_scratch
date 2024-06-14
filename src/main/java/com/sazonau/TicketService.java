package com.sazonau;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TicketService {
    private final Map<String, Ticket> tickets;
    private static final String[] ids = {"03", "07", "10", "666"};
    private static final TicketService service = new TicketService();
    private final static char sector = 'B';

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

    public static void main(String[] args) {

        Ticket emptyTicket = new Ticket();
        Ticket fullTicket = new Ticket("1234", "MainHall", 123, 1717610803, true, 'B', 5.5);
        Ticket limitedTicket = new Ticket("SmallHall", 456, 1717610909);

        // Printing of tickets of 3 types
        System.out.printf("\nEmpty Ticket:%s%n\nFull Ticket:%s%n\nLimited Ticket:%s%n",emptyTicket,fullTicket,limitedTicket);

        // Printing tickets by ID
        System.out.printf("\n Tickets which have ID: %s :\n", String.join(",", ids));
        for (String id : ids) {
            Ticket ticket = service.getTicketById(id);
            if (ticket != null) {
                System.out.println(ticket);
            } else {
                System.out.printf("\n Ticket with ID - %s were not found.%n\n", id);
            }
        }

        // Printing tickets by stadium sector
        List<Ticket> ticketsBySector = service.getTicketsByStadiumSector(sector);
        System.out.printf("\n Tickets in sector %s :\n", sector);
        for (Ticket ticket : ticketsBySector) {
            System.out.println(ticket);
        }
    }
}
