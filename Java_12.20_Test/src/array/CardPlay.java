package array;
import java.util.*;
//编写一个模拟的java发牌程序，要求将两副牌，也就是108张，发给4个人，并留8张底牌，最后输出底牌和每个人手中的牌
//13x4=52,52x2=104，加上大小王，则共108张
// 红桃1-13
//方块14-26
//黑桃27-39
//梅花40-52
//小王53  大王54
public class CardPlay {
	public static void main(String[] args){
		int[] total=new int[108];//存储108张牌的数组
		int[][] player=new int[4][25];//存储四个玩家的牌
		int leftNum=108;//剩余牌的数量
		int ranNumber;
		Random random=new Random();//生成Random对象以生成随机数
		for(int i=0;i<total.length;i++){
			total[i]=(i+1)%54;
			if(total[i]==0){
				total[i]=54;  //处理大小王编号
			}
		}
		//循环发牌
		for(int i=0;i<25;i++){  //为每个人发牌
			for(int j=0;j<player.length;j++){  //此处player.length得到的是行数
				ranNumber=random.nextInt(leftNum);//生成随机数（生成0到leftNum之间的数)
				player[j][i]=total[ranNumber];//发牌
				total[ranNumber]=total[leftNum-1];//删除已经发过的牌
				leftNum--;
			}
		}
		//循环输出玩家手中的牌
		for(int i=0;i<player.length;i++){
			System.out.println("玩家"+i+"的牌：");
			for(int j=0;j<player[i].length;j++){
				System.out.println(" "+player[i][j]);
			}
			System.out.println();
		}
		
		//输出底牌
		System.out.println("底牌");
		for(int i=0;i<8;i++){
			System.out.println(" "+total[i]);
		}
		System.out.println();
		
	}

}
