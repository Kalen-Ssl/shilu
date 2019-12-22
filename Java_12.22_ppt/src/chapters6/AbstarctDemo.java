package chapters6;

abstract class Animal{
	public abstract void eat();
	public Animal(){};
}

abstract class Dog extends Animal{}

class Cat extends Animal{
     public void eat(){
    	 System.out.println("√®≥‘”„");
     }
}

public class AbstarctDemo {
	public static void main(String[] args){
		Animal a=new Cat();
		a.eat();
	}

}
