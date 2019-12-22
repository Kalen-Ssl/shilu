package extend;

//在类的继承过程中，如果子类中新增的变量和方法与父类中原有的数据和方法同名，则会重写（覆盖）从父类继承来的那一个
 class SuperCla{
    int a=3,b=4;
    void show(){
    	System.out.println("super result="+(a+b));
    }
}

class SubCla extends SuperCla{
	int a=10;  //重写了父类中的变量a
	void show(){  // 重写了同名方法show
		int c=a*b;
		System.out.println("sub result="+c);
	}
	
}

public class OverrideTest{
	public static void main(String[] args){
		SuperCla sp=new SuperCla();
		SubCla sb=new SubCla();
		sp.show();  //此处调用父类中方法show
		System.out.println("in super class:a="+sp.a);
		sb.show();//子类对象覆盖了父类的同名方法
		System.out.println("in sub class:a="+sb.a);
	}
	
}
