package works;


//������Ԫһֻ��ĸ����Ԫһֻ��С��һԪ��ֻ��������100Ԫ��Ҫ��100ֻ�����г����ܵķ���
public class chick{
	public static void main(String[] args){
		int count=0;
		for(int i=0;i<=20;i++){
			for(int j=0;j<34;j++){
				for(int k=0;k<300;k=k+3){
					if((i+j+k==100)&&(i*5+j*3+k/3==100)){
						System.out.println(i+" ֻĸ��   "+j+" ֻ����   "+k+"ֻС��");
						count++;
					}
				}
			}
		}
		System.out.println("����"+count+"�ַ���");
	}

}
