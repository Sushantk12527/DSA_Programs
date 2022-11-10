package Algorithms.DynamicProgramming;

public class staircase {
    public static void main(String[] args) {
        int n=8;
//        int[] cache=new int[n+1];
        System.out.println(noOfWays3(n));

    }

//    Naive approach =>O(2^n)
    public static int noOfWays1(int n,int[] cache){
        if(n<0){
            return 0;
        }

        if(n==0){
            return 1;
        }

        return noOfWays1(n-1,cache)+noOfWays1(n-2,cache);
    }

    //    Top down approach =>O(n)
    public static int noOfWays2(int n,int[] cache){
        if(n<0){
            return 0;
        }

        if(n==0){
            return 1;
        }

        if(cache[n]!=0){
            return cache[n];
        }

        return cache[n]= noOfWays2(n-1,cache)+noOfWays2(n-2,cache);
    }

    //    Bottom Up approach =>O(n)
    public static int noOfWays3(int n){
        int[] cache=new int[n+1];
        cache[0]=1;



        for(int i=2;i<=n;i++){
            cache[i]= cache[i-1]+cache[i-2];
        }

        return cache[n];
    }
}
