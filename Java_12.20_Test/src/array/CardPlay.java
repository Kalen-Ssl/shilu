package array;
import java.util.*;
//��дһ��ģ���java���Ƴ���Ҫ�������ƣ�Ҳ����108�ţ�����4���ˣ�����8�ŵ��ƣ����������ƺ�ÿ�������е���
//13x4=52,52x2=104�����ϴ�С������108��
// ����1-13
//����14-26
//����27-39
//÷��40-52
//С��53  ����54
public class CardPlay {
	public static void main(String[] args){
		int[] total=new int[108];//�洢108���Ƶ�����
		int[][] player=new int[4][25];//�洢�ĸ���ҵ���
		int leftNum=108;//ʣ���Ƶ�����
		int ranNumber;
		Random random=new Random();//����Random���������������
		for(int i=0;i<total.length;i++){
			total[i]=(i+1)%54;
			if(total[i]==0){
				total[i]=54;  //�����С�����
			}
		}
		//ѭ������
		for(int i=0;i<25;i++){  //Ϊÿ���˷���
			for(int j=0;j<player.length;j++){  //�˴�player.length�õ���������
				ranNumber=random.nextInt(leftNum);//���������������0��leftNum֮�����)
				player[j][i]=total[ranNumber];//����
				total[ranNumber]=total[leftNum-1];//ɾ���Ѿ���������
				leftNum--;
			}
		}
		//ѭ�����������е���
		for(int i=0;i<player.length;i++){
			System.out.println("���"+i+"���ƣ�");
			for(int j=0;j<player[i].length;j++){
				System.out.println(" "+player[i][j]);
			}
			System.out.println();
		}
		
		//�������
		System.out.println("����");
		for(int i=0;i<8;i++){
			System.out.println(" "+total[i]);
		}
		System.out.println();
		
	}

}
