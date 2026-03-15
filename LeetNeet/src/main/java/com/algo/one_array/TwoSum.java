package com.algo.one_array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/*
* given the target, find the sum of two number which adds up to be the value
* */


public class TwoSum {

    public static void main(String[] args) {
        int arr [] = {1,4,5,0,8};
        int target = 13;
        int[] twoSum = findTwoSum(arr, target);
        System.out.println(Arrays.toString(twoSum));
    }

    private static int []  findTwoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< arr.length ; i++){
            int x = target - arr[i];
            if(map.containsKey(x)){
                return new int [] {arr[i],x};
            }else{
                map.put(arr[i],i);
            }
        }
        return new int[] {};
    }
}
