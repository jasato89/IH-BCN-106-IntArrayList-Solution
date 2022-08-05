package com.ironhack;

public class Main {

    public static void main(String[] args) {
	CustomArrayList nuevoNombreLista = new CustomArrayList();


        for (int i = 0; i < 16; i++) {
            nuevoNombreLista.add(i+1);

        }

        for (int number : nuevoNombreLista.getNumbers()) {
            System.out.println(number);
        }
    }
}
