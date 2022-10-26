package Algorithms.Searching.PatternMatching;

//T.C=O(N^2)
//S.C=O(1)
public class NaiveApproach {
    public static void main(String[] args) {
        String txt="I AM THE SAVIOR OF THE WORLD";
        String pat="WORLD";

        int n=txt.length();
        int m=pat.length();

        for(int i=0;i<n;i++){
            int temp=i;
            int j=0;

            for( ;j<m;j++){
                if(txt.charAt(temp)!=pat.charAt(j)){
                    break;
                }else{
                    temp++;
                }
            }
            if(j==m){
                System.out.println("Same at index:" +i);
            }
        }
    }


}
