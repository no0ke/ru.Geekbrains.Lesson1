package ru.Geekbrains.lesson3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeat = 1;
        while (repeat == 1) {
            Game();
            System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).");
            repeat = scanner.nextInt();
        }
        while ((repeat < 0) || (repeat > 1)) {
        }
        if (repeat == 1) {
            Game();
        } else {
            System.out.println("Пока!");
            return;
        }
    }
    public static void Game() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача угадать число!");
        System.out.println("Количество попыток = 3");
        int range = 9;
        int number = (int) (Math.random() * range);
        int i = 0;
        while (i < 3) {
            i++;
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали!");
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше!");
            } else {
                System.out.println("Загаданное число больше!");
            }
            System.out.println("Попытка - " + i);
        }
    }
}




