package Algorithms.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPermutations {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);

        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        int n=A.size();
        int i=0;
        allPermutations(A,ans,n,i);


        System.out.println(ans);
    }

    public static void allPermutations(ArrayList<Integer> A,ArrayList<ArrayList<Integer>> ans,int n,int i){

        if(i==n-1){
            ans.add((ArrayList)A.clone());
            return ;
        }

        for(int j=i;j<n;j++){
            swap(A,i,j);
            allPermutations(A,ans,n,i+1);
            swap(A,i,j);
        }
    }

    public static void swap(ArrayList<Integer> A,int i,int j){
        int x=A.get(i);
        A.set(i,A.get(j));
        A.set(j,x);
    }
}
