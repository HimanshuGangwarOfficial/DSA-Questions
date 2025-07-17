package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CoinProblem {

    public static void main(String[] args) {
        int[] coins = {1,7,10};

        int target = 14;
        Arrays.sort(coins);
        int ans = calculate(coins, target);
        System.out.println();
        System.out.println(ans);
    }

    public static int calculate(int[] arr, int target){
        int ans = 0;
        int count = 0;
        List<Integer> possibleAns = new ArrayList<>();
        for(int j=arr.length-1; j>= 0; j--){
            ans = 0;
            count=0;
            for(int i=j;i>=0;i--){
                while(target-ans >= arr[i]){
                    count++;
//                System.out.println(arr[i]);
                    ans+=arr[i];

                }
            }
            possibleAns.add(count);
        }
//        possibleAns.stream().forEach(System.out::print);
        return possibleAns.stream().min(Comparator.comparingInt(Integer::intValue)).get();

    }

}
