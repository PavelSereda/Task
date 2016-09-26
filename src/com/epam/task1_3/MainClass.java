package com.epam.task1_3;

public class MainClass {
    public static void main(String[] args) {
        try {
            Function f = new Function(1.0, 1.0, 1.0);
            f.function();
        } catch (Exception ex) {
            System.out.println("Invalid data");
        }
    }
}
