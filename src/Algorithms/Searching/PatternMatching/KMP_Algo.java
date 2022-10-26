package Algorithms.Searching.PatternMatching;

public class KMP_Algo {
    public static class KMP_String_Matching{

        void KMPSearch(String pat,String txt){
            int M=pat.length();
            int N=txt.length();

            int lps[]= new int[M];
            computeLPSArray(pat,M,lps);

            int i=0;//index for txt
            int j=0;//index for pat

            while(i<N){
                if(txt.charAt(i)==pat.charAt(j)){
                    i++;
                    j++;
                }
                if(j==M){
                    System.out.println("Pattern starts at Index:"+(i-j));
                    j=lps[j-1];
                }
                else if(i<N && txt.charAt(i)!=pat.charAt(j)){
                    if(j!=0){
                        j=lps[j-1];
                    }
                    else{
                        i++;
                    }
                }
            }
        }

        void computeLPSArray(String pat,int M,int lps[]){
            int len=0;
            int i=1;
            lps[0]=0;

            while(i<M){
                if(pat.charAt(i)==pat.charAt(len)){
                    len++;
                    lps[i]=len;
                    i++;
                }else{
                    if(len!=0){
                        len=lps[len-1];
                    }else{
                        lps[i]=len;
                        i++;
                    }
                }
            }
        }

    }

    public static void main(String args[]){
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";

        KMP_String_Matching kmpObj= new KMP_String_Matching();
        kmpObj.KMPSearch(pat,txt);
    }

    
}
