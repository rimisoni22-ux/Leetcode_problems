class Solution {

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {

                    for (char c = '1'; c <= '9'; c++) {

                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;

                            if (solve(board)) return true;

                            board[i][j] = '.'; // backtrack
                        }
                    }

                    return false; // no number fits
                }
            }
        }
        return true; // solved
    }

    private boolean isValid(char[][] board, int row, int col, char c) {

        for (int i = 0; i < 9; i++) {

            // row check
            if (board[row][i] == c) return false;

            // column check
            if (board[i][col] == c) return false;

            // 3x3 box check
            int r = 3 * (row / 3) + i / 3;
            int cc = 3 * (col / 3) + i % 3;

            if (board[r][cc] == c) return false;
        }

        return true;
    }
}