package com.sazonau.overall;

import com.sazonau.ticket.TicketException;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class Entity {
    public int id;

    public Entity(int id) {
        this.id = id;
    }



    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


}
