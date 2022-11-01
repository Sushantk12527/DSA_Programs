package Algorithms.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class NumericStringNLen {

    public static void generateNumericStrings(int n,int i,Integer[] arrOutput,ArrayList<Integer[]> arrAns){

        if(i==n){
//            System.out.println(Arrays.toString(arrOutput));
            Integer[] arrForAdding=arrOutput.clone();
            arrAns.add(arrForAdding);
            return;
        }

        arrOutput[i]=4;
        generateNumericStrings(n,i+1,arrOutput,arrAns);
        arrOutput[i]=5;
        generateNumericStrings(n,i+1,arrOutput,arrAns);
//        arrOutput[i]=6;
//        generateNumericStrings(n,i+1,arrOutput,arrAns);
    }


    public static void main(String[] args) {

        int n=2;
        ArrayList<Integer[]> arrAns=new ArrayList<>();
        Integer[] arrOutput=new Integer[n];
        generateNumericStrings(n,0,arrOutput,arrAns);

        for (Integer[] i: arrAns) {
            System.out.println(Arrays.toString(i));

        }
    }
}
