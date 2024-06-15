package com.sazonau;

import com.sazonau.overall.User;
import com.sazonau.ticket.Ticket;
import com.sazonau.ticket.TicketService;
import com.sazonau.users.Admin;
import com.sazonau.users.Client;

public class Main {
    public static void main(String[] args) {
        // Example of custom annotation
        TicketService firstTicket = new TicketService();
        firstTicket.createTicket();
        System.out.println(firstTicket.getById(0));


        // Example of Polymorphism and Inheritance
        Ticket emptyTicket = new Ticket();
        emptyTicket.shareByEmail("rockstar@gmail.com");
        emptyTicket.shareByPhone(777666555);
        emptyTicket.shareByPhone("+48 777-666-555");

        User client = new Client(101);
        User admin = new Admin(501);

        Client client2 = new Client(101);
        Admin admin2 = new Admin(501);

        client.printRole();
        admin.printRole();

        client2.getTicket();
        admin2.checkTicket();

    }
}
