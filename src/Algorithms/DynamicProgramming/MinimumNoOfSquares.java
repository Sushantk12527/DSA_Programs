package Algorithms.DynamicProgramming;

import java.util.Arrays;

public class MinimumNoOfSquares {
    public static void main(String[] args) {
        int A=6;
        //..method1
//        System.out.println(minSquares1(A));


        //..method2
//        int[] dp= new int[A+1];
//        Arrays.fill(dp,-1);
//        dp[0]=0;
//        dp[1]=1;
//        System.out.println(minSquares2(A,dp));

        //..method3
        System.out.println(minSquares3(A));
    }

    //naive O(A.sqrt(A))
    public static int minSquares1(int A){

        int count=Integer.MAX_VALUE;

        for(int i=1;i*i<=A;i++){

                    count=Math.min(count,1+minSquares1(A-i*i));  //sum=0+ways(6-1)
        }
        return count;
    }

    //top-down recursive O(A*sqrt(A))
    public static int minSquares2(int A,int[] dp){
        if(dp[A]!=-1){
            return dp[A];
        }


        int count=Integer.MAX_VALUE;

        for(int i=1;i*i<=A;i++){

            count=Math.min(count,1+minSquares2(A-i*i,dp));  //sum=0+ways(6-1)
        }
        dp[A]=count;
        return dp[A];
    }

    //bottom up tabulation O(A*sqrt(A))
    public static int minSquares3(int A){
        int[] dp=new int[A+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<=A;i++){

            for(int j=1;j*j<=i;j++){
                dp[i]=Math.min(dp[i],1+dp[i-j*j]);
            }
        }

        return dp[A];
    }
}
