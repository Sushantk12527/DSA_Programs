package Algorithms.Recurssion;

import java.util.ArrayList;
import java.util.Arrays;

public class MultipleRecursionCalls {
    public static void main(String[] args) {
//        System.out.println(fibonacci(4));
        int[] arr={1,2,1};
        ArrayList<Integer> ans=new ArrayList<>();
//        printAllSubsequences(0,arr,ans);
//        printSubsequenceWithSum(arr,ans,2,0,0,arr.length);

        //print only single subsequence with sum k
//        printSingleSubsequenceWithSum(arr,ans,2,0,0,arr.length);

        //count subsequences with sum
        System.out.println(countSubsequences_with_sum(arr,ans,2,0,0,arr.length));
    }


    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }

        return fibonacci(n-1)+fibonacci(n-2);
    }

    //Print all subsequences
    public static void printAllSubsequences(int idx,int[] arr,ArrayList<Integer> ans){
        if(idx==arr.length){
            System.out.println(ans);
            return;
        }

        ans.add(arr[idx]);
        printAllSubsequences(idx+1,arr,ans);
        ans.remove(ans.size()-1);
        printAllSubsequences(idx+1,arr,ans);
    }

    //Print all Subsequences with sum k
    public static void printSubsequenceWithSum(int[] arr,ArrayList<Integer> ans,int target,int sum,int idx,int n){
        if(idx==n){
            if(sum==target){
                System.out.println(ans);
            }
            return;
        }
        ans.add(arr[idx]);
        printSubsequenceWithSum(arr,ans,target,sum+arr[idx],idx+1,n);
        ans.remove(ans.size()-1);
        printSubsequenceWithSum(arr,ans,target,sum,idx+1,n);
    }

    //Print only 1 Subsequences with sum k
    public static boolean printSingleSubsequenceWithSum(int[] arr,ArrayList<Integer> ans,int target,int sum,int idx,int n){
        if(idx==n){
            if(sum==target){
                System.out.println(ans);
                return true;
            }
            else return false;
        }
        ans.add(arr[idx]);
        if(printSingleSubsequenceWithSum(arr,ans,target,sum+arr[idx],idx+1,n)==true) {
            return true;
        };
        ans.remove(ans.size()-1);
        return printSingleSubsequenceWithSum(arr,ans,target,sum,idx+1,n);
    }

    //count no. of subsequences
    public static int countSubsequences_with_sum(int[] arr, ArrayList<Integer> ans,int target,int sum,int idx,int n){

        if(idx==n){
            if(sum==target){
                System.out.println(ans);
                return 1;
            }
            return 0;
        }


         ans.add(arr[idx]);
         int take=countSubsequences_with_sum(arr,ans,target,sum+arr[idx],idx+1,n);
         ans.remove(ans.size()-1);
         int not_take=countSubsequences_with_sum(arr,ans,target,sum,idx+1,n);
         return take+not_take;

    }
}
