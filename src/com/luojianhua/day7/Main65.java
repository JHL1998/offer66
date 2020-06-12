package com.luojianhua.day7;

/**
 * 矩阵中的路径
 */
public class Main65 {
    public boolean hasPath(char[] matrix, int m, int n, char[] str)
    {
        if(matrix.length==0) return false;
        boolean[]vis=new boolean[m*n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int cur=i*n+j;
                if(matrix[cur]==str[0]){
                    if(dfs(matrix,i,j,m,n,str,0,vis)) return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(char[]matrix,int i,int j,int m,int n,char[]str,int index,boolean[]vis){
          if(index==str.length) return true;
          int cur=i*n+j;
          if(i<0||i>=m||j<0||j>=n||vis[cur]==true||matrix[cur]!=str[index]) return false;
          vis[cur]=true;
          boolean flag=dfs(matrix,i+1,j,m,n,str,index+1,vis)||
                  dfs(matrix,i-1,j,m,n,str,index+1,vis)||
                  dfs(matrix,i,j+1,m,n,str,index+1,vis)||
                  dfs(matrix,i,j-1,m,n,str,index+1,vis);
          vis[cur]=false;
          return flag;
    }
}
