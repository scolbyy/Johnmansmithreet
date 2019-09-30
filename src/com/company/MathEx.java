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
        int j = dayOfWeek(0,1);
        System.out.println(j);
        int k = dayOfWeek(0,14);
        System.out.println(k);
        int l = dayOfWeek(6,22);
        System.out.println(l);
        int m = dayOfWeek(5,4);
        System.out.println(m);
        int n = dayOfWeek(1,24);
        System.out.println(n);
        int o = dayOfWeek(2,1);
        System.out.println(o);

    }
    private static void timeLeft(int curHour, int curMin, int depHour, int depMin) {
        int d = depHour * 60;
        d = d + depMin;
        int e = curHour * 60;
        e = e + curMin;
        int f = d - e;
        int g = f / 60;
        int h = f % 60;
        System.out.print(g + " hours and ");
        System.out.println(h + " minutes");
    }

    private static int dayOfWeek(int jan1, int date){
        int x = (date + jan1) -1;
        x = x % 7;
        return x;
        }
    }


