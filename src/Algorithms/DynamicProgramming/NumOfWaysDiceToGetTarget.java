package Algorithms.DynamicProgramming;

public class NumOfWaysDiceToGetTarget {
    public static void main(String[] args) {
        System.out.println(ways1(8));
    }

    //naive recurssion O(6^n)
    public static int ways1(int n){
        if(n==0){
            return 1;
        }

        int sum=0;
        for(int i=1;i<=6;i++){
            if(n-i>=0){
                sum=sum+ways1(n-i);
            }

        }
        return sum;
    }


}
