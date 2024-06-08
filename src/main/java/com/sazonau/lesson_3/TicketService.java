package com.sazonau.lesson_3;

import com.sazonau.lesson_2.Ticket;

public class TicketService {
    public static void main(String[] args) {

        Ticket ticketOne = new Ticket("01", "MainHall", 111, 1728547200, false, 'C', 6.0);
        Ticket ticketTwo = new Ticket("02", "SmallHall", 112, 1728547200, true, 'B', 5.5);
        Ticket ticketThree = new Ticket("03", "MediumHall", 113, 1728547200, false, 'A', 7.0);
        Ticket ticketFour = new Ticket("04", "MediumHall", 114, 	1733821200, true, 'B', 4.0);
        Ticket ticketFive = new Ticket("05", "SmallHall", 115, 	1733821200, false, 'A', 5.5);
        Ticket ticketSix = new Ticket("06", "MediumHall", 116, 	1733821200, false, 'B', 4.0);
        Ticket ticketSeven = new Ticket("07", "MainHall", 117, 1717829102, false, 'B', 4.0);
        Ticket ticketEight = new Ticket("08", "MediumHall", 118, 1717829102, false, 'A', 10.0);
        Ticket ticketNine = new Ticket("09", "MainHall", 119, 1717829102, true, 'C', 4.0);
        Ticket ticketTen= new Ticket("10", "SmallHall", 120, 1717829102, false, 'A', 4.0);

    }
}
