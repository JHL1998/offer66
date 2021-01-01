package com.luojianhua.day1;

/**
 * create by luojianhua
 * 剑指offer10、斐波那契数列
 */
public class Main6 {
    /**
     * 由于f(n)=f(n-1)+f(n-2),采用迭代法，自底向上
     * @param n
     * @return
     */
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int a=0,b=1;
        int MOD=((int)1e9)+7;
        for(int i=2;i<=n;i++){
            int c=(a+b)%MOD;
            a=b;
            b=c;
        }
        return b;
    }
}
