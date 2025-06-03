package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueenProblem {
    public static void main(String[] args) {
        int n=4;
      List<List<String>>queen= solveQueen( n);
      int i=1;
      for(List<String> it :queen){
          System.out.println(it);
      }

    }

    private static  List<List<String>>solveQueen(int n) {
        char[][]board=new char[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                board[i][j]='.';
        List<List<String>>res=new ArrayList<List<String>>();
        dfs(0,board,res);
        return  res;

    }

    private static void dfs(int col, char[][] board, List<List<String>> res) {
        if(col==board.length){
            res.add(construct(board));
            return;
        }
        for(int row=0;row<board.length;row++){
            if(validate(board,row,col))
                board[row][col]='Q';
               dfs(col+1,board,res);
               board[row][col]='.';

        }
    }

    private static List<String> construct(char[][] board) {
        List<String> res=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String s=new String(board[i]);
            res.add(s);
        }
        return res;
    }

    private static boolean validate(char[][] board, int row, int col) {
        int duprow=row,dupcol=col;
        //check the diagonally that queen is present or not
        while(row>=0 && col>=0){
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        row=duprow;
        col=dupcol;
        //check the previous column in the same row contain  the queen or not (check the same row contain queen);
        while(col>=0){
            if(board[row][col]=='Q')return false;
            col--;
        }

        //check the  colum contain the queen for not
        row=duprow;
        col=dupcol;
        while(col>=0 && row<board.length){
            if(board[row][col]=='Q') return false;
            col--;
            row++;
        }
       return  true;
    }
}
