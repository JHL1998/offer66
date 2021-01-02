package com.luojianhua.day3;


/**
 * create by luojianhua
 * 剑指offer29、顺时针打印矩阵
 */
public class Main6 {
    /**
     * 模拟顺时针方向，当碰到边界时直接换方向
     * @param matrix
     * @return
     */
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0||matrix[0].length==0) return new int[0];
        int m=matrix.length,n=matrix[0].length;
        int res[]=new int[m*n];
        boolean vis[][]=new boolean[m+1][n+1];
        int a=0,b=0,d=1;
        int dx[]={-1,0,1,0};
        int dy[]={0,1,0,-1};
        int index=0;
        for(int i=0;i<m*n;i++){
            res[index++]=matrix[a][b];
            vis[a][b]=true;
            int x=a+dx[d],y=b+dy[d];
            //碰到边界位置时
            if(x<0||x>=m||y<0||y>=n||vis[x][y]){
                d=(d+1)%4;
                x=a+dx[d];
                y=b+dy[d];
            }
            a=x;
            b=y;
        }
        return res;
    }
}
