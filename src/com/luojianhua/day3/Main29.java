package com.luojianhua.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则
 * 最小的4个数字是1,2,3,4,。
 */
public class Main29 {

    /**
     * 利用库函数排序
     * @param nums
     * @param k
     * @return
     */
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] nums, int k) {
        if(k>nums.length) return new ArrayList<>();
        Arrays.sort(nums);
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<k;i++){
            res.add(nums[i]);
        }
        return res;
    }


}

class Main29_1 {
    /**
     * TopN问题，利用优先队列
     * @param nums
     * @param k
     * @return
     */
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] nums, int k) {
        ArrayList<Integer>res=new ArrayList<>();
        if(k>nums.length||k==0) return  res;
        // 改成最大堆
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        for(int num:nums){
            if(pq.size()<k){
                pq.add(num);
            }else if(num<pq.peek()){
                pq.poll();
                pq.add(num);
            }
        }
        while(!pq.isEmpty()){
            res.add(pq.poll());
        }
        return res;
    }


}
