package com.ironhack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Warrior extends Character {
    private int stamina;
    private final String[] names = {"Pedro", "Antonio", "Jose", "Miquel"};
    private String name;


    public Warrior() {
        this.stamina = (int)Math.random() +50;
        this.name = names[new Random().nextInt(names.length)];
    }
    public Warrior(int stamina) {
        this.stamina = stamina;
    }

    public void attack() {

    }

    public int getStamina() {
        return stamina;
    }

    public String getName() {
        return name;
    }
}
