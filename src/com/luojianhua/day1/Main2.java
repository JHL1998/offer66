package com.luojianhua.day1;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Main2 {
    /**
     * 直接利用java API
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
        return String.valueOf(str).replace(" ","%20").toString();
    }
}


class Main2_1 {
    /**
     * 自己实现替换函数
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ') sb.append("%20");
            else sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
