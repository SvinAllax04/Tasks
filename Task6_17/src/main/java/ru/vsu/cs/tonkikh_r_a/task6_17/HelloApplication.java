package ru.vsu.cs.tonkikh_r_a.task6_17;

import java.util.Scanner;

public class HelloApplication {
    private static Scanner in = new Scanner(System.in);

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = in.nextLine();
                return Integer.parseInt(input);
            } catch (Exception ex) {
                System.out.println("Некорректные данные \n");
            }
        }
    }

    public static void task(String[] args){

    }
}