package ru.geekbrains.lesson3;

import java.util.Scanner;

public class MyThirdClass {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ваша задача угадать число с трех попыток.");
        guessNumber();
        System.out.println("Вы не захотели больше играть! Всего хорошего!");
        scanner.close();
    }

    private static void guessNumber() {
        int repeat = 1;
        while (repeat == 1) {
            int number = (int) (Math.random() * 10);
            if (number == 10) {
                number = number - 1;
            } else {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Угадайте число от 0 до 9");
                    int input_number = scanner.nextInt();
                    if (input_number == number) {
                        System.out.println("Вы угадали число!");
                        break;
                    } else if (input_number > number) {
                        System.out.println("Загаданное число меньше");
                    } else {
                        System.out.println("Загаданное число больше");
                    }
                }
                System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет»");
                repeat = scanner.nextInt();
            }
        }
    }


}
