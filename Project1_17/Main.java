import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String s;
        BigInteger a,b;
        Scanner cin = new Scanner(System.in);
        s = cin.nextLine();
        String [] num = s.split(" ");
        BigInteger ans=new BigInteger("1");
        for (int i=0;i<num.length;i++)
        {
            ans = ans.multiply(BigInteger.valueOf(Integer.valueOf(num[i])));
        }
        System.out.println(ans);
    }
}
