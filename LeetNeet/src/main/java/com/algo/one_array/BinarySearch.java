package com.algo.one_array;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[]= {0,3,6,7,22,41,84};
       int result =  performBinarySearch(arr,84);
        System.out.println(result);
    }

    private static int performBinarySearch(int[] arr,int k) {
        int left = 0;
        int right = arr.length-1;

        while (left<=right){
           int mid = left + ( right- left)/2;
            if(arr[mid] == k){
                return mid;
            }
            else if (arr[mid] < k){
                left=mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}
