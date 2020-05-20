package com.luojianhua.day2;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Main11 {
    /**
     * 投机取巧
     * @param n
     * @return
     */
    public int NumberOf1(int n) {
        return Integer.bitCount(n);
    }
}
