package com.luojianhua.day4;

import java.util.*;
/**
 * create by luojianhua
 * 剑指offer38、字符串的排列
 */
public class Main7 {
    /**
     * 带有重复元素的全排列
     */
    private List<String>list=new ArrayList<>();
    private boolean vis[];
    public String[] permutation(String s) {
        vis=new boolean[s.length()];
        char c[]=s.toCharArray();
        Arrays.sort(c);
        dfs(c,0,new StringBuilder());
        String []res=new String[list.size()];
        for(int i=0;i<list.size();i++) res[i]=list.get(i);
        return res;
    }
    private void dfs(char c[],int index,StringBuilder sb){
        if(index==c.length){
            list.add(sb.toString());
            return ;
        }
        for(int i=0;i<c.length;i++){
            if(!vis[i]&&(i==0||c[i]!=c[i-1]||vis[i-1])){
                vis[i]=true;
                sb.append(c[i]);
                dfs(c,index+1,sb);
                vis[i]=false;
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
