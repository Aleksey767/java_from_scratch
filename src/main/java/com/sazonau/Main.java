package com.sazonau;

import com.sazonau.ticket.Ticket;
import com.sazonau.ticket.TicketService;

import java.util.List;


public class Main {
    private static final String[] ids = {"03", "07", "10", "666"};
    private static final TicketService service = new TicketService();
    private final static char sector = 'B';
    public static void main(String[] args) {

        Ticket emptyTicket = new Ticket();
        Ticket fullTicket = new Ticket("1234", "MainHall", 123, 1717610803, true, 'B', 5.5);
        Ticket limitedTicket = new Ticket("SmallHall", 456, 1717610909);

        // Printing of tickets of 3 types
        System.out.printf("%s%n %s%n %s%n", emptyTicket, fullTicket, limitedTicket);

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
