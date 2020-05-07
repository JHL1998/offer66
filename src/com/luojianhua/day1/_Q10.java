package com.luojianhua.day1;

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，
 * 总共有多少种方法？
 *
 * 比如n=3时，2*3的矩形块有3种覆盖方法：
 */
public class _Q10 {
    /**
     * 与爬楼梯一样，当竖着放一块是，此时dp[i]=1+dp[i-1] 如果横着放两块 dp[i]=dp[i-2]+1
     * @param n
     * @return
     */
    public int RectCover(int n) {
        if(n==0) return 0;
        if(n<=2) return n;
        int first=1;
        int second=2;
        for(int i=3;i<=n;i++){
            int sum=first+second;
            first=second;
            second=sum;
        }
        return second;

    }
}
