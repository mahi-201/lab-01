package com.example.petshop;

import java.util.Date;

public class dog extends Pet implements pettable{
    public dog (String name){
        super (name);
    }
    public dog (String name, Date birthDate){
        super (name,birthDate);

    }

    @Override
    public String speak() {
        return "bark!";
    }
    public void pet(){
        System.out.println(getName()+"barking");
    }}
