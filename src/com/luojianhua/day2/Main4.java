package com.luojianhua.day2;

/**
 * create by luojianhua
 * 剑指offer16、数值的整数次方
 */
public class Main4 {
    /**
     * Java快速幂
     *  Integer.MIN_VALUE  用abs函数会溢出。。
     * @param x
     * @param n
     * @return
     */
    public double myPow(double x, int n) {
        if(x>1&&n==Integer.MIN_VALUE) return 0.0;
        else  if(n==Integer.MIN_VALUE) return 1.0;

        double res=1.0;
        int temp=Math.abs(n);
        while(temp!=0){
            if(temp%2==1) res*=x;
            x*=x;
            temp>>=1;
        }
        return n>0?res:1/res;
    }
}
