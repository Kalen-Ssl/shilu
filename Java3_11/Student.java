import java.util.ArrayList;
import java.util.List;

class stu{
    private String name;
    private String banji;
    private int num;

    stu(String name, String banji, int num) {
        this.name = name;
        this.banji = banji;
        this.num = num;
    }

    @Override
    public String toString() {
        return "stu{" +
                "name='" + name + '\'' +
                ", banji='" + banji + '\'' +
                ", num=" + num +
                '}';
    }
}

public class Student {
    public static void main(String[] args){
        List<stu> list=new ArrayList<>();
        list.add(new stu("黎明","三班",8));
        list.add(new stu("王明","三班",8));
        System.out.println(list);
    }
}
