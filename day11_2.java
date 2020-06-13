package days;
//构建乘积数组
public class day11_2 {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        boolean changed = false;
        for(int k = 0; k < B.length; k++){
            B[k] = 1;
            for(int i = 0; i < A.length; i++){
                int temp = 1;
                if(i == k){
                    changed = true;
                    temp = A[i];
                    A[i] = 1;
                }
                B[k] *= A[i];
                if(changed){
                    A[i] =temp;
                    changed = false;
                }
            }

        }
        return B;
    }
}
