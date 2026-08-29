/*
 * Problem: Word Search
 * TC: O(R × C × 3^L) — Try each cell as a starting point and explore up to 3
 *     unvisited directions for each character.
 * SC: O(L) — DFS recursion depth can reach the length of the word.
 */
package src.recursion.HardProblems;

public class p017WordSearch {
    public boolean exist(char[][]board, String word){
        int rows =  board.length;
        int cols = board[0].length;

        for(int i =0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(dfs(board, word, i , j , 0)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(char[][]board , String word, int i , int j , int idx){
        if(idx==word.length())return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!= word.charAt(idx)){
            return false;
        }
        char temp = board[i][j];
        board[i][j]='#';

        boolean found = dfs(board, word, i + 1, j, idx + 1) ||
                dfs(board, word, i - 1, j, idx + 1) ||
                dfs(board, word, i, j + 1, idx + 1) ||
                dfs(board, word, i, j - 1, idx + 1);

        board[i][j]= temp;
        return found;

    }
    public static void main(String[] args) {
        p017WordSearch sol = new p017WordSearch();
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        System.out.println(sol.exist(board, "ABCCED")); // true
        System.out.println(sol.exist(board, "SEE"));    // true
        System.out.println(sol.exist(board, "ABCB"));   // false
    }
}
