package ru.geekbrains.lesson2;

import java.util.Arrays;

public class mainJavaClass {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != 0) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr1));
        int b = 0;
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = b;
            b += 3;
        }
        System.out.println(Arrays.toString(arr2));
        int[] digits = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < 6) {
                digits[i] = digits[i] * 2;
            }
        }
        System.out.println(Arrays.toString(digits));

        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int c = 0; c < array.length; c++) {
                if (i == c) {
                    array[i][c] = 1;
                } else array[i][c] = 0;
            }
            System.out.println(Arrays.toString(array[i]));
        }
        int[] cmpr = new int[]{-2, 5, 3, 21, -7, 4, 79, 20, 13, 8, 19, 11};
        int min = cmpr[0];
        int max = cmpr[0];
        for (int i = 1; i < cmpr.length; i++) {
            if (cmpr[i] > max) {
                max = cmpr[i];
            }
            if (cmpr[i] < min) {
                min = cmpr[i];
            }
        }
        System.out.println("Min =" + min + "  Max = " + max);

        int[] checkBalance = new int[]{5, 34, 11, 3, 8, 7, 9, 9, 3, 1, 9, 1};
        int count = 1;
        int sum = checkBalance[0];
        int sum2 = 0;
        int dif = sum - sum2;
        for (int d = 1; d < checkBalance.length; d++) {
            sum2 = sum2 + checkBalance[d];
        }
        for (int d = count; d < checkBalance.length - 1 && dif != 0; d++) {
            sum2 = sum2 - checkBalance[d];
            sum = sum + checkBalance[d];
            dif = sum2 - sum;
            switch (dif) {
                case 0:
                    System.out.println("Такое место есть между " + (count + 1) + "-м и " + (count + 2) + "-м элементом");
                    System.out.println("Сумма левой части массива: " + sum);
                    System.out.println("Сумма правой части массива: " + sum2);
                    break;
                default:
                    count++;
            }

        }
        switch (sum - sum2) {
            case 0:
                break;
            default:
                System.out.println("Такого места в массиве нет!");
        }

        int[] array10 = new int[]{3, 4, 5, 10, 28, 7, 9, 10, 13, 1};
        int k = -2;
        if (k < 0) {
            k = 0 - k;
            for (int j = 1; j <= k; j++) {
                int drop = array10[array10.length - 1];
                for (int f = 0; f < array10.length - 1; f++) {
                    array10[array10.length - 1 - f] = array10[array10.length - 2 - f];
                }
                array10[0] = drop;
            }
            System.out.println(Arrays.toString(array10));
        } else {
            for (int j = 1; j <= k; j++) {
                int drop = array10[0];
                for (int f = 0; f < array10.length - 1; f++) {
                    array10[f] = array10[f + 1];
                }
                array10[array10.length - 1] = drop;
            }
            System.out.println(Arrays.toString(array10));
        }
    }
}




