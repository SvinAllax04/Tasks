package ru.vsu.cs.tonkikh_r_a;

import java.util.Scanner;

public class checkLenArr {
    public static Scanner in = new Scanner(System.in);
    public static int checkLenArr(String txt){
        while (true){
            System.out.printf(txt);
            String s = in.nextLine();
            try {
                return Integer.parseInt(s);
            } catch (Exception ex){
                System.out.println("Неверное значение!");
            }
        }
    }
}
