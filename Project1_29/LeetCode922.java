
public class LeetCode922 {
        public int[] sortArrayByParityII(int[] A) {
            int j = 1;
            for (int i = 0; i < A.length - 1; i = i + 2) {
                if ((A[i] & 1) != 0) {
                    while ((A[j] & 1) != 0) {
                        j = j + 2;
                    }
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
            return A;
        }
}
