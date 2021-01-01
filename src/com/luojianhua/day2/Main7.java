package com.luojianhua.day2;

/**
 * create by luojianhua
 */
public class Main7 {
    /**
     *  与'*'匹配，存在两种情况
     *  1、'*'号匹配0个字符，此时我们直接砍掉p的前两个字符
     *  2、'*'号匹配1个或多个字符，此时我们要确认二者首字母是否匹配，然后砍掉s的首字母继续匹配
     * @param s
     * @param p
     * @return
     */
    public boolean isMatch(String s, String p) {
        boolean f[][]=new boolean[s.length()+1][p.length()+1];
        f[0][0]=true;
        //当s字符串为空时
        for(int j=2;j<=p.length();j++) {
            //砍掉j的前两个字符
            if(p.charAt(j-1)=='*') f[0][j]=f[0][j-2];
        }
        for(int i=0;i<s.length();i++){
            for(int j=0;j<p.length();j++){
                if(p.charAt(j)=='*')
                    f[i+1][j+1]=f[i+1][j-1]||(first_match(s,p,i,j-1)&&f[i][j+1]);
                else  f[i+1][j+1]=first_match(s,p,i,j)&&f[i][j];
            }
        }
        return f[s.length()][p.length()];
    }
    private boolean first_match(String s,String p,int i,int j){
        return s.charAt(i)==p.charAt(j)||p.charAt(j)=='.';
    }
}
