package extend;

//�ؼ���abstract  abstract   abstract  abstract
//���ε��౻��Ϊ�����࣬��������һ�黹û����ȫʵ�ֵ��࣬��������ʵ�����κζ���������Ҫ��������������һЩ�����Ե����ݣ�Ȼ����������
//����ȥʵ����Щ�������������߿���Ч�ʣ�ͳһ�û��ӿڣ����Գ�������������Ϊ������ĸ���
//���һ����������󷽷�������뱻����Ϊ�����࣬�������಻һ��Ҫ�������󷽷�
 abstract class abs{
      abstract void show();
      abstract void show(int i);
}
 
 //��������������
 public class Real extends abs{
	 int x;
	 void show(){
		 System.out.println("x="+x);
	 }
	 void show(int i){
		 x=i;
		 System.out.println("x="+x);
	 }
 }
