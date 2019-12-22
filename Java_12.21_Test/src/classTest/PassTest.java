package classTest;

//对象的基本使用方法
public class PassTest {
      float ptValue;
      
      public void changeInt(int value){  // 传值调用并不影响实际上的val
    	  System.out.println("In changeInt:"+value);
    	  value=55;
      }
      
      public void changeArrayValue(int xc[]){
    	  System.out.println("In changeArrayValue:"+xc[1]);
    	  xc[1]=6;
      }
      
      public static void main(String[] args){
    	  int val=11;
    	  int sc[]={1,9};
    	  PassTest pt=new PassTest();
    	  pt.ptValue=20;
    	  pt.changeInt(val);
    	  System.out.println(val);
    	  pt.changeArrayValue(sc);
    	  System.out.println(sc[1]);
      }
      
      
      
}
