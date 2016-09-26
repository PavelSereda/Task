package com.epam.task1_7;


public class MainClass {

    public static void main(String[] args) {
        double[] mass = new double[]{5.45, 7.62, 5.56, 14.7, 12.7, 11.43, 10.2, 9, 2.7};
        try {
            Sort s = new Sort(mass);
            s.sort();
        } catch (Exception ex) {
            System.out.println("Invalid data");
        }
    }
}
