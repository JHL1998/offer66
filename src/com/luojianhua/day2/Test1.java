package com.luojianhua.day2;

import java.util.Scanner;

public class Test1 {
    static int m, n, k;
    static int[] id;
    static int count;
    static int[][] data;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        k = sc.nextInt(); // 接来下k行数据

        id = new int[m*n+1];
        count = m*n;

        data = new int[k][2];

        for(int i=0;i<k;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            data[i][0] = x;
            data[i][1] = y;
        }

        //初始化数组
        for(int i=1;i<id.length;i++){
            id[i] = i;
        }

        for(int i=0;i<data.length;i++){
            union(data[i][0],data[i][1]);
        }
        System.out.println(count);
    }

    //找到p的根
    public static int find(int p){
        while(p!=id[p])
            p = id[p];
        return p;
    }

    public static void union(int i,int j){
        int iRoot = find(i);
        int jRoot = find(j);
        if(iRoot==jRoot){
            return;
        }else{
            //id[iRoot] = jRoot;
            id[jRoot] = iRoot;
            count--;
        }
    }
}
