package LeetCode;


public class LeetCode997 {
    public int findJudge(int N, int[][] trust) {
      int[] trusting=new int[N];
      int [] trusted =new int[N];
      int ans=0,num=0;
      for(int[] aTrust:trust){
          trusting[aTrust[0]-1]++;
          trusted[aTrust[1]-1]++;
      }
      for(int i=0;i<N;i++){
          if(trusted[i]==N-1&&trusting[i]==0){
              ans=i+1;
              num++;
          }
      }
      return num==1?ans:-1;
    }
}
