package dev.himanshu.StriverSDE.Arrays;

public class KadanesAlgo {
    public static void main(String[] args) {

        int[] arr = {-1,-1};

        int maxSum = calculateMaxSum(arr);
        System.out.println(maxSum);
    }

    private static int calculateMaxSum(int[] arr) {

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int startIndex =0;
        int endIndex =0 ;

        for(int i=0; i< arr.length ;i++){

            if(sum == 0){
                start = i;
            }
            sum = sum + arr[i];

            if(maxSum < sum){
                maxSum = sum;
                startIndex = start;
                endIndex = i;
            }

            if(sum<0) {
                sum = 0;
            }
        }

        System.out.println("Start: "+startIndex +" End: "+endIndex);

        return maxSum;
    }
}
