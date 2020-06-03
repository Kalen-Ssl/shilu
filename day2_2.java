package days;


public class day2_2 {
    public int count(int[] A, int n) {
        int num=0;
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]>A[j]){
                  num++;
                }
            }
        }
        return num;
    }
}

