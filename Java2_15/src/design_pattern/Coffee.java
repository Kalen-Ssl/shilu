package design_pattern;

import java.io.IOException;

public class Coffee extends CaffeineBeverage{


    public void brew(){
        System.out.println("泡咖啡豆");
    }

    public void addCondiments(){

        System.out.println("加糖或牛奶");
    }


    public boolean isCustomerWantsCondiments(){
        System.out.println("您想要糖或牛奶吗？输入y或n");
        try {
            char c=(char)System.in.read();
            if(c=='y')return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}
