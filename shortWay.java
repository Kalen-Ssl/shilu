package fuxi;
//矩阵最小路径和
import java.util.*;
public class shortWay {
    public static void main(String[]  args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] matrix = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                matrix[i][j] = s.nextInt();
            }
        }
        int[][] dp = new int[n][m];//dp i j  表示00到i j的最小路径值
        int ret = getMin(matrix,n,m,dp);
        System.out.println(ret);
    }

    public static int getMin(int[][] matrix,int row,int col,int[][] dp){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(j==0&&i==0){
                    dp[i][j] = matrix[i][j];
                }else if(j!=0&&i==0){
                    dp[i][j] = matrix[i][j] + dp[i][j-1];
                }else if(j==0&&i!=0){
                    dp[i][j] = matrix[i][j] + dp[i-1][j];
                }else{
                    dp[i][j] = matrix[i][j] + Math.min(dp[i][j-1],dp[i-1][j]);//边界问题
                }
            }
        }
        return dp[row-1][col-1];
    }
}
