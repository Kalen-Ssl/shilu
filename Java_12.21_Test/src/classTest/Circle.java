package classTest;

//������Circle�����������԰��������ܳ�
public class Circle {
	float x,y; //Բ������
	float radius;//�뾶
	
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
		System.out.println("���="+c.getArea());
		System.out.println("�ܳ�="+c.getCircumference());
	}

}
