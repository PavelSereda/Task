package com.epam.task1_4;

public class MainClass {
    public static void main(String[] args) {
        int n = 10;
        int[] mass = new int[n];
        try {
            Mass m = new Mass(n, mass);
            m.print();
        } catch (Exception ex) {
            System.out.println("Invalid data");
        }
    }
}
