import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch{

//    public static void func(){
//        int[] array=null;
//        System.out.println(array[8]);
//    }
//    public static void main(String[] args){
//        try{
//            func();
//        }catch(NullPointerException e){
//            e.printStackTrace();
//        }
//    }


    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        try{
            int n=scanner.nextInt();
            System.out.println(n);
        }catch(InputMismatchException e){
            e.printStackTrace();
        }finally {
            scanner.close();
        }


//        int[] array=new int[3];
//        try{
//            System.out.println(array[20]);
//            System.out.println("bit");
//        }catch(NullPointerException|ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//            System.out.println("NullPointerException|ArrayIndexOutOfBoundsException catch");
//        }
//        System.out.println("after");



//        int[] array=new int[3];
//        try{
//            array=null;
//            System.out.println(array[2]);
//            System.out.println("bit");
//        }catch(NullPointerException e){
//            e.printStackTrace();
//            System.out.println("NullPointerException catch");
//        }catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//            System.out.println("ArrayIndexOutOfBoundsException catch");
//        }
//        System.out.println("after");
//



//      int[] array=new int[3];
//      try {
//          System.out.println(array[2]);
//      }catch(ArrayIndexOutOfBoundsException e){
//         e.printStackTrace();
//          System.out.println("catch");
//      }
//        System.out.println("after");
    }
}
