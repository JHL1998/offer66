package com.luojianhua.day1;

/**
 * create by luojianhua
 * 剑指offer04、二维数组中的查找
 */
public class Main1 {

    /**
     * 由于每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序
     * 可以按照右上角或者左下角开始找，
     * @param matrix
     * @param target
     * @return
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0) return false;
        int m=matrix.length,n=matrix[0].length;
        int a=0,b=n-1;
        while(a<m&&b>=0){
            if(matrix[a][b]==target) return true;
            else if(matrix[a][b]>target)b--;
            else a++;
        }
        return false;

    }
}
