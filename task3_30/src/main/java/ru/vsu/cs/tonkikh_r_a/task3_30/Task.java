package ru.vsu.cs.tonkikh_r_a.task3_30;

import java.util.Scanner;
public class Task{

    private static final Parabola P1 = new Parabola(2, 3, -0.5);
    private static final Square S1 = new Square(0, 2, 3, 4);
    private static final Square S2 = new Square(0, -1, 3, 2);
    private static final Square S3 = new Square(-6, -1, 0, 2);
    public  static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

       double x = 0;
        x = CheckNumDouble(x);
        double y = 0;
        y = CheckNumDouble(y);
        String s = String.valueOf(GetColour(x, y));
       System.out.println(s);

    }

    public static SimpleColour GetColour(double x, double y) {
        if (P1.isPointAboveParabola(x, y) && !S1.isPointInSquare(x, y) && !S3.isPointInSquare(x, y) && !S2.isPointInSquare(x, y)){
            return SimpleColour.YELLOW;
        }
        else if (!P1.isPointAboveParabola(x, y) && !S1.isPointInSquare(x, y) && !S2.isPointInSquare(x, y) && !S3.isPointInSquare(x, y)){
            return SimpleColour.WHITE;
        }
        else if (!P1.isPointAboveParabola(x, y) && S1.isPointInSquare(x, y) && !S2.isPointInSquare(x, y) && !S3.isPointInSquare(x, y)){
            return SimpleColour.BLUE;
        }
        else if (!P1.isPointAboveParabola(x, y) && S2.isPointInSquare(x, y) && y > 0 && !S1.isPointInSquare(x, y) && !S3.isPointInSquare(x, y)){
            return SimpleColour.GREY;
        }
        else if (P1.isPointAboveParabola(x, y) && S2.isPointInSquare(x, y) && !S1.isPointInSquare(x, y) && !S3.isPointInSquare(x, y)){
            return SimpleColour.ORANGE;
        }
        else if (S3.isPointInSquare(x, y) && !S2.isPointInSquare(x, y) && !S1.isPointInSquare(x, y)){
            return SimpleColour.YELLOW;
        }
        return null;
    }

    public static double CheckNumDouble(double num){
        while (true){
            try {
                System.out.println("Введите координату от -10 до 10: ");
                String s = in.nextLine();
                if (num < 10 && num > -10){
                    num = Double.parseDouble(s);
                    return num;
                }
            }catch (Exception e){
                System.out.println("Попробуйте ещё раз!");
            }
        }
    }

}