package Algorithms.DynamicProgramming;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n=4;
        System.out.println(fibM1(n));

        int[] cache1= new int[n+1];
        System.out.println(fibM2(n,cache1));

        int[] cache2=new int[n+1];
        System.out.println(fibM2(n,cache2));

        int[] cache3=new int[n+1];
        System.out.println(fibM3(n,cache3));
    }

    //Naive Approach
    // time complexity - O(2^n)
    public static int fibM1(int n){
        if(n<2){
            return n;
        }
        return fibM1(n-1)+fibM1(n-2);
    }

    //Top-down(Memoization)
    // time complexity - O(n)
    // space complexity - O(n)
    public static int fibM2(int n,int[] cache){



        if(n<2){
            return n;
        }

        if(cache[n]!=0){
            return  cache[n];
        }

        cache[n]=fibM2(n-1,cache) +fibM2(n-2,cache);

        return cache[n];

    }

    //Bottom-up(Tabulation)
    // time complexity - O(n)
    // space complexity - O(n)
    public static int fibM3(int n,int[] cache){

        if(n<2){
            return n;
        }

        if(cache[n]!=0){
            return cache[n];
        }

        for(int i=2;i<=n;i++){
            cache[n]=fibM3(n-1,cache)+fibM3(n-2,cache);
        }
        return cache[n];

    }

    //even more optimised
    // time complexity - O(n)
    // space complexity - O(1)
    public static int fibM4(int n,int[] cache){
        if(n<2){
            return n;
        }

        int first=0;
        int second=1;
        int sum=0;
        for(int i=2;i<=n;i++){
            sum=first+second;
            first=second;
            second=sum;
        }
        return sum;
    }


}
