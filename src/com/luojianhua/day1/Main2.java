package com.luojianhua.day1;

/**
 * create by luojianhua
 * 剑指offer05、替换空格
 */
public class Main2 {
    /**
     *先统计空格的数量计算出新字符串的长度，然后依次替换即可
     * @param s
     * @return
     */
    public  String replaceSpace(String s) {
           StringBuilder sb=new StringBuilder(s);
           int count=0;
           int len=s.length();
           for(char c:s.toCharArray()){
               if(c==' ')count++;
           }
           int newLen=len+count*2;
           int i=len-1,j=newLen-1;
           sb.setLength(newLen);
           while(i>=0){
               if(sb.charAt(i)==' '){
                   sb.setCharAt(j--,'0');
                   sb.setCharAt(j--,'2');
                   sb.setCharAt(j--,'%');
               }
               else sb.setCharAt(j--,sb.charAt(i));
               i--;
           }
           return sb.toString();
    }



}
