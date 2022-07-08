package ru.netology.stats;

public class Main {


    public static void main(String[] args) {


        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int countUpToMidMonth = 0; //sales[countUpToMidMonth]/sales.length

        long midSales = 0;
        for (int i = 0; i < sales.length; i++) {
            midSales = midSales + sales[i];
        }


        // midSales = midSales + sales[i];

        //System.out.println(midSales/sales.length);

    }

}
