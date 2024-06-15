package com.sazonau.users;

import com.sazonau.overall.User;

public class Client extends User {
    public Client(int id) {
        super(id, "CLIENT");
    }
    public void getTicket() {
        System.out.println("Client is getting ticket...");
    }
}
