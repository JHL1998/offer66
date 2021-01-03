package com.luojianhua.day5;

/**
 * create by luojianhua
 * 剑指offer48、最长不含重复字符的子字符串
 */
public class Main7 {
    /**
     * 使用一个滑动窗口来记录不含重复字符的子字符串
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        int freq[]=new int[128];
        int i=0,j=0,res=0;
        while(j<s.length()){
            char c1=s.charAt(j);
            j++;
            freq[c1]++;
            while(freq[c1]>1){
                char c2=s.charAt(i);
                i++;
                freq[c2]--;
            }
            res=Math.max(res,j-i);
        }
        return res;
    }
}
