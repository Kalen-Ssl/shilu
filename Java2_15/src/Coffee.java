
public class Coffee{
    public void prepareRecipe(){
        boilWater();
        brewCoffeeBean();
        pourInCup();
        addSugarAndMilk();
    }
    public void boilWater(){
        System.out.println("把水烧开");
    }
    public void brewCoffeeBean(){
        System.out.println("泡咖啡豆");
    }
    public void pourInCup(){
        System.out.println("将咖啡倒入杯中");
    }
    public void addSugarAndMilk(){
        System.out.println("加糖或牛奶");
    }
}
