package chapters6;
import java.util.Scanner;

public class Character {
  public static void main(String[] args){
       //ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ���
	  int bigCount=0;
	  int smallCount=0;
	  int numberCount=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("������һ���ַ�����");
	  String line =sc.nextLine();
	  char[] chs=line.toCharArray();
	  for(int x=0;x<chs.length;x++){
		  char ch=chs[x];
		  if(java.lang.Character.isUpperCase(ch)){
			  bigCount++;
		  }
		  else if(java.lang.Character.isLowerCase(ch)){
			  smallCount++;
		  }else if(java.lang.Character.isDigit(ch)){
			  numberCount++;
		  }
	  }
	  System.out.println(bigCount);
	  System.out.println(smallCount);
	  System.out.println(numberCount);
	  
	  
	  
  }


}
