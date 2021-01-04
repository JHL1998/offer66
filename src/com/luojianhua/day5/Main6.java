package com.luojianhua.day5;

/**
 * create by luojianhua
 * 剑指offer47、礼物的最大价值
 */
public class Main6 {
    /**
     * f[i][j]代表从起点到i,j能拿到的最大价值
     * @param grid
     * @return
     */
    public int maxValue(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int f[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0&&j==0) f[i][j]=grid[i][j];
                else if(i==0) f[i][j]=f[i][j-1]+grid[i][j];
                else if(j==0) f[i][j]=f[i-1][j]+grid[i][j];
                else f[i][j]=Math.max(f[i-1][j],f[i][j-1])+grid[i][j];
            }
        }
        return f[m-1][n-1];
    }
}
