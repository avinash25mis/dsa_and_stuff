package com.algo.one_array;


import java.util.Arrays;

/*
* find the product of other element except current index
* input      {1,2,3,4}
* output     {24,12,8,6}
* */
public class ProductExceptCurrentIndex {

    public static void main(String[] args) {
        int arr [] = {1,2,3,4};
        //int outputArray [] = findProductOfAllIndexExceptCurrent(arr);
        int outputArray [] = findProductOfAllIndexExceptCurrent2(arr);
        System.out.println(Arrays.toString(outputArray));
    }

    private static int[] findProductOfAllIndexExceptCurrent(int[] arr) {

        int result [] = new int[arr.length];

        result[0]=1;

        for(int i=1 ; i<arr.length; i++){
            result[i]= result[i-1] * arr[i-1];
        }

        int suffix = 1;
        for(int i=arr.length-1; i>=0;i--){
            result[i]=result[i]*suffix;
            suffix = arr[i] * suffix;
        }
        return result;
    }



   private static int[] findProductOfAllIndexExceptCurrent2(int arr[]){
        int n = arr.length;
        int prefix[]= new int[n];
        int suffix[]= new int[n];
        int result[]= new int[n];
        prefix[0]=1;
        suffix[n-1]=1;
        for(int i =1; i<n;i++){
            prefix[i] = prefix[i-1] * arr [i-1];
        }

        for(int i=n-2;i>=0; i--){
            suffix[i] = suffix[i+1] * arr[i+1];
        }

        for(int i = 0 ; i<n;i++){
            result[i]=prefix[i]* suffix[i];
        }

        return result;
    }

}
