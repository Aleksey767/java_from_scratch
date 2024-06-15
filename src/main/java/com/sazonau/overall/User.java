package com.sazonau.overall;

public abstract class User extends Entity {
    String role;

    public User(int id, String role) {
        super(id);
        this.role = role;
    }

    public void printRole() {
        System.out.printf("| ID - %d has role - %s |\n", id, role);
    }
}
