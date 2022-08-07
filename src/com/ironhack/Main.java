package com.ironhack;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	CustomArrayList nuevoNombreLista = new CustomArrayList();
    Warrior warrior = new Warrior();
        String[] names = {"Pedro", "Antonio", "Jose", "Miquel"};
        for (int i = 0; i < 100; i++) {

        System.out.println(new Warrior().getName());
        }
/*


        for (int i = 0; i < 16; i++) {
            nuevoNombreLista.add(i+1);
        }

        for (int number : nuevoNombreLista.getNumbers()) {
            System.out.println(number);
        }

 */



        for(int i : balancer(new int[]{1,2,3,4,5}, 25)) {
            System.out.println(i);
        }


        // 1, 2, 3, 4, 5 = 15
        // 25

    }

    public static int[] balancer(int[] numbers, int sum) {

        int sumArray = 0;


        for(int number : numbers) {
            sumArray += number;
        }

            while (sumArray < sum) {

            int min = Integer.MAX_VALUE;
            int position = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    position = i;
                    min = numbers[i];
                }
            }
            numbers[position]++;
            sumArray++;
                System.out.println(Arrays.toString(numbers));
            }



        return numbers;
    }

    /*



    public int[] balancerFor(int[] array, int sum) {
        int suma = 0;

        for (int number : array) {
            suma+=number;
        }

        int lowerValue = Integer.MAX_VALUE;
        int position = 0;
        while(suma < sum) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < lowerValue) {
                    position = i;
                    lowerValue = array[i];
                }
            }
            array[position]++;
            suma++;

        }

    }

    public static int[] balancer(int[] array, int sum) {

        while (sumArray(array) < sum) {
            int lowerIndex = 0;
            int lowerValue = Integer.MAX_VALUE;

            for (int i = 0; i < array.length; i++) {
                if (array[i] < lowerValue) {
                    lowerIndex = i;
                    lowerValue = array[i];
                }
            }
            array[lowerIndex]++;

        }


        return array;
    }

    private static int sumArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum+= i;
        }
        return sum;

    }

     */
}
