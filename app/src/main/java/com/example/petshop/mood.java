package com.example.petshop;

import java.util.Date;

public abstract class mood {
    private Date date;

    public mood() {
        this.date = new Date();

    }

    public mood(Date date) {
        this.date = date;

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

