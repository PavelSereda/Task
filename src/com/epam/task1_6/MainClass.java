package com.epam.task1_6;


public class MainClass {
    public static void main(String[] args) {
        try {
            Matrix m = new Matrix();
            m.createMass();
        } catch (Exception ex) {
            System.out.println("Invalid data");
        }
    }
}
