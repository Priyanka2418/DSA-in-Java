/*
Problem : Solve N_Queens
TC:  O(N!*N), we try all possible permutations of placing the queens and check for safety.
SC:  O(N^2 + N), additional space used for storing distinct boards and stack space.
 */
package src.recursion.HardProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p018NQueen {
    public boolean isSafe(int row , int col , int n , char[][]board){

        for(int j =0;j<col;j++){
            if(board[row][j]=='Q')return false;
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') return false;
        }
        return true;
    }
    public void solve(int col , char[][]board, List<List<String>> ans , int  n ){
        if (col == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, n, board)) {
                board[row][col] = 'Q';
                solve(col + 1, board, ans, n);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];


        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }


        solve(0, board, ans, n);
        return ans;
}

    public static void main(String[] args) {
        p018NQueen obj = new p018NQueen();
        int n = 4;
        List<List<String>> res = obj.solveNQueens(n);

        for (List<String> board : res) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
