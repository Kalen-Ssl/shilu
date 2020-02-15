
abstract  class Person{
    public abstract  void work();
}

class Student extends Person{
    public void work() {
        System.out.println("i am Student");
    }
}

class Worker extends Person{
    public void work() {
        System.out.println("i am worker");
    }
}

public class Test {
    public static void main(String[] args) {
       new Student().work();

    }
}
