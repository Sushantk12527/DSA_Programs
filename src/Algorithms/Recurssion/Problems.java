package Algorithms.Recurssion;

import java.util.Arrays;

public class Problems {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
//        reverseArrusing2ptrs(arr,0,arr.length-1);
        reverseArrusing1ptrs(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    //using two pointers
    public static void reverseArrusing2ptrs(int[] arr,int l, int r){
        if(l>=r){
            return;
        }

        swap(arr,l,r);
        reverseArrusing2ptrs(arr,l+1,r-1);
    }

    //using one pointers
    public static void reverseArrusing1ptrs(int[] arr,int i){
        if(i>=arr.length/2){
            return;
        }

        swap(arr,i,arr.length-i-1);
        reverseArrusing1ptrs(arr,i+1);
    }

    public static void swap(int[] arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;

    }
}
