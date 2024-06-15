package com.sazonau.ticket;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TicketService {
    List<Ticket> tickets;

    public TicketService() {
        tickets = new ArrayList<>();
    }

    public void createTicket() {
        Ticket emptyTicket = new Ticket();
        tickets.add(emptyTicket);
    }

    public void createTicket(String concertHall, int eventCode, long time) {
        Ticket limitedTicket = new Ticket(concertHall, eventCode, time);
        tickets.add(limitedTicket);
    }

    public void createTicket(int id, String concertHall, int eventCode, long time, boolean isPromo,
                             char stadiumSector, double maxAllowedWeight) {
        Ticket fullTicket = new Ticket(id, concertHall, eventCode, time, isPromo, stadiumSector, maxAllowedWeight);
        tickets.add(fullTicket);
    }


    public Ticket getById(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) return ticket;
        }
        throw new TicketException("Invalid ID, please try again");
    }


}
