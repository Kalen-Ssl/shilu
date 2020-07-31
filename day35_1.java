package days;


import java.util.Scanner;

public class day35_1 {

     //判断原字符串和翻转字符串的最长公共子序列长度是否比原字符串长度小1或相等

    public static int lcs(String s,String s1){
        if(s==null||s1==null){
            return 0;
        }
        int m=s.length();
        int n=s1.length();
        int[][] dp=new int[m+1][n+1];
        dp[0][0]=0;
        for(int i = 1; i < m; i++) {
            dp[0][i] = 0;
        }
        for(int i = 1; i < m; i++) {
            dp[i][0] = 0;
        }
        for(int i = 1;i < m + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                if(s.charAt(i - 1) == s1.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            String s1=new StringBuilder(s).reverse().toString();
            int len=lcs(s,s1);
            if(s.length()-len<=1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }

}
