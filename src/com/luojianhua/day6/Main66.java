package com.luojianhua.day6;

/**
 * 机器人的运动范围
 */
public class Main66 {
    public int movingCount(int k, int m, int n)
    {
         boolean [][]vis=new boolean[m][n];
         return dfs(k,m,n,0,0,vis);
    }
    private  int dfs(int k,int m,int n,int i,int j,boolean[][]vis){
             if(i<0||i>=m||j<0||j>=n||(i%10+i/10+j%10+j/10)>k||vis[i][j]==true) return 0;
             vis[i][j]=true;
             return dfs(k,m,n,i+1,j,vis)+dfs(k,m,n,i,j+1,vis)+1;
    }
}
