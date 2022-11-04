package Algorithms.BackTracking;

import java.util.Arrays;

//--------------------------------------
//Count number of paths available
//--------------------------------------

public class RatInMazeProblem {
    public static void main(String[] args) {

        int[][] input= new int[3][3];
        input[0][1]=5;
        input[1][1]=5;
        input[1][2]=5;
        input[0][2]=5;

//        input[2][0] =5;
//        input[7][0] =5;
//        input[1][1] =5;
//        input[2][1] =5;
//        input[3][1] =5;
//        input[0][3] =5;
//        input[1][3] =5;
//        input[8][3] =5;
//        input[8][1] =5;
//        input[7][3] =5;
//        input[6][3] =5;
//        input[0][8] =5;

//        input[8][7] =5;
//        input[7][7] =5;
//        input[7][8] =5;

        int n=input.length;
        int m=input[0].length;

//        for(int[] i:input){
//            System.out.println(Arrays.toString(i));
//        }

        System.out.println(findPath(input,n,m,0,0));

//        for(int[] i:input){
//            System.out.println(Arrays.toString(i));
//        }

    }

    public static int findPath(int[][] input,int n,int m,int x,int y){

        //cheese is at N-1,M-1
        if(x==n-1 && y==m-1){
            return 1;
            //return true;
        }

        if(x>=n || x<0 || y>=m || y<0){
//            return false;
            return 0;
        }

        //5 means blocked and 2 means visited
        if(input[x][y]==5 || input[x][y]==2){
//            return false;
            return 0;
        }

        //rec case
        input[x][y]=2;

        int w1= (findPath(input,n,m,x,y+1)) ;
        int w2= (findPath(input,n,m,x-1,y)) ;
        int w3= (findPath(input,n,m,x,y-1)) ;
        int w4= (findPath(input,n,m,x+1,y));
        input[x][y]=0;
        return w1+w2+w3+w4;

//        return (findPath(input,n,m,x,y+1)) ||
//                (findPath(input,n,m,x-1,y)) ||
//                (findPath(input,n,m,x,y-1)) ||
//                (findPath(input,n,m,x+1,y));

    }
}
