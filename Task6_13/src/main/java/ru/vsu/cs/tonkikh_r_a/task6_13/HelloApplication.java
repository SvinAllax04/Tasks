package ru.vsu.cs.tonkikh_r_a.task6_13;

import java.util.Scanner;

public class HelloApplication {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        double x;
        while (true){

            x = CheckDouble("x");

            if (x >= -1 && x <= 1){

                break;

            }

            System.out.println("Значение x должно быть от -1 до 1!");

        }

        int n = CheckNum("n");
        double e = CheckDouble("e");

        SumNum(x, e, n);

    }

    public static void SumNum(double x, double e, int n){

        double es = 0;
        double est = 0;
        double ch = 1;
        double sum = 0;
        double first = 1/Math.pow(2, x+1);

        for (int i = 0; i < n; i++){
            if (i == 0){

                double p = 1;

                if (Math.abs(p) > e){

                    es += 1;

                }
                if (Math.abs(p) > e/10){

                    est += 1;

                }

                sum = 1;

            }
            if (i > 0){

                ch = i * Math.pow(i - 1, x);
                sum += ch;

            }

        }
        System.out.println(sum);
        System.out.println(es);
        System.out.println(est);
        System.out.println(first);
    }

    public static int CheckNum(String num){

        while (true){

            System.out.printf("Введите %s:", num);
            String s = in.nextLine();
            try{

                return Integer.parseInt(s);

            } catch (Exception e){

                System.out.println("Неверное значение, попробуйте ещё раз.");

            }

        }

    }

    public static double CheckDouble(String num){

        while (true){

            System.out.printf("Введите %s:", num);
            String s = in.nextLine();
            try{

                return Double.parseDouble(s);

            } catch (Exception e){

                System.out.println("Неверное значение, попробуйте ещё раз. Введите значение от -1 до 1.");

            }

        }

    }


}
