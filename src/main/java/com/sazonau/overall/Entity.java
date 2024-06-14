package com.sazonau.overall;

import com.sazonau.ticket.TicketException;

public abstract class Entity {
    public int id;

    public Entity(int id) {
        checkId(id);
        this.id = id;
    }

    private void checkId(int id) {
        if (id > 9999) throw new TicketException("max 4 digits chars");
    }

    public int getId() {
        checkId(id);
        return id;
    }


    public void setId(int id) {
        checkId(id);
        this.id = id;
    }


}
