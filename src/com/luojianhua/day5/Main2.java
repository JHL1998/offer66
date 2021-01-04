package com.luojianhua.day5;

/**
 * create by luojianhua
 * 剑指offer43、1~n整数中1出现的次数
 */
public class Main2 {

    public int countDigitOne(int n) {
        return f(n);
    }

    /**
     * 如果最高位为1，举个例子 1234 其中1-999中1出现的个数为f(cur-1)
     * 然后1000到1234中 千分位中1所出现的次数为234+1 即 1+last，
     * 剩下的为234中1出现的次数，即 f(last)即 总共为 f(cur-1)+1+last+f(last)
     *
     * 如果最高位不是1，举个例子 2345 其中1-999中1出现的次数为f(cur-1)，
     * 然后1000-1999中千分位中1出现的次数为1000，即cur，
     * 然后 后面剩下的1出现的次数为f(cur-1) 最后算2000-2345中出现的次数为f(last)，
     * 即f(cur-1)*high+cur+f(last)
     * @param n
     * @return
     */
    private int f(int n){
        if(n<=0) return 0;
        String s=String.valueOf(n);
        int high=s.charAt(0)-'0';
        int cur=(int)Math.pow(10,s.length()-1);
        int last=n-high*cur;
        if(high==1) return f(cur-1)+1+last+f(last);
        else return f(cur-1)*high+cur+f(last);
    }
}
