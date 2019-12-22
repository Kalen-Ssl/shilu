package extend;


class A{
	void callme(){
		System.out.println("inside A");
	}
}

class B extends A{
	void callme(){
		System.out.println("inside B");
	}
}

public class Poly {
    public static void main(String[] args){
    	A a=new A();
    	B b=new B();
    	A c=new B();  //A被实例化成了子类B的一个对象，所以应该调用B的方法
    	a.callme();
    	b.callme();
    	c.callme();
    }
}







