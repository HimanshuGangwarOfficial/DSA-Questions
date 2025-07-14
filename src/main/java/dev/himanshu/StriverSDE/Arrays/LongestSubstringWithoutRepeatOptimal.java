package dev.himanshu.StriverSDE.Arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatBetter {

    public static void main(String[] args) {

        String s = "pwwkew";
        int maxLength = lengthOfLongestSubstring(s);
        System.out.println(maxLength);
    }

    public static int lengthOfLongestSubstring(String s) {

        int maxLength = 0;
        char[] array =  s.toCharArray();
        int left = 0;
        int right = 0;

        Set<Character> set = new HashSet<>();


        for(int i=0; i<s.length(); i++){

            while(set.contains(array[i])){
                set.remove(array[left]);
                left++;

            }

            int length = right-left +1;
            maxLength = Math.max(length, maxLength);
            set.add(array[i]);
            right++;

        }

        return maxLength;

    }
}
