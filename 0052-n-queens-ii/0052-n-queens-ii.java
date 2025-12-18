class Solution {
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        return solve(board, 0);
    }

    private int solve(char[][] board, int row) {
        if (row == board.length) {
            return 1;
        }

        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'q';
                count += solve(board, row + 1);
                board[row][col] = '.';
            }
        }
        return count;
    }

    private boolean isSafe(char[][] board, int row, int col) {
        // Check column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'q') return false;
        }

        // Check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'q') return false;
        }

        // Check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'q') return false;
        }

        return true;
    }
}
