package Algorithms.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int B=14;
        int[] A={3,6,8,10,13,14,16,17};
        int ans=-1;

        int l=0,h=A.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;

            if(A[mid]==B){
                ans=mid;
            }

            if(A[mid]<B){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        System.out.println(ans);
    }
}
