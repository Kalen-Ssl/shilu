package extend;

//�ӿ��ǳ������һ�ֱ��壬�ùؼ���interface����
/*interface �ӿ���
{
	//�����ͷ�������
}*/

//�ӿ��е����з������ǳ���ģ��������ݶ��ǹ��о�̬��������public static final���ԣ���һ�㲻д����

//�ɽӿ��������಻ͨ��extends�������ùؼ���implementsʵ��


interface IA{
	int a=1;
	void showa();
}

interface IB extends IA{  //�ӿ�IB�̳���IA
	int b=2;
	void showb();
}

interface IC extends IA,IB{  // �ӿ�IC�̳���IA,IB
	int c=3;
	void showc();
}

public class InterfaceTest implements IC {
	 public void showa(){
		 System.out.println("aaaa");
	 }
	 public void showb(){
		 System.out.println("bbbb");
	 }
	 public void showc(){
		 System.out.println("cccc");
	 }

}





