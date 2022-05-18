public class Board {
    private int numRows;
    private int numColumns;

    private int isWinnerDeclared; // 0: Not declared, 1: Declared, 2: Draw

    private String[][] board;

    public Board () {
        numRows = 8;
        numColumns = 8;
        board = new String[numRows][numColumns];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                board[i][j] = "";
            }
        }

        isWinnerDeclared = 0;
    }

    public Board (int r, int c) {
        numRows = r;
        numColumns = c;
        board = new String[numRows][numColumns];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                board[i][j] = "";
            }
        }

        isWinnerDeclared = 0;
    }

    
    public boolean isVerticalConnected (int r, int c) {
        String color = board[r][c];
        int lower_limit = r - 3 >= 0 ? r - 3 : 0;
        int upper_limit = r + 3 <= 0 ? r + 3 : 7;
        
        for (int i = lower_limit; i <= upper_limit - 3; i++) {
            if (board[i][c].equals(color)) {
                if ((board[i+1][c].equals(color)) && (board[i+2][c].equals(color)) && (board[i+3][c].equals(color))) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean isHorizontalConnected (int r, int c) {
        String color = board[r][c];
        int lower_limit = c - 3 >= 0 ? c - 3 : 0;
        int upper_limit = c + 3 <= 7 ? c + 3 : 7;
        
        for (int i = lower_limit; i <= upper_limit - 3; i++) {
            if (board[r][i] == color) {
                if ((board[r][i+1].equals(color)) && (board[r][i+2].equals(color)) && (board[r][i+3].equals(color))) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean isLeftDiagonalConnected (int r, int c) {        
        String color = board[r][c];
        
        int lower_limit_r = r - 3 >= 0 ? r - 3 : 0;
        int upper_limit_r = r + 3 <= 7 ? r + 3 : 7;
        
        int lower_limit_c = c - 3 >= 0 ? c - 3 : 0;
        int upper_limit_c = c + 3 <= 7 ? c + 3 : 7;
        
        for (int i = lower_limit_r, j = lower_limit_c; i <= upper_limit_r - 3 && j <= upper_limit_c - 3; i++, j++) {
            if (board[i][j].equals(color)) {
                if (board[i + 1][j + 1].equals(color) && board[i + 2][j + 2].equals(color) && board[i + 3][j + 3].equals(color))
                return true;
            }
        }
        
        return false;
    }
    
    public boolean isRightDiagonalConnected (int r, int c) {
        String color = board[r][c];
        
        int lower_limit_r = r - 3 >= 0 ? r - 3 : 0;
        int upper_limit_r = r + 3 <= 7 ? r + 3 : 7;
        
        int lower_limit_c = c - 3 >= 0 ? c - 3 : 0;
        int upper_limit_c = c + 3 <= 7 ? c + 3 : 7;
        
        for (int i = upper_limit_r, j = lower_limit_c; i >= lower_limit_r + 3 && j <= upper_limit_c - 3; i--, j++) {
            if (board[i][j].equals(color)) {
                if (board[i - 1][j + 1].equals(color) && board[i - 2][j + 2].equals(color) && board[i - 3][j + 3].equals(color))
                return true;
            }
        }
        
        return false;
    }
    
    public boolean isConnected (int r, int c) {
        if (isHorizontalConnected(r, c) || isVerticalConnected(r, c) || isLeftDiagonalConnected(r, c) || isRightDiagonalConnected(r, c)) {
            return true;
        }
        
        return false;
    }
    
    public void pushMove (String color, int column) {
        int r = -1, c = -1;

        for (int i = numRows - 1; i >= 0; i--) {
            if (board[i][column - 1].equals("")) {
                board[i][column - 1] = color;
                r = i; c = column - 1;
                break;
            }
        }

        if (r != -1) {
            if(isConnected(r, c)) {
                isWinnerDeclared = 1;
            }
        }

        else {
            isWinnerDeclared = 2;
        }
    }
    
    public int getResult () {
        return isWinnerDeclared;
    }

    public String [][] getBoard() {
        return this.board;
    }

    public void showBoard () {
        for (int i = 0; i < this.numRows; i++) {
            for (int j = 0; j < this.numColumns; j++) {
                System.out.print(this.board[i][j] + " ");
            }
            System.out.println();
        }
    }
}