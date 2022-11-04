package Algorithms.BackTracking;

import java.sql.Array;
import java.util.ArrayList;

public class PrintAllSubsets {

    public static void printAllSubsets(int[] arr,ArrayList<Integer> arrPrint,int i,int n){

        if(i==n){
            System.out.println(arrPrint);
            return;
        }

        arrPrint.add(arr[i]);
        printAllSubsets(arr,arrPrint,i+1,n);
        Integer x=arr[i];
        arrPrint.remove(x);//backtracking step
        printAllSubsets(arr,arrPrint,i+1,n);

    }

    public static void main(String[] args) {
        ArrayList<Integer> arrPrint=new ArrayList<>();
        int[] arr={1,2,3};
        printAllSubsets(arr,arrPrint,0,arr.length);

    }


}
