package LeetCode;


public class LeetCode258 {
    public int addDigits(int num) {
        int sum = 10;
            while(sum/10!=0){
                sum = 0;
                while(num!=0){
                    int num_this = num % 10;
                    sum += num_this;
                    num = num/10;
                }
                num = sum;
            }
        return sum;
    }
}
