package somess;

//给定一个整数1234567，输出它的二进制，八进制和十六进制表示形式
public class changenum {
	public static void main(String[] args){
		int a=1234567;
		System.out.println("二进制"+Integer.toBinaryString(a));
		System.out.println("八进制"+Integer.toOctalString(a));
		System.out.println("十六进制"+Integer.toHexString(a));
	}

}
