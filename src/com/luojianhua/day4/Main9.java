package com.luojianhua.day4;

import java.util.*;
/**
 * create by luojianhua
 * 剑指offer40、最小的k个数
 */
public class Main9 {

    /**
     * Top K最大堆
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer>queue=new PriorityQueue<>((a,b)->b-a);
        for(int a:arr){
            queue.add(a);
            if(queue.size()>k) queue.poll();
        }
        int []res=new int[k];
        int index=0;
        while(!queue.isEmpty()) res[index++]=queue.poll();
        return res;
    }
}
