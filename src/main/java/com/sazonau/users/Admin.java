package com.sazonau.users;

import com.sazonau.overall.User;

public class Admin extends User {

    public Admin(int id) {
        super(id,"ADMIN");
    }
public void checkTicket(){
    System.out.println("Admin is checking ticket...");
}

}
