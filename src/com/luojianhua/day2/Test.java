package com.luojianhua.day2;

import java.util.Scanner;

public class Test {
    private static int g[][];
    private static int parent[];
    private static int res;
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int m=input.nextInt();
         int n=input.nextInt();
         int k=input.nextInt();
         g=new int[k][2];
         for(int i=0;i<k;i++){
             int x=input.nextInt();
             int y=input.nextInt();
             g[i][0]=x;
             g[i][1]=y;
         }
         parent=new int[m*n+1];
         for(int i=0;i<parent.length;i++){
             parent[i]=i;
         }

         for(int i=0;i<k;i++){
             union(g[i][0],g[i][1]);
         }

        res=0;
         for(int i=0;i<parent.length;i++){
             if(i!=parent[i]) res++;
         }
        System.out.println(m*n-res);


    }
    private static void union(int p ,int q){
        int pRoot=find(p);
        int qRoot=find(q);
        parent[pRoot]=qRoot;
    }
    private static int find(int p){
        while(p!=parent[p]){
            parent[p]=parent[parent[p]];
            p=parent[p];
        }
        return p;
    }
}
