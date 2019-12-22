package chapters6;

abstract class Animals{
	public int num=10;
	public final int num2=20;
	public Animals(){}
	public abstract void show();
	public void method(){
		System.out.println("method");
	}
}

class Dogs extends Animals{
	public void show(){
		System.out.println("show dog");
	}
}

public class Abstract2 {
	public static void main(String[] args){
		Animals a=new Dogs();
		a.num=100;
		System.out.println(a.num);
		System.out.println(a.num2);
		a.show();
		a.method();
	}

}
