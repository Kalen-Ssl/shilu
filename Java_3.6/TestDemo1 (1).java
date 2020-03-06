import java.util.*;


class Person {

}
class Student extends Person{

}
class Teacher extends Person{

}
public class TestDemo1 {


    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        //HashMap<String,String> hashMap = new HashMap<>();
        map.put("国民女神","高圆圆");
        map.put("国民男神","李现");
        map.put("国民老公","王思聪");
        map.put("及时雨","宋江");
        //map.put("国民男神","高博");//如果有两个相同的key那么会覆盖掉原来的旧值。
        System.out.println(map);
        String value = map.getOrDefault("及时雨2","宋江");
        System.out.println(value);

        System.out.println(map.containsKey("及时雨2"));
        System.out.println(map.containsValue("宋江"));

        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.remove("及时雨"));

        Set<Map.Entry<String, String>> set = map.entrySet();
        System.out.println(set);

        System.out.println("=======Map.Entry==============");
        //实际当中的使用方法：
        for (Map.Entry<String, String> set2 : map.entrySet() ) {
            System.out.println(set2.getKey()+" "+set2.getValue());
        }

        int[] array = new int[10];
        for (int a : array) {

        }
    }


    public static void main1(String[] args) {
        Person person = new Student();//向上转型
        /*Student student = (Student) person;
        System.out.println(student);*/

        //类型转换异常-》向下转型没有满足 先向上转型
        Teacher teacher = (Teacher) person;
        System.out.println(teacher);
    }

    public static void main2(String[] args) {
        /*Collection collection2 = new LinkedList();
        Collection collection3 = new HashSet();//向上转型*/

        Collection<String> collection = new ArrayList<>();
        //collection.add(10);
        collection.add("gaobo");
        collection.add("hello");
        collection.add("gaobo");
        System.out.println(collection);
        boolean b = collection.isEmpty();
        System.out.println(b);
        //如果有多个  只删除其中的一个
        b = collection.remove("gaobo");
        System.out.println(b);
        System.out.println(collection);
        System.out.println(collection.size());
        System.out.println("===============");
        Object[] objects = collection.toArray();
        //String[] objects = (String[])collection.toArray(); error
        System.out.println(Arrays.toString(objects));

        //当前的集合之所以 可以用for each打印 原因是她实现了Iterable
        for (String s : collection) {
            System.out.println(s);
        }

       /* collection.clear();//清空
        System.out.println("=================");
        System.out.println(collection);*/

    }
}
