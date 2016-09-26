package com.epam.task1_5;

import static java.lang.Integer.max;


public class Matrix {

    int[] a;
    int n;
    int[] d;


    public Matrix(int[] a, int n, int[] d) {
        this.a = a;
        this.n = n;
        this.d = d;
    }

    public int minCount() {

        for (int i = 0; i < n; ++i) {
            d[i] = 1;
            for (int j = 0; j < i; ++j)
                if (a[j] < a[i])
                    d[i] = max(d[i], 1 + d[j]);
        }

        int ans = d[0];
        for (int i = 0; i < n; ++i)
            ans = max(ans, d[i]);
        System.out.println(a.length - ans);
        return a.length - ans;
    }


}
