package classTest;

//定义类Circle，并输出任意园的面积和周长
public class Circle {
	float x,y; //圆心坐标
	float radius;//半径
	
	double getArea(){
		return radius*radius*Math.PI;
	}
	
	double getCircumference(){
		return 2*Math.PI*radius;
	}
	
	
	
	public static void main(String[] args){
		Circle c=new Circle();
		c.radius=3;
		c.x=0;
		c.y=0;
		System.out.println("面积="+c.getArea());
		System.out.println("周长="+c.getCircumference());
	}

}
