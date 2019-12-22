package classTest;

public class OverLoad{
      int sum(int a,int b){
    	  return a+b;
      }
      
      int sum(int a,int b,int c){
    	  return a+b+c;
      }
      
      public static void main(String[] args){
    	  OverLoad o=new OverLoad();
    	  System.out.println(o.sum(1, 5));
    	  System.out.println(o.sum(3, 5,8));
      }
}
