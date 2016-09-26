package com.epam.task1_2;


public class Checker {
    double x, y;

    public Checker(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean checker() {
        return (((x>= -4) && (x <= 4) && (y <= 5) && (y >= 0))
                || ((x >= -6) && (x <= 6) && (y >= -3) && (y <= 0))) ? true : false;
    }

}
