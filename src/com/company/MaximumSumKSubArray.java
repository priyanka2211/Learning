package com.company;

import java.util.Arrays;

public class MaximumSumKSubArray {
    public void run(){
        int[] input= {9,1,6,1};
        int[][] interval={{1,2},{1,3}};

        int[] rearrange = Arrays.copyOf(input, input.length);
        int[] count = new int[input.length];
        for(int i=0;i<interval.length;i++){
            for(int j=interval[i][0];j<interval[i][1];j++){
                count[j]++;
            }
        }
        Arrays.sort(count);
        Arrays.sort(rearrange);
        int sumB=0;

        for(int i=0;i<rearrange.length;i++){
            sumB += (count[i]*rearrange[i]);
        }

        System.out.println(" Diff = " + Math.abs(computeSum(input, interval) - sumB));
    }

    int computeSum(int[] input, int[][] interval){
        int sum = 0;
        for(int i=0;i<interval.length;i++){
            for(int j=interval[i][0];j<interval[i][1];j++){
                sum += input[j-1];
            }
        }
        return sum;
    }
}
