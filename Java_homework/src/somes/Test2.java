package somes;

public class Test2 {
	
	static CalcArea[] num={new Circle(1),new Rectangle(3,4),new Circle(8)};
	
	public static void main(String[] args){
		System.out.println(sumArea(num));
	}
	
	public  static double sumArea(CalcArea[] num){
		double areas=0;
		for(CalcArea i:num){
			areas+=i.getArea();
		}
		return areas;
	}

}
