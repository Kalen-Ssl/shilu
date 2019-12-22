package somes;

public class Circle implements CalcArea{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	public double getArea(){
		return radius*radius*3.14;
	}

}
