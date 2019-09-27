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
        timeLeft(1,15,4,36);
        timeLeft(1,34,8,20);

    }
    private static void timeLeft(int curHour, int curMin, int depHour, int depMin) {
        int d = depHour - curHour - ;
        int e = depMin - curMin;
        System.out.print(d + "hours and ");
        System.out.println(e + "minutes");
    }
    }

