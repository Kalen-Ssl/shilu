
//public class Person {
//
//    public Person(){
//    }
//}
//
//class Student extends Person{
//    int age;
//    public Student(){
//        //super():   这句话子类默认就有这句话，所以无参构造本来就有，
//        //因此报错
//    }
//    public Student(int age){
//        }
//
//}

public class Person{
    public Person() {
        func();
    }

   public void func(){
       System.out.println("i am father");
   }
   public static void main(String[] args){
       // new Student();子类没有无参构造，先实例化父类，调用父类的func
       //因为func被子类复写，所以调用子类的func，因为还没走到子类的无参构造，所以
       //默认的仍然是0,所以输出 i am chind 0

       new Student().func();
       //输出i am chind0
            // i am chind10
   }
}


class Student extends Person{
    private int age=10;
    public void func(){
        System.out.println("i am chind"+age);
    }
}












