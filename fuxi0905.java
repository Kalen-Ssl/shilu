package fuxi3;


import java.util.Scanner;

public class fuxi0905 {

    //最长公共子序列-动态规划
    public static int FindLCS(String A,int n,String B,int m){
        int[][]dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j]=0;
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(A.charAt(i-1)==B.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                   // dp[i][j]=dp[i-1][j]>dp[i][j-1]?dp[i-1][j]:dp[i][j-1];
                }
            }

        }
        return dp[n][m];
    }

    //最长公共子串-动态规划
    public static int getCommon(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=0;
                }

            }
        }
        int max=0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(dp[i][j]>max){
                    max=dp[i][j];
                }
            }
        }
        return max;
    }

    public static void main3(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str1=sc.nextLine().toLowerCase();
            String str2=sc.nextLine().toLowerCase();
            //System.out.println(FindLCS(str1,str1.length(),str2,str2.length()));
            System.out.println(getCommon(str1,str2));
        }
    }



    //相反数：一个数倒过来加上它本身，如1325的相反数是5231+1325=6556
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String n=String.valueOf(num);
        int flag=n.length()-1;
        while(n.charAt(flag)==0){
            flag--;
        }
        String result="";
        for(;flag>=0;flag--){
            result+=n.charAt(flag);
        }
        int nums=num+Integer.parseInt(result);
        System.out.println(nums);
    }



   //最大公约数

    //辗转相除法
    //2个数相除，得出余数
    //如果余数不为0，则拿较小的数与余数继续相除，判断新的余数是否为0
    //如果余数为0，则最大公约数就是本次相除中较小的数。
   public static int GCD(int m,int n) {
        int result=0;
        while(n!=0){
            result=m%n;
            m=n;
            n=result;
        }
        return m;
   }
   public static void main6(String[] args) {
       System.out.println(GCD(25,10));
   }


   //最小公倍数
   //两数相乘再除以他们的最大公约数
   public static void main(String[] args) {
       System.out.println(5*15/GCD(15,5));
   }

}


