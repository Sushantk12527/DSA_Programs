package Algorithms.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={4,7,2,5,9,1};
                printArray(arr);

        insertionsort(arr);

        printArray(arr);

    }

    public static void insertionsort(int[] arr){
        int n=arr.length;

        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }

    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
