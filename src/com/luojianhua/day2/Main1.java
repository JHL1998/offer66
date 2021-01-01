package com.luojianhua.day2;

/**
 * create by luojianhua
 * 剑指offer14、剪绳子
 */
public class Main1 {
    /**
     * 结论：剪出的绳子中最多出现2段2，如果出现3段2， 3*3>2*2*2;
     *  其它的用3补。  如果长为5 2*3>1*4
     * @param n
     * @return
     */
    public int cuttingRope(int n) {
        if(n<=3) return n-1;
        long res=1L;
        while(n>4){
            n-=3;
            res*=3;
        }
        return (int)(n*res);
    }
}
