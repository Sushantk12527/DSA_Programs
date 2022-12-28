package Problems;

import java.util.ArrayList;

public class subsequence_and_subsets {
    public static void main(String[] args) {
    int[] arr={3,1,2};
    ArrayList<Integer> ds= new ArrayList<>();
//    printAllSubsequences(0,arr,ds,arr.length);
//        printSubsequencesWithSumK(0,arr,ds,0,3,arr.length);
//        System.out.println(countSubsequencesWithSumK(0,arr,0,3,arr.length));
        printSubsequencesWithSumKMultiplePicksAllowed(0,arr,ds,0,3,arr.length);
    }



    //print subsequeces whose sum is k. A single number can be counted multiple times.
    public static void printSubsequencesWithSumKMultiplePicksAllowed(int idx,int[] arr,ArrayList<Integer> ds, int sum,int k,int n){

        if(idx>=n){
            if(sum==k){
                System.out.println(ds);
            }
            return;
        }

        if(sum+arr[idx]<=k) {
            ds.add(arr[idx]);
            printSubsequencesWithSumKMultiplePicksAllowed(idx,arr,ds,sum+arr[idx],k,n);
            ds.remove(ds.size()-1);
        }

        printSubsequencesWithSumKMultiplePicksAllowed(idx+1,arr,ds,sum,k,n);



    }

    //count the subsequences with sum=k
    public static int countSubsequencesWithSumK(int idx,int[] arr, int sum,int k,int n){

        if(idx>=n){
            if(sum==k){
                return 1;
            }
            return 0;
        }


        int takeCount=countSubsequencesWithSumK(idx+1,arr,sum+arr[idx],k,n);

        int notTakeCount=countSubsequencesWithSumK(idx+1,arr,sum,k,n);

        return takeCount+notTakeCount;

    }


    //print subsequeces whose sum is k
    public static void printSubsequencesWithSumK(int idx,int[] arr,ArrayList<Integer> ds, int sum,int k,int n){

        if(idx>=n){
            if(sum==k){
                System.out.println(ds);
            }
            return;
        }

        ds.add(arr[idx]);
        printSubsequencesWithSumK(idx+1,arr,ds,sum+arr[idx],k,n);
        ds.remove(ds.size()-1);
        printSubsequencesWithSumK(idx+1,arr,ds,sum,k,n);

    }

    //print all possible subsequences
    public static void printAllSubsequences(int idx, int[] arr, ArrayList<Integer> ds,int n){

        if(idx>=n){
            System.out.println(ds);
            return;
        }

        ds.add(arr[idx]);
        printAllSubsequences(idx+1,arr,ds,n);
        ds.remove(ds.size()-1);
        printAllSubsequences(idx+1,arr,ds,n);

    }
}
