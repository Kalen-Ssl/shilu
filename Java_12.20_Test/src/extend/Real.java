package extend;

//关键词abstract  abstract   abstract  abstract
//修饰的类被称为抽象类，抽象类是一组还没有完全实现的类，不能用它实例化任何对象，它的主要作用是用来描述一些概念性的内容，然后在子类中
//具体去实现这些概念，这样可以提高开发效率，统一用户接口，所以抽象类更多的是作为其他类的父类
//如果一个类包含抽象方法，则必须被定义为抽象类，但抽象类不一定要包含抽象方法
 abstract class abs{
      abstract void show();
      abstract void show(int i);
}
 
 //定义抽象类的子类
 public class Real extends abs{
	 int x;
	 void show(){
		 System.out.println("x="+x);
	 }
	 void show(int i){
		 x=i;
		 System.out.println("x="+x);
	 }
 }
