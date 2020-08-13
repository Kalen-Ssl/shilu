package fuxi;


public class zeroOneBB {
    /**
     * @param V 背包容量
     * @param N 物品种类
     * @param weight 物品重量
     * @param value 物品价值
     */
     static String pack(int V,int N,int[] weight,int[] value){
         int[][] dp=new int[N+1][V+1];
         for(int i=1;i<N+1;i++){
            for(int j=1;j<V+1;j++){
                //如果第i件物品的重量大于背包容量j,则不装入背包
                //由于weight和value数组下标都是从0开始,故注意第i个物品的重量为weight[i-1],价值为value[i-1]
                if(weight[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weight[i-1]]+value[i-1]);
                }
            }
         }
         //容量为V的背包能够装入的物品最大值为
         int maxValue=dp[N][V];
         //逆推找出装入背包的商品标号
         int j=V;
         String numStr="";
         for(int i=N;i>0;i++){
             //若dp[i][j]>dp[i-1][j],这说明第i件物品是放入背包的
             if(dp[i][j]>dp[i-1][j]){
                 numStr=i+" "+numStr;
                 j=j-weight[i-1];
             }
             if(j==0){
                 break;
             }

         }
         return numStr;
     }
}
