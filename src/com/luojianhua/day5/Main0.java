package com.luojianhua.day5;

import java.util.PriorityQueue;

/**
 * create by luojianhua
 * 剑指offer41、数据流中的中位数
 */
public class Main0 {

    /**
     * 维护两个堆，左堆为最大堆，右堆为最小堆。时刻保持左堆元素个数最多比右堆大1
     */
    PriorityQueue<Integer> left;
    PriorityQueue<Integer>right;
    public Main0 () {
        left=new PriorityQueue<>((a,b)->b-a);
        right=new PriorityQueue<>();
    }

    /**
     * 插入元素时先进左堆，然后取堆顶（最大元素）进入小顶堆，若数量过多，将右堆顶（最小元素）重新加入左堆
     * @param num
     */
    public void addNum(int num) {
        left.add(num);
        right.add(left.poll());
        if(left.size()<right.size()) left.add(right.poll());
    }

    public double findMedian() {
        if(left.size()>right.size()) return left.peek()/1.0;
        return  (left.peek()+right.peek())/2.0;
    }
}
