package Strings;

public class StringTest {
	public static void main(String[] args){
   //字符串长度
//	String s="We are student",tom="我们是学生";
//	int n1,n2;
//	n1=s.length();
//	n2=tom.length();
//	System.out.println(n1+" "+n2);
	//字符串比较
//	String tom=new String("we are students");
//	String boy=new String("WE are students");
//	String jerry=new String("we are students");
//	tom.equals(boy);  //返回false
//	tom.equals(jerry); //返回true
	//compareTo(String s)方法，按字典顺序参与数s指定的字符串大小，如果当前字符串与s相同，则该方法返回值0,如果当前字符串对象大于s，则
	//该方法返回正值，如果小于s，该方法返回负值，例如
	String str="abcde";
	str.compareTo("boy");  //小于0  
	str.compareTo("aba");  //大于0 
	str.compareTo("abcde");  //等于0
	
	                    
	
	}
}
