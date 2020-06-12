package com.luojianhua.day3;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class Main27 {
    /**
     * 要求不能重复，在这里我们利用set去重
     * @param str
     * @return
     */
    private ArrayList<String>res=new ArrayList<>();
    private StringBuilder sb=new StringBuilder();
    private char []ch;
    public ArrayList<String> Permutation(String str) {
         if(str==null||str.length()==0) return res;
         ch=str.toCharArray();
         boolean []vis=new boolean[ch.length];
         dfs(ch,vis);
         return res;
    }
    private void dfs(char[]ch,boolean vis[]){
         if(sb.length()==ch.length){
             res.add(sb.toString());
         }

        Set<Character> set=new HashSet<>();
         for(int i=0;i<ch.length;i++){
             if(vis[i]==false){
                 if(set.contains(ch[i])) continue;
                 vis[i]=true;
                 sb.append(ch[i]);
                 set.add(ch[i]);
                 dfs(ch,vis);
                 vis[i]=false;
                 sb.deleteCharAt(sb.length()-1);
             }
         }
    }
}
