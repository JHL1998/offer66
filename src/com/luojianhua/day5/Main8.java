package com.luojianhua.day5;

import java.util.PriorityQueue;

/**
 * create by luojianhua
 * 剑指offer49、丑数
 */
public class Main8 {
    /**
     * 最小堆记录每个丑数
     * @param n
     * @return
     */
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> queue=new PriorityQueue<>();
        long res=1L;
        for(int i=2;i<=n;i++){
            queue.add(res*2);
            queue.add(res*3);
            queue.add(res*5);
            res=queue.poll();
            while(!queue.isEmpty()&&queue.peek()==res) queue.poll();
        }
        return (int)res;
    }
}
