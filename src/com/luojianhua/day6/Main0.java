package com.luojianhua.day6;

/**
 * create by luojianhua
 * 剑指offer51、数组中的逆序对
 */
public class Main0 {
    /**
     * 利用归并排序求逆序对
     * @param nums
     * @return
     */
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    private int mergeSort(int[]nums,int l,int r){
        if(l>=r) return 0;
        int mid=(l+r)>>1;
        int res=mergeSort(nums,l,mid)+mergeSort(nums,mid+1,r);
        int temp[]=new int[r-l+1];
        int i=l,j=mid+1;
        for(int k=0;k<r-l+1;k++){
            if(i>mid){
                temp[k]=nums[j++];
                continue;
            }
            if(j>r){
                temp[k]=nums[i++];
                continue;
            }
            if(nums[i]<=nums[j]){
                temp[k]=nums[i++];
            }else{
                temp[k]=nums[j++];
                res+=mid-i+1;

            }
        }
        for(int k=0;k<r-l+1;k++) nums[l+k]=temp[k];
        return res;
    }
}
