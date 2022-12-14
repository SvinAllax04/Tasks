package ru.vsu.cs.tonkikh_r_a.task8_13;

import java.util.Scanner;

public class Program {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int line = 2;
        int col = 2;
        int same_i = 0;
        int same_j = 0;
        int[][] arr1 = new int[line][col];
        int[][] arr2 = new int[line][col];
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[1][0] = 1;
        arr1[1][1] = 3;
        for(int i = 0; i < line-1; i++){
            for (int j = 0; j < col-1; j++){

                if (arr1[i][j] == arr1[i+1][j]){ //проверка по столбцам

                    same_i++;

                }

                if (arr1[i][j] == arr1[i][j+1]){ //проверка по строкам

                    same_j++;

                }

                if (same_i == line){

                    arr2[i][j] = arr1[i+1][j];
                    arr1[i+1][j] = 0;

                }

                if (same_j == col){

                    arr2[i][j] = arr1[i][j+1];
                    arr1[i][j+1] = 0;

                }

            }
            }
        }

    public static int CheckArr(int num){
        while (true){
            System.out.print("Введите кол-во строк/столбцов: ");
            String s = in.nextLine();
            try{
                return Integer.parseInt(s);
            }catch (Exception e){
                System.out.println("Неверное значение!");
            }
        }


    }
}