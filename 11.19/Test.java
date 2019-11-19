import java.util.Scanner;

 /*public class Test{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age=sc.nextInt();
        if(age<18){
            System.out.println("少年");
        } else if(age>=19&&age<=28){
            System.out.println("青年");    
        }else if(age>=29&&age<=55){
            System.out.println("中年");
        }else 
        {
            System.out.println("老年");
        }
    }
}


public class Test{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字：");
         //判断输入是不是整形
        while(sc.hasNextInt()){ 
        int x=sc.nextInt();
        //控制输出是否为素数
        boolean isPrime=true;
        if(x<=1)
        {
            isPrime=false;
        }
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                isPrime=false;
                break;
            }
        }
        
        if(isPrime)
        {
            System.out.println(x+"是素数");
        }
        else
        {
            System.out.println(x+"不是素数");
        }
      }
    }
}



public class Test{
    public static void main(String[] args)
    {
        
        for(int i=2;i<=100;i++)
        {
            boolean flag=true;
            for(int j=2;j<i;j++)
           {
            if(i%j==0)
            {
                flag=false;
                break;
            }
           }
        if(flag)
        {
            System.out.print(i+" ");
        }
        }
    }
}


public class Test{
    public static void main(String[] args){
       // for(i=1000;i<=2000;i++)
       // {
       //     if((i%4==0&&i%100!=0)||(i%400==0))
        //    System.out.print(i+" ");
       // }  
          for(int i=1000;i<=2000;i++)
          {
              if(i%100==0)
              {
                  if(i%400==0)
                  {
                         System.out.print(i+" ");
                  }
              }else{
                  if(i%4==0)
                  {
                       System.out.print(i+" ");
                  }
              }
          }
}
}



public class Test{
    public static void main(String[] args){
        {
            for(int i=1;i<=9;i++)
            {
                for(int j=1;j<i;j++)
                {
                    System.out.print(j+"*"+i+"="+i*j+"\t");
                }
                System.out.println();
            }
        }     
}
}


//最大公约数
public class Test{
    public static void main(String[] args){
            int num1=50;
            int num2=15;
            //找到两者间的最小值（最大公约数一定小于最小的那一个）
            int min=Math.min(num1,num2);
            for(int i=min;i>=1;i--)
            {
                if(num1%i==0&&num2%i==0)
                {
                    System.out.println("最大公约数为"+i);
                    break;
                }
            } 
}
}
//欧几里得算法
（50，15） 50%15=5
（15，5） 15%5=0
（50，15）



public class Test{
    public static void main(String[] args){
        double sum=0.0;
        double flag=1;
        for(double i=1;i<=100;i++)
        {
            sum=1/i*flag+sum;
            flag*=-1;
        }  
        System.out.println(sum);
}
}




public class Test{
    public static void main(String[] args){
        int flag=1;
        for(int i=10;i<100;i++)
        {
            if(i%10==9)
            {
                flag+=1;
            }
            if(i/10==9)
            {
                flag+=1;
            }
        }
        System.out.println("共出现"+flag+"次");
}
}




public class Test{
    public static void main(String[] args){
        for(int i=100;i<=999;i++)
        {
            int a=i%10;
            int b=i/10%10;
            int c=i/100;
           if(a*a*a+b*b*b+c*c*c==i)
           { 
               System.out.println(i);
        
           }
        }
        
}
}

public class Test{
    public static void main(String[] args){
     int i=12345678；
     while(i>0)
     {
         System.out.println(i%10)
         i/=10;
     }
}
}

*/

public class Test{
    public static void main(String[] args){
        int code=30;
     Scanner sc=new Scanner(System.in);
     int typeNumber=0;
     while(sc.hasNextInt()){
        typeNumber++;
        int number=sc.nextInt();
        if(number==code){
            System.out.println("登陆成功");
        }
        else{
             System.out.println("输入错误，重新输入");
        }
        if(typeNumber==3)
        {
            System.out.println("输入错误");
            break;
        }
     }
}
}