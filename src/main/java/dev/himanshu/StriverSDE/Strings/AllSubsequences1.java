package dev.himanshu.StriverSDE.Strings;

import java.util.ArrayList;
import java.util.List;

public class AllSubsequences1 {
    public static void main(String[] args) {

        List<StringBuilder> ans = subsequences("abc");
        ans.forEach(System.out::println);
    }
    /*
    *  This is the Powerset method to find all the possible subsequences
    *  TC = O(n(2^n))
    * */
    public static List<StringBuilder> subsequences(String s){

        int n = s.length();
        List<StringBuilder> ans = new ArrayList<>();
        for(int i=0; i< (1<<n); i++){
            StringBuilder str = new StringBuilder();
            for(int j=0; j<n; j++){
                if((i & (1 << j)) != 0){
                    str.append(s.charAt(j));
                }
            }
            ans.add(str);
        }

        return ans;
    }
}
