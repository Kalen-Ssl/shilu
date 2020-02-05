public class LeetCode202{
    public boolean isHappy(int n) {
        if(n==4){
            return false;
        }
        int result = 0;
        while(n>0){
            result += Math.pow(n%10,2);
            n = n/10;
        }
        return result==1?true:isHappy(result);
    }
}
