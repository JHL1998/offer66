package com.luojianhua.day2;

/**
 * create by luojianhua
 * 剑指offer20、表示数值的字符串
 */
public class Main8 {
    public boolean isNumber(String s){
           s=s.trim();
           if(s==null||s.length()==0) return false;
           if(s.charAt(0)=='+'||s.charAt(0)=='-') s=s.substring(1);
           //+.  -. 的情况
           if(s.isEmpty()||(s.length()==1&&s.charAt(0)=='.')) return false;
           int dot=0,e=0;
           for(int i=0;i<s.length();i++){
               if(s.charAt(i)>='0'&&s.charAt(i)<='9') ;
               else if(s.charAt(i)=='.') {
                   dot++;
                   //不可能出现两个. 或者 e在.的前面
                   if(dot>1||e>0) return false;
               }
               else if(s.charAt(i)=='e'||s.charAt(i)=='E'){
                   e++;
                   //e的前后要有数字， 并且排除.e的情况
                   if(i==0||i==s.length()-1||e>1||s.charAt(i-1)=='.'&&i==1) return false;
                   //+e -e 后面要有数字
                   if(s.charAt(i+1)=='+'||s.charAt(i+1)=='-') {
                       if(i+2==s.length()) return false;
                       i++;
                   }
               }else return false;

           }
           return true;
    }
}
