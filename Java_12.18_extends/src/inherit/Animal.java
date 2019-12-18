package inherit;

//public class Animal {
//    public Animal(){
//        System.out.println("I am Father");
//    }
//    public static void main(String[] args){
//        new cat();
//    }
//}
//
//class cat extends Animal{
//    public cat(){
//        System.out.println("I am son");
//    }
//    }
public class Animal{
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food){
        System.out.println(this.name+"正在吃"+food);
    }

    public static void main(String[] args){

        Animal animal=new Animal("熊猫");
        animal.eat("竹子");
        Cat cat=new Cat("蓝猫");
        cat.eat("小鱼干");
        Dog dog=new Dog("金毛");
        dog.eat("排骨");
    }
}


class Cat extends Animal{
    public Cat(String name){
      super(name);//表示调用父类方法或属性
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
}