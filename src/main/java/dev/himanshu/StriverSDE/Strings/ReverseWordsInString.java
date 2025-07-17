package dev.himanshu.StriverSDE.Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "a good   example";

        String ans = reverseWords(s);
        System.out.println(ans);
    }

    public static String reverseWords(String s) {
        String[] s1 = s.trim().split("\\s+");
        for(int i=0, j=s1.length-1; i<s1.length/2; i++,j--){
            String temp = s1[i];
            s1[i] = s1[j];
            s1[j] = temp;
        }
        String join = String.join(" ", s1);

        return join.trim();
    }
}
