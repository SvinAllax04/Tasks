import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        InputArgs Args = Utils.parseCmdArgs(args);
        if (!Args.getAreFilesCorrect()) {
            System.err.println("Ошибка: введенные данные не корректны.");
            System.exit(0);
        }
        int[][] arr = Utils.getArrFromFile(Args.getInputFile());
//        int[][] arr = new int[][] {{5, 5, 5, 5, 5},
//                                    {1, 2, 3, 5, 3},
//                                    {3, 2, 2, 5, 7},
//                                    {10, 11, 10, 5, 12}};
        int[][] resArr = Utils.createNewArray(arr);
        Utils.writeArrayToFile(Args.getOutputFile(), resArr);
    }
}
