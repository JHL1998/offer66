package com.luojianhua.day5;

import java.util.ArrayList;

/**
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 */
public class Main41 {
    /**
     * 滑动窗口模版 我们设置一个窗口
     */
    private   ArrayList<ArrayList<Integer> > res=new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int target) {
        int l=1,r=1,sum=0;
        while(r<target){
            sum+=r;
            r++;
            while(sum>target){
                sum-=l;
                l++;
            }
            if(sum==target){
                ArrayList<Integer>list=new ArrayList<>();
                for(int i=l;i<r;i++){
                    list.add(i);
                }

                res.add(new ArrayList<>(list));
            }
        }
        return res;
    }
}
