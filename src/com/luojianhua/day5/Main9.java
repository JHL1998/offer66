package com.luojianhua.day5;

/**
 * create by luojianhua
 * 剑指offer50、第一个只出现一次的字符
 */
public class Main9 {
    /**
     * 哈希表查找
     * @param s
     * @return
     */
    public char firstUniqChar(String s) {
        if(s==null||s.length()==0) return ' ';
        int freq[]=new int[128];
        for(char c:s.toCharArray()) freq[c]++;
        for(char c:s.toCharArray()){
            if(freq[c]==1) return c;
        }
        return ' ';
    }
}
