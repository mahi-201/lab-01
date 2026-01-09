package com.example.petshop;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class mainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    cat cat=new cat("lucy");
    dog dog = new dog ("snoopy");
    scorpion scorpion= new scorpion("scorponok");
    ArrayList<Pettable> pettablePets = new ArrayList<Pettable>();
    petList.add(cat);
    petList.add(dog);
    petList.add(scorpion);
    happymood happy=new happymood();
    sadmood sad= new sadmood();
    ArrayList<Mood>moodlist= new ArrayList<>();
    petList.add(happy);
    petList.add(sad);




}