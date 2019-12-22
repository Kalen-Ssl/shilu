package area;

public class TestShape {
	public static void main(String[] args){
		Shape square=new Square(3);
		Shape circle=new Circle(2);
		Shape triangle1=new Triangle(3,4,5);
		Shape triangle2=new Triangle(3,4);
		System.out.println(square.getArea());
		System.out.println(circle.getArea());
	}

}
