package com.epam.task1_1;

public class MainClass {
    public static void main(String[] args) {
        double x = 1.0, y = 1.0;

        try {
            Calculation c = new Calculation(x, y);

            System.out.println(c.calculation());
        } catch (Exception ex) {
            System.out.println("Invalid data");
        }
    }
}
