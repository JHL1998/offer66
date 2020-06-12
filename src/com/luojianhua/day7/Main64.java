package com.luojianhua.day7;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 滑动窗口的最大值
 */
public class Main64 {
    public ArrayList<Integer> maxInWindows(int [] nums, int k) {

        ArrayList<Integer> res=new ArrayList<>();
        if(nums==null||nums.length==0||k<=0||k>nums.length) return res;
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int pos=-1;
        for(int i=0;i<k;i++){
            if(nums[i]>max){
                max=nums[i];
                pos=i;
            }
        }
        res.add(max);
        for(int i=k;i<n;i++){
            int j=i-k+1;
            if(j<=pos){
                if(nums[i]>max){
                    max=nums[i];
                    pos=i;
                }
            }else{
                max=Integer.MIN_VALUE;
                for(int m=i-k+1;m<=i;m++){
                    if(nums[m]>max){
                        max=nums[m];
                        pos=m;
                    }
                }
            }
            res.add(max);
        }

        return res;

    }
}
class Main64_2{
    public ArrayList<Integer> maxInWindows(int [] nums, int k)
    {
        ArrayList<Integer> res=new ArrayList<>();
        Deque<Integer>queue=new LinkedList<>();
        int n=nums.length;
        if(nums==null||nums.length==0||k<=0||k>nums.length) return res;
        for(int i=0;i<n;i++){
            while(!queue.isEmpty()&&nums[queue.getLast()]<=nums[i]){
                queue.removeLast();
            }
            queue.add(i);

            if(i-k+1>queue.getFirst()) queue.removeFirst();
            if(i-k+1>=0) res.add(nums[queue.getFirst()]);

        }
        return res;
    }
}
