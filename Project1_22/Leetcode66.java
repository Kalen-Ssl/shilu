
public class Leetcode66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        digits[n - 1] = digits[n - 1] + 1;
        if(digits[n - 1] < 10){
            return digits;
        }
        for(int i = n - 1; i >= 1; i--){
            if(digits[i] == 10){
                digits[i] = 0;
                digits[i - 1] = digits[i - 1] + 1;
            }
        }
        if(digits[0] == 10) {
            int[] newDigits = new int[n + 1];
            newDigits[0] = 1;
            newDigits[1] = 0;
            for (int i = n; i >= 2; i--) {
                newDigits[i] = digits[i - 1];
            }
            return newDigits;
        }
       return digits;
    }
}