package com.example.petshop;

import java.util.Date;

public class cat extends Pet{
    public cat (String name){
        super (name);
    }
    public cat (String name, Date birthDate){
        super (name,birthDate);

    }

    @Override
    public String speak() {
        return "meow!";
    }
    public void pet(){
        System.out.println(getName()+"purring");
    }}

