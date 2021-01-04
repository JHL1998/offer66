package com.luojianhua.day5;

/**
 * create by luojianhua
 * 剑指offer44、数字序列中某一位的数字
 */
public class Main3 {
    /**
     * 数字范围    数量  位数    占多少位
     *     1-9        9      1       9
     *     10-99      90     2       180
     *     100-999    900    3       2700
     *     1000-9999  9000   4       36000  ...
     *
     *     例如 2901 = 9 + 180 + 2700 + 12 即一定是4位数,第12位   n = 12;
     *     数据为 = 1000 + (12 - 1)/ 4  = 1000 + 2 = 1002
     *     定位1002中的位置 = (n - 1) %  4 = 3    s.charAt(3) = 2;
     * @param n
     * @return
     */
    public int findNthDigit(int n) {
        long start=1;
        long count=9;
        int dig=1;
       while(n>count){
           n-=count;
           dig++;
           start*=10;
           count=dig*start*9;
       }
       long num=start+(n-1)/dig;
       return Long.toString(num).charAt((n-1)%dig)-'0';
    }
}
