package com.sazonau.interfaces;

public interface Share {
    default void shareByPhone(String phoneNumber) {
        System.out.printf("print content in console");
    }

    default void shareByPhone(int phoneNumber) {
        System.out.printf("print content in console");
    }

    default void shareByEmail(String email) {
        System.out.printf("print content in console");
    }
}
