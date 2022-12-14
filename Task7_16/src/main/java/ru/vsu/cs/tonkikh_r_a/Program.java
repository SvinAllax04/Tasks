package ru.vsu.cs.tonkikh_r_a;

import java.util.Scanner;

public class Program {

    private static Scanner in = new Scanner(System.in);

    public static int checkArr(int num){
        while (true){
            System.out.printf("Введите число от -1000 до 1000: ", num);
            String s = in.nextLine();
            try{
                return Integer.parseInt(s);
            } catch (Exception ex){
                System.out.println("Неверное значение!");
            }
        }
    }

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

    public static void main(String args[]){
        int count = checkLenArr("Введите кол-во элементов массива: ");
        int[] arr = new int[count];
        for (int i = 0; i < count; i++){
            int x = checkArr(i + 1);
            arr[i] = x;
        }
        int max = -1001;
        int min = 1001;
        int pos_max = 0;
        int pos_min = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= max) {

                pos_max = i;
                max = arr[i];

            }
            if (arr[i] <= min) {

                pos_min = i;
                min = arr[i];

            }


        }

        System.out.print("Введённый массив: ");

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }

        System.out.println();
        System.out.println();
        System.out.print("Результат: ");

        if (pos_max > pos_min){

            if (arr.length - 1 == pos_max) {
                if (arr[pos_max-1] == arr[pos_max]){
                   for (int i = 1; i < arr.length; i++){
                       if (arr[pos_max - i] != min && arr[pos_max - i] != max){
                           System.out.print(arr[pos_max - i]);
                           break;
                       }
                   }
                }else{
                    System.out.print(arr[pos_max - 1]);
                }
            } else{
                System.out.print(arr[pos_max + 1]);
            }

        } else{

            if (arr.length - 1 == pos_min){
                if (arr[pos_min-1] == arr[pos_min]){
                    for (int i = 1; i < arr.length; i++){
                        if (arr[pos_min - i] != min && arr[pos_min - i] != max){
                            System.out.print(arr[pos_min - i]);
                            break;
                        }
                    }
                }else{
                    System.out.print(arr[pos_min - 1]);
                }
            } else{
                System.out.print(arr[pos_min + 1]);
            }

        }
    }
}

