package com.luojianhua.day2;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Main13 {
    /**
     * 直接遍历整个数组，找到奇数的话就与前面交换位置
     * @param arr
     */
    public void reOrderArray(int [] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                for(int j=i-1;j>=0;j--){
                    if(arr[j]%2==0){
                        swap(arr,j,j+1);
                    }else{
                        break;
                    }
                }
            }
        }

    }
    private void swap(int []arr, int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

class Main13_1 {

    /**
     * 开辟两个数组，然后进行合并
     * @param arr
     */
    public void reOrderArray(int [] arr) {

        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==1) count++;
        }
        int []odd=new int[count];
        int []even=new int[n-count];
        int index=0;
        int evenindex=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                odd[index++]=arr[i];
            }else{
                even[evenindex++]=arr[i];
            }
        }
        for(int i=0;i<count;i++){
            arr[i]=odd[i];
        }
        int m=0;
        for(int i=count;i<n;i++){
            arr[i]=even[m++];
        }
    }

}

class Main13_2 {

    /**
     * 简洁版
     * @param arr
     */
    public void reOrderArray(int [] arr) {

        int n=arr.length;
       List<Integer>odd=new ArrayList<>();
        List<Integer>even=new ArrayList<>();
       for(int i=0;i<n;i++){
           if(arr[i]%2==0) even.add(arr[i]);
           else odd.add(arr[i]);
       }
       int index=0;
       for(int a:odd){
           arr[index++]=a;
       }
        for(int b:even){
            arr[index++]=b;
        }
    }

}

