package com.company;

public class MathEx {
    public static int swap (int x) {
        int a = x % 10;
        int b = x % 100 / 10;
        int c = x / 100;
        int y = c * 100 + b + a * 10;
        return y;
    }
    public static void main (String [] args) {
        int z = swap (172);
        System.out.println(z);

}

    }

