package Algorithms.Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={4,2,7,10,8,5,9};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        //--------------
                quicksort(arr,0,arr.length-1);
        //--------------
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }

    public static void quicksort(int[] arr,int l,int r){
        if(l>=r) {
            return;
        }
            int pivot = rearrange(arr, l, r);
            quicksort(arr, l, pivot-1);
            quicksort(arr, pivot + 1, r);

    }

    public static int rearrange(int[] arr,int s,int e){
        int l=s+1,r=e;
        while(l<=r){
            if(arr[l]<=arr[s]){
                l++;
            }
            else if(arr[r]>arr[s]){
                r--;
            }else{
               swap(arr,l,r);
               l++;
               r--;
            }
        }
        swap(arr,s,l-1);
        return (l-1);

    }

    public static void swap(int[] arr, int l,int r){
        int temp=arr[r];
        arr[r]=arr[l];
        arr[l]=temp;
    }
}
