package com.luojianhua.day4;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
 */
public class Main34 {

    /**
     * 哈希表
     * @param str
     * @return
     */
        public int FirstNotRepeatingChar(String str) {
            int freq[]=new int[128];
            for(int i=0;i<str.length();i++){
                freq[str.charAt(i)]++;

            }
            for(int i=0;i<str.length();i++){
                if(freq[str.charAt(i)]==1) return i;
            }
            return -1;
        }

}
