package dev.himanshu.StriverSDE.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatOptimal {

    public static void main(String[] args) {

        String s = "dvdf";
        int maxLength = lengthOfLongestSubstring(s);
        System.out.println(maxLength);
    }

    public static int lengthOfLongestSubstring(String s) {

        int maxLength = 0;
        int left = 0;
        int right = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        while(right < s.length()){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right))+1, left);
            }

            map.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right-left +1);
            right++;
        }

        return maxLength;

    }
}
