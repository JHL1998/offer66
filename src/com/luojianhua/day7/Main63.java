package com.luojianhua.day7;

import java.util.PriorityQueue;

/**
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 */
public class Main63 {

    /**
     * 利用最大堆和最小堆，左边放最大堆，右边放最小堆
     * @param num
     */

    private PriorityQueue<Integer>left=new PriorityQueue<>((a,b)->b-a);
    private PriorityQueue<Integer>right=new PriorityQueue<>();
    public void Insert(Integer num) {
           left.add(num);
           right.add(left.poll());
           if(left.size()<right.size()) left.add(right.poll());


    }

    public Double GetMedian() {
         if(left.size()>right.size()) return (double)left.peek();
         else return (double)(left.peek()+right.peek())/2;
    }
}
