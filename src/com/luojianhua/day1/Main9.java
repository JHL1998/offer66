package com.luojianhua.day1;

/**
 * create by luojianhua
 * 剑指offer12、矩阵中的路径
 */
public class Main9 {
    /**
     * 搜索题，简单的dfs+回溯
     */
    private int m,n;
    public boolean exist(char[][] board, String word) {
        m=board.length;
        n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dfs(i,j,board,0,word)) return true;
            }
        }
        return false;
    }
    private boolean dfs(int x,int y,char[][]board,int index,String word){
        if(board[x][y]!=word.charAt(index)) return false;
        if(index==word.length()-1) return true;
        int dx[]={-1,0,1,0};
        int dy[]={0,1,0,-1};
        board[x][y]='.';
        for(int k=0;k<4;k++){
            int a=x+dx[k],b=y+dy[k];
            if(a>=0&&a<m&&b>=0&&b<n){
                if(dfs(a,b,board,index+1,word)) return true;
            }
        }
        board[x][y]=word.charAt(index);
        return false;
    }
}
