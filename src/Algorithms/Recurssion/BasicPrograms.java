package Algorithms.Recurssion;

public class BasicPrograms {
    public static void main(String[] args) {
//        printNTo1(5); //O/P:5 4 3 2 1
//        print1ToN(5); //O/P:1 2 3 4 5
//        sumOfN(3,0); //O/P:6
        System.out.println(sumN(3));
    }

    public static void printNTo1(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        //recursive call
        printNTo1(n-1);
    }

    public static void print1ToN(int n){
        if(n<1){
            return;
        }

        //recursive call
        print1ToN(n-1);
        System.out.println(n);
    }

    //parameterised recurssion
    public static void sumOfN(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }

        sumOfN(n-1,sum+n);
    }

    //functional recurssion
    public static int sumN(int n){
        if(n==0){
            return 0;
        }
        return  n+sumN(n-1);
    }
}
