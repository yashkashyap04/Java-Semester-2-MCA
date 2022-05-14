public class Board {
    private int numRows;
    private int numColumns;

    private boolean isWinnerDeclared;

    private char[][] board;

    public Board () {
        numRows = 8;
        numColumns = 8;
        board = new char[numRows][numColumns];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                board[i][j] = '*';
            }
        }

        isWinnerDeclared = false;
    }

    public Board (int r, int c) {
        numRows = r;
        numColumns = c;
        board = new char[numRows][numColumns];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                board[i][j] = '*';
            }
        }

        isWinnerDeclared = false;
    }

    public void pushMove (char color, int column) {
        for (int i = numRows - 1; i >= 0; i--) {
            if (board[i][column - 1] != '*') {
                board[i][column - 1] = color;
            }
        }
    }

    public boolean isVerticalConnected (int r, int c) {
        char color = board[r][c];
        int lower_limit = r - 3 >= 0 ? r - 3 : 0;
        int upper_limit = r + 3 <= 0 ? r + 3 : 7;
        
        for (int i = lower_limit; i <= upper_limit; i++) {
            if (board[i][c] == color) {
                if ((board[i+1][c] == color) && (board[i+2][c] == color) && (board[i+3][c] == color)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isHorizontalConnected (int r, int c) {
        char color = board[r][c];
        int lower_limit = c - 3 >= 0 ? c - 3 : 0;
        int upper_limit = c + 3 <= 7 ? c + 3 : 7;

        for (int i = lower_limit; i <= upper_limit; i++) {
            if (board[r][i] == color) {
                if ((board[r][i+1] == color) && (board[r][i+2] == color) && (board[r][i+3] == color)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isLeftDiagonalConnected (int r, int c) {

        // r * * * * * * *
        // * b * * * * * *
        // * * b * * * * *
        // * * * b * * * *
        // * * * * b * * *
        // * * * * * r * *
        // * * * * * * r *
        // * * * * * * * r
        
        char color = board[r][c];

        int lower_limit_r = r - 3 >= 0 ? r - 3 : 0;
        int upper_limit_r = r + 3 <= 0 ? r + 3 : 0;

        int lower_limit_c = c - 3 >= 0 ? c - 3 : 0;
        int upper_limit_c = c + 3 <= 7 ? c + 3 : 7;

        
    }

    public boolean isConnected (int r, int c) {
        board[r][c];
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
