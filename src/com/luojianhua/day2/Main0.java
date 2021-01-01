package com.luojianhua.day2;

/**
 * create by luojianhua
 * 剑指offer13、机器人的运动范围
 */
public class Main0 {

    /**
     * 从左上角出发，实际上机器人只能向下和向右走
     * @param m
     * @param n
     * @param k
     * @return
     */
    public int movingCount(int m, int n, int k) {
        boolean vis[][]=new boolean[m+1][n+1];
        return dfs(m,n,0,0,k,vis);
    }
    private int dfs(int m,int n,int x,int y,int k,boolean [][]vis){
        if(x<0||x>=m||y<0||y>=n||vis[x][y]||(x%10+x/10+y%10+y/10)>k) return 0;
        vis[x][y]=true;
        return 1+dfs(m,n,x+1,y,k,vis)+dfs(m,n,x,y+1,k,vis);
    }
}
