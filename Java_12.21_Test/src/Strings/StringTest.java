package Strings;

public class StringTest {
	public static void main(String[] args){
   //�ַ�������
//	String s="We are student",tom="������ѧ��";
//	int n1,n2;
//	n1=s.length();
//	n2=tom.length();
//	System.out.println(n1+" "+n2);
	//�ַ����Ƚ�
//	String tom=new String("we are students");
//	String boy=new String("WE are students");
//	String jerry=new String("we are students");
//	tom.equals(boy);  //����false
//	tom.equals(jerry); //����true
	//compareTo(String s)���������ֵ�˳�������sָ�����ַ�����С�������ǰ�ַ�����s��ͬ����÷�������ֵ0,�����ǰ�ַ����������s����
	//�÷���������ֵ�����С��s���÷������ظ�ֵ������
	String str="abcde";
	str.compareTo("boy");  //С��0  
	str.compareTo("aba");  //����0 
	str.compareTo("abcde");  //����0
	
	                    
	
	}
}
