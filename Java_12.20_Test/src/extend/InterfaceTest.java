package extend;

//接口是抽象类的一种变体，用关键字interface定义
/*interface 接口名
{
	//变量和方法声明
}*/

//接口中的所有方法都是抽象的，所有数据都是公有静态常量，既public static final属性，但一般不写出来

//由接口生成子类不通过extends，而是用关键词implements实现


interface IA{
	int a=1;
	void showa();
}

interface IB extends IA{  //接口IB继承自IA
	int b=2;
	void showb();
}

interface IC extends IA,IB{  // 接口IC继承自IA,IB
	int c=3;
	void showc();
}

public class InterfaceTest implements IC {
	 public void showa(){
		 System.out.println("aaaa");
	 }
	 public void showb(){
		 System.out.println("bbbb");
	 }
	 public void showc(){
		 System.out.println("cccc");
	 }

}





