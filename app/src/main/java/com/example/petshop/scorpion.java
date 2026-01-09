package com.example.petshop;

import java.util.Date;

public class scorpion extends Pet {
    public scorpion(String name) {
        super(name);
    }

    public scorpion(String name, Date birthDate) {
        super(name, birthDate);

    }

    @Override
    public String speak() {
        return "hiss";
    }
}
