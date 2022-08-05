package com.ironhack;

public class CustomArrayList implements IntList{

    private int[] numbers = new int[20];
    private int counter = 0;

    public void add(int number) {
        if (counter < numbers.length) {
        numbers[counter] = number;
        } else {
            int[] newArray = new int[(int)(numbers.length*1.5)];
            for (int i = 0; i < numbers.length; i++) {
                newArray[i] = numbers[i];
            }
            newArray[counter] = number;
            numbers = newArray;

        }
        counter++;

    }

    public int get(int index) {
        if (index > numbers.length && index < 0) {
            return -1;
        } else {
        return numbers[index];

        }
    }

    public int[] getNumbers() {
        return numbers;
    }
}
