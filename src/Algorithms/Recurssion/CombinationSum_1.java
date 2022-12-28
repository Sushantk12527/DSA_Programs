package Algorithms.Recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum_1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,6,7};
        List<Integer> inner=new ArrayList<>();
        int n=arr.length;

        sum_1(arr,inner,7,0,arr.length);
//        allcombinations(arr,inner,0,n);

    }

    // Add all combinations to ans, whose sum= target
    // considering an index multiple times is allows .e.g. 2,2,3=7
//Time complexity:2^t


    public static void sum_1(int[] arr,List<Integer> inner,int target,int idx,int n){


        if(idx==n){
            if(target==0){
                System.out.println(inner);
            }
            return;
        }

        inner.add(arr[idx]);
        if(target>=arr[idx]){

            sum_1(arr,inner,target-arr[idx],idx,n);
        }
        inner.remove(inner.size()-1);
        sum_1(arr,inner,target,idx+1,n);

    }

    // Print all combination with sum == target
    //

    public static void allcombinations(int[] arr,List<Integer> inner,int idx,int n){

        if(idx==n){
            System.out.println(inner);
            return;
        }



        inner.add(arr[idx]);

        allcombinations(arr,inner,idx+1,n);

        inner.remove(inner.size()-1);
        allcombinations(arr,inner,idx+1,n);

    }
}
