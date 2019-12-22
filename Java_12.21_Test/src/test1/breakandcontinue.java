package test1;

public class breakandcontinue {
      public static void main(String[] args){
    	  //使用continue在每行打印五个数字
    	  for(int i=1;i<20;i++){
    		  System.out.print(i+" ");
    		  if(i%5!=0){
    			  continue;
    		  }
    		  System.out.println();
    	  }
      }
}
