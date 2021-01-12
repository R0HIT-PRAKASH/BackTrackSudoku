public class Backtrack9 {
    int [][] board;

    public Backtrack9(int [][] board){
        this.board = board;
    }


    public boolean isValid(int currNum, int row, int column){
        return checkBox(currNum, row, column) && checkColumn(currNum, row, column) && checkRow(currNum, row, column);
    }

    private boolean checkBox(int currNum, int row, int column){
        int box;
        int [] nums = new int[2];
        if (row < 4 && column < 4){
            box = 1;
            nums[0] = 4;
            nums[1] = 4;
        }
        else if (row < 4 && column < 7){
            box = 2;
            nums[0] = 4;
            nums[1] = 7;
        }
        else if (row < 4 && column < 10){
            box = 3;
            nums[0] = 4;
            nums[1] = 10;
        }
        else if (row < 7 && column < 4){
            box = 4;
            nums[0] = 7;
            nums[1] = 4;
        }
        else if (row < 7 && column < 7){
            box = 5;
            nums[0] = 7;
            nums[1] = 7;
        }
        else if (row < 7 && column < 10){
            box = 6;
            nums[0] = 7;
            nums[1] = 10;
        }
        else if (row < 10 && column < 4){
            box = 7;
            nums[0] = 10;
            nums[1] = 4;
        }
        else if (row < 10 && column < 7){
            box = 8;
            nums[0] = 10;
            nums[1] = 7;
        }
        else{
            box = 9;
            nums[0] = 10;
            nums[1] = 10;
        }
        for (int i = nums[0]-3; i < nums[0]; i++) {
            for (int j = nums[1] - 3; j < nums[1]; j++) {
                if (i != row || j != column) {
                    if (board[i - 1][j - 1] == currNum) return false;
                }
            }
        }
                return true;
//        if (box == 1){
//            for (int i = 1; i < 4; i++){
//                for (int j = 1; j < 3; j++){
//                    if (i!=row || j!=column){
//                        if (board[i-1][j-1] == currNum) return false;
//                    }
//                }
//            }
//        }
//        else if (box == 2){
//            for (int i = 1; i < 3; i++){
//                for (int j = 3; j < 5; j++){
//                    if (i!=row || j!=column){
//                        if (board[i-1][j-1] == currNum) return false;
//                    }
//                }
//            }
//        }
//        else if (box == 3){
//            for (int i = 3; i < 5; i++){
//                for (int j = 1; j < 3; j++){
//                    if (i!=row || j!=column){
//                        if (board[i-1][j-1] == currNum) return false;
//                    }
//                }
//            }
//        }
//        else if (box == 4){
//            for (int i = 3; i < 5; i++){
//                for (int j = 3; j < 5; j++){
//                    if (i!=row || j!=column){
//                        if (board[i-1][j-1] == currNum) return false;
//                    }
//                }
//            }
//        }
//        return true;
    }

    private boolean checkRow(int currNum, int row, int column){
        for (int i = 1; i < 10; i++){
            if(column != i && board[row-1][i-1] == currNum) return false;
        }
        return true;
    }

    private boolean checkColumn(int currNum, int row, int column){
        for (int i = 1; i < 10; i++){
            if(row != i && board[i-1][column-1] == currNum) return false;
        }
        return true;
    }
}
