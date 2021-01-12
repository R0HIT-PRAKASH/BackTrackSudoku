import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String [] args){
//        int [][] board = {{3, 4, 1, 0}, {0, 2, 0, 0}, {0, 0, 2, 0}, {0, 1, 4, 3}};
//        int [][] board = {{3, 0, 4, 0}, {0, 1, 0, 2}, {0, 4, 0, 3}, {2, 0, 1, 0}};
//        int [][]board = {{2, 0, 0, 0}, {0, 1, 0, 2}, {0, 0, 3, 0}, {0, 0, 0, 4}};
//        int [][]board = {{0, 0, 1, 0}, {4, 0, 0, 0}, {0, 0, 0, 2}, {0, 3, 0, 0}};
//        SudokuGame4 game = new SudokuGame4(board);
//        int [][] board = {{5, 3, 0, 0, 7, 0, 0, 0, 0}, {6, 0, 0, 1, 9, 5, 0, 0, 0}, {0, 9, 8, 0, 0, 0, 0, 6, 0},
//                {8, 0, 0, 0, 6, 0, 0, 0, 3}, {4, 0, 0, 8, 0, 3, 0, 0, 1}, {7, 0, 0, 0, 2, 0, 0, 0, 6},
//                {0, 6, 0, 0, 0, 0, 2, 8, 0}, {0, 0, 0, 4, 1, 9, 0, 0, 5}, {0, 0, 0, 0, 8, 0, 0, 7, 9}};
//        int [][] board = {{0, 0, 0, 8, 0, 0, 0, 0, 0}, {7, 8, 9, 0, 1, 0, 0, 0, 6}, {0, 0, 0, 0, 0, 6, 1, 0, 0},
//                {0, 0, 7, 0, 0, 0, 0, 5, 0}, {5, 0, 8, 7, 0, 9, 3, 0, 4}, {0, 4, 0, 0, 0, 0, 2, 0, 0},
//                {0, 0, 3, 2, 0, 0, 0, 0, 0}, {8, 0, 0, 0, 7, 0, 4, 3, 9}, {0, 0, 0, 0, 0, 1, 0, 0, 0}};
//        int[][] board = {{1, 1, 1, 1, 1, 1, 1, 1, 1}, {7, 8, 9, 0, 1, 0, 0, 0, 6}, {0, 0, 0, 0, 0, 6, 1, 0, 0},
//                {0, 0, 7, 0, 0, 0, 0, 5, 0}, {5, 0, 8, 7, 0, 9, 3, 0, 4}, {0, 4, 0, 0, 0, 0, 2, 0, 0},
//                {0, 0, 3, 2, 0, 0, 0, 0, 0}, {8, 0, 0, 0, 7, 0, 4, 3, 9}, {0, 0, 0, 0, 0, 1, 0, 0, 0}};
        int [][] board = readIn(9);
        SudokuGame9 game = new SudokuGame9(board);
        for (int[] value : board) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(value[j] + "   ");
            }
            System.out.println();
        }
        boolean truth = game.run();
        System.out.println();
        System.out.println();
        if (truth) {
            for (int[] ints : board) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(ints[j] + "   ");
                }
                System.out.println();
            }
        }
        else{
//            for (int[] ints : board) {
//                for (int j = 0; j < board.length; j++) {
//                    System.out.print(ints[j] + "   ");
//                }
//                System.out.println();
//            }
            System.out.println("invalid");
        }
    }

    public static int[][] readIn(int length){
        int[][] board = new int[length][length];
        for (int i = 0; i < length; i++){
            int sum = i+1;
            System.out.println("Enter column " + sum + " here: ");
            for (int j = 0; j < length; j++){
                int num = input.nextInt();
                board[i][j] = num;
            }
            System.out.println();
        }
        return board;
    }
}
