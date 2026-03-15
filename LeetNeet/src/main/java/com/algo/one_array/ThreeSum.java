package com.algo.one_array;

/*
* find all the triplet such that a+b+c=0
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int [] arr = {0,1,3,-1,-2,-1};
        List<List<Integer>> theTripplet = findTheTripplet(arr);
        System.out.println(theTripplet);

    }


    private static List<List<Integer>> findTheTripplet(int[] arr) {

        int n = arr.length;
        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {

                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    while (left < right && arr[left] == arr[left + 1]) left++;
                    while (left < right && arr[right] == arr[right - 1]) right--;

                    left++;
                    right--;

                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return result;
    }
}
