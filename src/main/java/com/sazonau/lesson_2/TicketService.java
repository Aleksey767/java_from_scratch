package com.sazonau.lesson_2;


public class TicketService {
    public static void main(String[] args) {

        Ticket emptyTicket = new Ticket();
        Ticket fullTicket = new Ticket("1234", "MainHall", 123, 1111111112, true, 'B', 5.5);
        Ticket limitedTicket = new Ticket("SmallHall", 456, 1717610803);

        // Printing the tickets
        System.out.println("Empty Ticket:" + emptyTicket);
        System.out.println("Full Ticket:" + fullTicket);
        System.out.println("Limited Ticket:" + limitedTicket);
    }
}
