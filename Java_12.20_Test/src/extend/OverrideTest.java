package extend;

//����ļ̳й����У���������������ı����ͷ����븸����ԭ�е����ݺͷ���ͬ���������д�����ǣ��Ӹ���̳�������һ��
 class SuperCla{
    int a=3,b=4;
    void show(){
    	System.out.println("super result="+(a+b));
    }
}

class SubCla extends SuperCla{
	int a=10;  //��д�˸����еı���a
	void show(){  // ��д��ͬ������show
		int c=a*b;
		System.out.println("sub result="+c);
	}
	
}

public class OverrideTest{
	public static void main(String[] args){
		SuperCla sp=new SuperCla();
		SubCla sb=new SubCla();
		sp.show();  //�˴����ø����з���show
		System.out.println("in super class:a="+sp.a);
		sb.show();//������󸲸��˸����ͬ������
		System.out.println("in sub class:a="+sb.a);
	}
	
}
