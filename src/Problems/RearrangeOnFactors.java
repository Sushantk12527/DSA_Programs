package Problems;

import java.util.Arrays;
import java.util.Comparator;

//Question:
// Sort n elements in the increasing order of no of factors.
// If two elements here with same no. of factors then greater element comes first.

public class RearrangeOnFactors {
    public static void main(String[] args) {
        int[] arr={3,12,9,6,25,14};
        //Boxing int[] to Object Integer[]
        Integer[] input = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(input, (a,b)->{
                    int factcount1=countFactors(a);
                    int factcount2=countFactors(b);

                    if(factcount1<factcount2)return -1;
                    if(factcount2<factcount1)return 1;

                    if(a>b) {
                        return -1;
                    }
                    else return 1;

                });

        //UnBoxing int[] to Object Integer[]
        int[] arr1= Arrays.stream(input).mapToInt(Integer::intValue).toArray();

        for (int val: arr1) {
            System.out.print(val+",");
        }

    }



    public static int countFactors(int num){
        int count=0;
        for(int i=1;i*i<=num;i++){
            if(i*i==num){
                count++;
                return count;
            }

            if(num%i==0){
                count+=2;
            }

        }
        return count;
    }
}
