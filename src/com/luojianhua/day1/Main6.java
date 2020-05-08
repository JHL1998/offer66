package com.luojianhua.day1;

import java.util.Arrays;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class Main6 {
    /**
     * 利用API
     * @param arr
     * @return
     */
    public int minNumberInRotateArray(int [] arr) {
        Arrays.sort(arr);
        return arr[0];
    }
}

 class Main6_1 {

     /**
      * 找第一个逆序对
      * @param arr
      * @return
      */
    public int minNumberInRotateArray(int [] arr) {
        if(arr.length==0) return 0;
        int ans=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                ans=arr[i];
            }
        }
        return ans;
    }
}