package com.luojianhua.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * create by luojianhua
 * 剑指offer45、把数组排成最小的数
 */
public class Main4 {
    /**
     * 自定义排序规则  a+b<b+a
     * @param nums
     * @return
     */
    public String minNumber(int[] nums) {
        List<String> list=new ArrayList<>();
        for(int num:nums)list.add(String.valueOf(num));
        Collections.sort(list,(a, b)->(a+b).compareTo(b+a));
        return String.join("",list);
    }
}
