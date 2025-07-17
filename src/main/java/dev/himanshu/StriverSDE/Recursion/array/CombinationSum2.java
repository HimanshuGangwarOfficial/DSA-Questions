package dev.himanshu.StriverSDE.Recursion.array;

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*  https://leetcode.com/problems/combination-sum-ii/description/
* */

public class CombinationSum2 {

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> ans = combinationSum(candidates, target);
        System.out.println(ans);
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum(candidates, target,0 ,new ArrayList<>(), ans);
        return  ans;
    }

    private static void combinationSum(int[] candidates, int target,int index, List<Integer> result, List<List<Integer>> ans) {

        if(target==0){
            ans.add(new ArrayList<>(result));
            return;
        }

        for(int i=index; i< candidates.length; i++) {

            if(i>index && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;

            result.add(candidates[i]);
            combinationSum(candidates, target - candidates[i], i + 1, result, ans);
            result.remove(result.size() - 1);
        }
    }
}
