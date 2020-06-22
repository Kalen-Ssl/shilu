package days;




public class day16_1 {
    public static void main(String[] args) {
        long a=0;
        long b=1;
        long sum=1;
        a=10*30;
        for(int i=2;i<=30;i++) {
            b = b * 2;
            sum = sum + b;
        }
        System.out.println(a+" "+sum);
    }
}
