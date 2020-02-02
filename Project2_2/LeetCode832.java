
public class LeetCode832 {
    public int[][] flipAndInvertImage(int[][] A) {
        if(A == null || A.length == 0) return new int[0][0];
        int len = A.length;
        int[][] ans = new int[len][len];

        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                ans[i][j] = A[i][len-1-j] ^ 1;
            }
        }

        return ans;
    }
}
