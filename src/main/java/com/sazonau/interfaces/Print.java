package com.sazonau.interfaces;

public interface Print {
    default void print() {
        System.out.println("print content in console");
    }
}
