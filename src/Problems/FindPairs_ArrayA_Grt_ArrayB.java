package Problems;

import java.util.Arrays;
//Question:
//Given 2 aways A and B,find the no of pairs  i,j such that A[i]>B[j].
public class FindPairs_ArrayA_Grt_ArrayB {
    public static void main(String[] args) {
        int[] A={3,5,8,10};
        int[] B={2,4,6,9};
        Arrays.sort(A);
        Arrays.sort(B);

        int i=0,j=0,count=0;
        int n=A.length;
        int m=B.length;

        while(i<n && j<m){
        if(A[i]<=B[j]){
            //do nothing
            i++;
        }else {
            //if (B>A) then all the elems in A will be grtr than A[i].
            // So, no. of elems between A[i] and (n-1)= n-1-i+1=n-i
            count+=n-i;
            j++;
        }
        }

        System.out.println(count);
    }

}
//T.C: O(nlogn+mlogm+n+m)
///     =O(nlogn+mlogm)