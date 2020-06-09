package com.luojianhua.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 把数组排成最小的数
 */
public class Main32 {
    public String PrintMinNumber(int [] numbers) {
        List<String>list=new ArrayList<>();
        for(int number:numbers){
            list.add(String.valueOf(number));
        }
        Collections.sort(list,(o1,o2)->(o1+o2).compareTo(o2+o1));
        return String.join("",list);
    }
}
