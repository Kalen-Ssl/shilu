package chapters6;

public class Outer1 {
    private int k=20;
    public static void f1(){
    	
    }
    public class Inner1{
    	public void f(){
    		System.out.println("ssdsa");
    	}
    }
    public static void main(String[] args){
    	Outer1 outc=new Outer1();
    	Outer1.Inner1 inc=outc.new Inner1();
    	inc.f();
    }
    
}
