package design_pattern;


import java.io.IOException;

public abstract class CaffeineBeverage {
    //冲泡流程
    //模板方法
    public final void prepareRecipe(){
       boilWater();
       //具体浸泡内容只有子类才知道
        //延迟实现
        brew();
        pourInCup();
        if(isCustomerWantsCondiments()) {
            addCondiments();
        }

    }

    public abstract void brew();
    public abstract void addCondiments();
    public void boilWater(){
        System.out.println("将水烧开");
    }
    public void pourInCup(){
        System.out.println("将饮料倒入杯中");
    }

    public boolean isCustomerWantsCondiments(){
        return true;
    }
}
