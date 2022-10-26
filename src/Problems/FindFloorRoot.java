package Problems;
//Question: Given a number, find  floor(sqrt(37))
//o/p:6
public class FindFloorRoot {
    public static void main(String[] args) {
        int N=36;

        int l=1,h=N,ans=0;

        while(l<=h){
            int mid=l+(h-l)/2;

            if(mid*mid==N){
                ans= mid;
                break;
            }
            if(mid*mid<N){
                ans=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        System.out.println(ans);
    }
}
