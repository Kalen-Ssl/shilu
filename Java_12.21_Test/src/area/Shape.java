package area;

abstract class Shape {
    public abstract double getArea();  // 抽象方法取得图形的面积
}

class Square extends Shape{
	private double height=0;
	public Square(double height){
		this.height=height;
	}
	public double getArea(){
		return (this.height*this.height);
	}
}

class Circle extends Shape{
	private double r=0;
	private final static double PI=3.14;
	public Circle(double r){
		this.r=r;
	}
	public double getArea(){
		return PI*r*r;
	}
}

class Triangle extends Shape{
	private double a=0;
	private double b=0;
	private double c=0;
	private double h=0;
	public Triangle(double a,double h){
		this.a=a;
		this.h=h;
	}
	public Triangle(double a,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public double getArea(){
		if(h==0){
			double s=(a+b+c)/2;
			return Math.pow(s*(s-a)*(s-b)*(s-c),0.5);
		}else{
			return (a*h/2);
		}
	}
}








