package com.luojianhua.day1;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n<=39
 */
public class Main7 {

    /**
     * 由于这里n<=39 ,递归也可以AC
     * 自顶向下 递归
     * @param n
     * @return
     */
    public int Fibonacci(int n) {
        if(n<=1) return n;
        return Fibonacci(n-1)+Fibonacci(n-2);

    }
}


class Main7_1 {

    /**
     * dp，自底向上
     *
     * @param n
     * @return
     */
    public int Fibonacci(int n) {
       if(n<=1) return n;
       int first=0;
       int second=1;
       for(int i=2;i<=n;i++){
           int sum=first+second;
           first=second;
           second=sum;
       }
       return second;

    }
}
