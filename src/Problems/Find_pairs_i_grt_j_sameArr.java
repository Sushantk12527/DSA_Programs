package Problems;

import java.util.Arrays;

public class Find_pairs_i_grt_j_sameArr {
    public static void main(String[] args) {
        int[] OGarr={10,3,8,15,6,12,2,18,7,1};
//        int[] OGarr={45, 10, 15, 25, 50}; //ans:3 Have to work on this.


        int totalLen=OGarr.length;


        int n=totalLen/2;
        int m=totalLen-n;

        int[] A=new int[n];
        int[] B=new int[m];

        for(int i=0;i<n;i++){
            A[i]=OGarr[i];
        }

        int cnt=n;
        for(int j=0;j<m;j++){
            B[j]=OGarr[cnt];
            cnt++;
        }

//        print_two_arrays(A,B);

        Arrays.sort(A);
        Arrays.sort(B);

        int i=0,j=0,ansCount=0;
        while(i<n && j<m){
            if(A[i]<=B[j]){
                i++;

            }
            else{
                ansCount+=n-i;
                j++;
            }
        }

        System.out.println(ansCount%1000000007);


    }

    public static void print_two_arrays(int[] A, int[] B){
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }

        System.out.println();

        for(int j=0;j<B.length;j++){
            System.out.print(B[j]+" ");
        }
    }
}
