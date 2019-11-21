
public class Test2{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int sum=sc.nextInt();
       System.out.println("阶乘为"+getnum(sum));
       
    }

    public static int getnum(int n){
        if(n==1)
        {
            return 1;
        }
        else
        return n*getnum(n-1);
    }
}



//递归求1+2+3+...10

public class Test2{
    public static void main(String[] args)
    {
       int n=10;
       System.out.println("求得的值为"+getnum(n));
     }

    public static int getnum(int n){
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n+getnum(n-1);
        }
    }
}


//按顺序打印一个数字的每一位

public class Test2{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       getnum(n);
       print(n);
       
    }

    public static void print(int num){
        if(num>9)
        {
            print(num/10);
        }
        System.out.println(num%10);
    }

    public static int getnum(int n){
        if(n/10==0)
        {
            System.out.println(n%10);
            return 0;
        }
       System.out.println(n%10);
       return getnum(n/10);
    }
}



//写一个递归方法，输入一个非负整数，返回组成它的数字之和
public class Test2{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       sum(n);
       
    }

    public static int sum(int n){
        if(n<10){
            return n;
        }
        return n%10+sum(n/10);
    }
}








