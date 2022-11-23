//Problem Statement URL: https://leetcode.com/problems/valid-sudoku/

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    if(!isValid(board,i,j,board[i][j])) return false;
                }
            }
        }
        return true;
    }
    public boolean isValid(char board[][],int row,int col,char ch)
    {
        for(int i=0;i<9;i++)
        {
            if(board[row][i]==ch && i!=col) return false;
            if(board[i][col]==ch && i!=row) return false;
            int x=3*(row/3)+i/3, y=3*(col/3)+i%3;  //checking 3*3 grid
            if(board[x][y]==ch && !(x==row && y==col)) return false;
        }
        return true;
    }
}
