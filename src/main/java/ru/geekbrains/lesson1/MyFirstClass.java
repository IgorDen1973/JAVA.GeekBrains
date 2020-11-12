package ru.geekbrains.lesson1;

import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {
        byte a1;
        short bioHack;
        int c1;
        long deepStar;
        float e1;
        double $f;
        char _j;
        boolean xx;
        a1 = -125;
        bioHack = 3600;
        c1 = -18;
        deepStar = 6557000900L;
        e1 = 123.08f;
        $f = 123.08;
        _j = '\ubbbb' ;
        xx = true;

        System.out.println(a1);
        System.out.println(bioHack);
        System.out.println(c1);
        System.out.println(deepStar);
        System.out.println(e1);
        System.out.println($f);
        System.out.println(_j);
        System.out.println(xx);
        System.out.println(calculation(2.3f, 14.02f, 12.0f, 6.01f));
        System.out.println(task10and20(14, -3));
        isPositiveOrNegative(30);
        System.out.println(isNegative(-6));
        greetings("Морячок");

        System.out.println("Введите год:");
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();
        System.out.println(isLeap(z));
        scanner.close();

        }

    public static float calculation(float a, float b, float c, float d) {

        return a * (b + (c / d));
    }
    public static boolean task10and20(int x1, int x2) {
        int c = x1 + x2;
        if (c>=10 && c <=20) {
            return true;
        }
        else return false;
    }
     public static void isPositiveOrNegative(int x) {
        if(x>=0) {
            System.out.println("Передано положительное число");
        } else {
            System.out.println("Передано отрицательное число");
        }
    }
     public static boolean isNegative(int w) {
        if(w<0) {
            return true;
        } else {
        return false;
        }
    }
    public static void greetings(String name) {
        System.out.println("Привет, " +name + "!");
    }

    public static String isLeap(int z) {
        int c = z % 4;
        int k = z % 100;
        int l = z % 400;
        if (z==2020) {
            return "это самый удачный год!!";
        }
        if ((c == 0 && k != 0) || l == 0) {
            return "это високосный год!";
        }
        else {
            return "это обычный год!";
        }
    }

    }
