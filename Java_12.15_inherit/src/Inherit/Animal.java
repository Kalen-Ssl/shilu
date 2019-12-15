package Inherit;

public class Animal {
   public String name;

    public void eat(String food){
        System.out.println(this.name+ "正在吃" +food);
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "pig";
        animal.eat("糠");
        Cat cat = new Cat();
        cat.name = "加菲猫";
        cat.eat("鱼");
        Dog dog = new Dog();
        dog.name = "泰迪";
        dog.eat("啥都吃");
    }
}

class Cat extends Animal{
    public String name;
    public void eat(String food){
        System.out.println(this.name+ "正在吃" +food);
    }
}

class Dog extends Animal{
    public String name;
    public void eat(String food){
        System.out.println(this.name+ "正在吃" +food);
    }
}

//public class Animal{
//    public String name;
//    public void eat(String food){
//        System.out.println(this.name+ "正在吃" +food);
//    }
//
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.name = "二哈";
//        dog.eat("狗粮");
//        Cat cat = new Cat();
//        cat.name = "加菲猫";
//        cat.eat("鱼");
//    }
//}
//
//class Cat extends Animal{}
//class Dog extends Animal{}
//
//public class Animal{
//    private String name;
//
//    public Animal(String name) {
//        this.name = name;
//    }
//
//    protected void eat(String food){
//        System.out.println(this.name+ "正在吃" +food);
//    }
//
//    public static void main(String[] args) {
//        Cat cat = new Cat("加菲猫");
//        cat.eat("猫粮");
//    }
//}
//
//class Cat extends Animal{
//    public Cat(String name){
//        //this();
//        super(name);
//    }
//}
//class Dog extends Animal{
//
//}

//public class Animal{
//    protected String name;
//    int age;//包权限
//    public void eat(String food){
//        System.out.println(this.name +"正在吃" + food);
//    }
//}
//
//class Cat extends Animal{}
//class Dog extends Animal{}