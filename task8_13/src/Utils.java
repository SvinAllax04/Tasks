import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Utils {
    public static int[][] getArrFromFile(String fileName) {
        int [][] arr = {};
        try (var sc = new Scanner(new BufferedReader(new FileReader(fileName)))) {
            int h = Integer.parseInt(sc.nextLine().trim());
            int w = Integer.parseInt(sc.nextLine().trim());
            arr = new int[h][w];
            while (sc.hasNextLine()) {
                for (int i = 0; i < h; i++) {
                    String[] line = sc.nextLine().trim().split(" ");
                    for (int j = 0; j < w; j++) {
                        arr[i][j] = Integer.parseInt(line[j]);
                    }
                }
            }
        } catch (Exception e) {
        }
        return arr;
    }

    public static boolean writeArrayToFile(String fileName, int[][] arr) throws IOException {
        if (arr.length == 0) return false;
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(Integer.toString(arr.length) + '\n');
        writer.write(Integer.toString(arr[0].length) + '\n');
        for (int i = 0; i < arr.length; i++) {
            String resString = "";
            for (int j = 0; j < arr[i].length; j++) {
                resString += Integer.toString(arr[i][j]);
                if (j != arr[i].length - 1) resString += " ";
            }
            writer.write(resString + "\n");
        }
        writer.close();
        return true;
    }

    public static int[][] createNewArray(int[][] arr) {
        int height = getCountOfNotEqualRows(arr);
        int width = getCountOfNotEqualColumns(arr);
        int[][] resultArr = new int[height][width];

        int currentI = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isRowEqual(arr, i))
                continue;

            int currentJ = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (!isColumnEqual(arr, j)) {
                    resultArr[currentI][currentJ] = arr[i][j];
                    currentJ++;
                }
            }

            currentI++;
        }

        return resultArr;
    }

    public static int getCountOfNotEqualRows(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!isRowEqual(arr, i))
                count++;
        }

        return count;
    }

    public static boolean isRowEqual(int[][] arr, int row) {
        int prevEl = arr[row][0];
        for (int j = 1; j < arr[row].length; j++) {
            if (arr[row][j] != prevEl)
                return false;
        }

        return true;
    }

    public static int getCountOfNotEqualColumns(int[][] arr) {
        int count = 0;
        for (int j = 0; j < arr[0].length; j++) {
            if (!isColumnEqual(arr, j))
                count++;
        }

        return count;
    }

    public static boolean isColumnEqual(int[][] arr, int column) {
        int prevEl = arr[0][column];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][column] != prevEl)
                return false;
        }

        return true;
    }

    public static InputArgs parseCmdArgs(String[] args) {
        InputArgs Args = new InputArgs();
        try {
            String inputFile = args[0];
            String outputFile = args[1];
            if (!checkIfFileExists(inputFile)) {
                throw new Exception();
            }
            assert !checkIfFileExists(inputFile);
            Args.setInputFile(inputFile);
            Args.setOutputFile(outputFile);
        } catch (Exception ex) {
            Args.setAreFilesCorrect(false);
        }
        return Args;
    }

    public static boolean checkIfFileExists(String fileName) {
        File f = new File(fileName);
        return f.exists();
    }
}