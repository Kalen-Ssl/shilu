package somess;

//����һ������1234567��������Ķ����ƣ��˽��ƺ�ʮ�����Ʊ�ʾ��ʽ
public class changenum {
	public static void main(String[] args){
		int a=1234567;
		System.out.println("������"+Integer.toBinaryString(a));
		System.out.println("�˽���"+Integer.toOctalString(a));
		System.out.println("ʮ������"+Integer.toHexString(a));
	}

}
