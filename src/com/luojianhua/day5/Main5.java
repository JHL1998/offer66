package com.luojianhua.day5;

/**
 * create by luojianhua
 * 剑指offer46、把数字翻译成字符串
 */
public class Main5 {
    /**
     * 先将数字转为字符串
     * 其中f[i]代表将前i个数字翻译的方法数量
     * @param num
     * @return
     */
    public int translateNum(int num) {
        String s=String.valueOf(num);
        int n=s.length();
        int f[]=new int [n+1];
        f[0]=f[1]=1;
        for(int i=2;i<=n;i++){
            f[i]=f[i-1];
            if(s.charAt(i-2)=='1'||(s.charAt(i-2)=='2'&&s.charAt(i-1)<='5')) f[i]+=f[i-2];

        }
        return f[n];
    }
}
