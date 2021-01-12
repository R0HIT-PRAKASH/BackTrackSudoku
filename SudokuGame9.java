public class SudokuGame9 {
    int [][] board;
    Backtrack9 algo;

    public SudokuGame9(int [][] board){
        this.board = board;
        algo = new Backtrack9(this.board);
    }

    public boolean run(){
        int [] zero = nextZero();
        if (zero[0] == -1){
            return true;
        }
        int counter = 1;
        boolean valid = algo.isValid(counter, zero[0]+1, zero[1]+1);;
        while(!valid && counter < 10){
            counter += 1;
            valid = algo.isValid(counter, zero[0]+1, zero[1]+1);
        }
        if (counter == 10) {
            board[zero[0]][zero[1]] = 0;
            return false;
        }
        board[zero[0]][zero[1]] = counter;
        boolean correct = run();
        while (!correct){
            if(counter < 9){
                counter += 1;
                valid = algo.isValid(counter, zero[0]+1, zero[1]+1);;
                while(!valid && counter < 10){
                    counter += 1;
                    valid = algo.isValid(counter, zero[0]+1, zero[1]+1);
                }
                if (counter == 10) {
                    board[zero[0]][zero[1]] = 0;
                    return false;
                }
                board[zero[0]][zero[1]] = counter;
                correct = run();
            }
            else{
                board[zero[0]][zero[1]] = 0;
                return false;
            }
        }
        return true;
    }

    private int[] nextZero(){
        int [] coordinates = new int[2];
        for (int i = 0; i < 9; i ++){
            for (int j = 0; j < 9; j++){
                if (board[i][j] == 0){
                    coordinates[0] = i;
                    coordinates[1] = j;
                    return coordinates;
                }
            }
        }
        coordinates[0] = -1;
        coordinates[1] = -1;
        return coordinates;
    }
}


