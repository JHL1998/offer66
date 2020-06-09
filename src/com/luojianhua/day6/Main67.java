package com.luojianhua.day6;

/**
 * 剪绳子
 */
public class Main67 {
    public int cutRope(int n) {
       if(n<3) return n-1;
       int res=1;
       while(n%3==1){
           n-=4;
           res*=4;
       }
       while(n%3==2){
           n-=2;
           res*=2;
       }
       while(n>0){
           n-=3;
           res*=3;
       }
       return res;
    }
}
