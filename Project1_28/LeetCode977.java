
public class LeetCode977 {
    public int[] sortedSquares(int[] A) {
        for(int i=0;i<A.length;i++){
            A[i]=A[i]*A[i];
        }
        int t;
        for(int j=0;j<A.length-1;j++){
            for(int m=j+1;m<A.length;m++){
                if(A[j]>A[m]){
                  t=A[j];
                  A[j]=A[m];
                  A[m]=t;
                }
            }
        }
        return A;
    }
}
