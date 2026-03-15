package com.algo.one_array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWIthoutRepeat {

    public static void main(String[] args) {
        String s = "aaabcbcbcd";
        String longest = longestSubstring(s);
        System.out.println(longest);
    }

    private static String longestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int max=0;
        int i=-1;
        int f=-1;

        for(int j=0; j< s.length();j++){

            if(map.containsKey(s.charAt(j))){
                i = Math.max(i,map.get(s.charAt(j))+1);
            }
            map.put(s.charAt(j),j);


           max = Math.max(max,j-i+1);
            f=j;
        }
        return s.substring(i,f+1);
    }
}
