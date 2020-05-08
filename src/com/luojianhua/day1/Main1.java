package com.luojianhua.day1;

/**
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Main1 {

    /**
     * 由于每一行，每一列都是递增的，我们以每一行的最后一个元素为基准进行查找
     * @param target
     * @param arr
     * @return
     */
    public boolean Find(int target,int[][] arr){
        //第0行开始
         int i=0;
         //标记每一行中最后一个元素的位置
         int j=arr[0].length-1;
         //索引有效
         while(i<arr.length&&j>=0){
             int value=arr[i][j];
             if(value==target) return true;
             //如果该元素比指定的值大，直接向左搜索
             else if(value>target) j--;
             //否则向下搜索
             else i++;
         }
         return false;
    }
}
