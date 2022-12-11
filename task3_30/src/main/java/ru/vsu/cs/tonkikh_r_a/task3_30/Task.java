package ru.vsu.cs.tonkikh_r_a.task3_30;

import java.util.Scanner;
public class Task{

    private static final Parabola P1 = new Parabola(2, 3, -1);
    private static final Square_1 S1 = new Square_1(0, 3, 3, 4);
    private static final Square_2 S2 = new Square_2(0, 0, 3, 2);
    private static final Square_3 S3 = new Square_3(-6, -1, 2, 0);
    public  static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

       double x;
        x = CheckNumDouble(x);
        double y;
        y = CheckNumDouble(y);
        String s = String.valueOf(GetColour(x, y));
       System.out.println(s);

    }

    public static SimpleColour GetColour(double x, double y) {
        int j = 0;
        if (P1.isPointAboveParabola(x, y) && S1.isPointInSquare(x, y)) {
            return SimpleColour.YELLOW;

        }
        if (!P1.isPointAboveParabola(x, y) && S1.isPointInSquare(x, y)) {
            return SimpleColour.BLUE;

        }
        if (P1.isPointAboveParabola(x, y) && S2.isPointInSquare(x, y)) {
            return SimpleColour.ORANGE;

        }
        if (!P1.isPointAboveParabola(x, y) && S2.isPointInSquare(x, y)) {
            return SimpleColour.GREY;

        }
        if (!P1.isPointAboveParabola(x, y) && S2.isPointInSquare(x, y) && x < 0) {
            return SimpleColour.WHITE;

        }
        if (!P1.isPointAboveParabola(x, y) && S3.isPointInSquare(x, y)) {
            return SimpleColour.GREY;

        }
        if (S3.isPointInSquare(x, y)) {
            return SimpleColour.YELLOW;

        }
        if (j == 0) {
            return SimpleColour.YELLOW;
        }
        return SimpleColour.YELLOW;
    }

    public static double CheckNumDouble(double num){
        while (true){
            try {
                System.out.println("Введите координату от -10 до 10: ");
                String s = in.nextLine();
                if (num > 10 && num < -10){
                    num = Double.parseDouble(s);
                    return num;
                }
            }catch (Exception e){
                System.out.println("Попробуйте ещё раз!");
            }
        }
    }

}