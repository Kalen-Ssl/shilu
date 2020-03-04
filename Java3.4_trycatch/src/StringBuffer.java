
public class StringBuffer {

    public static void main(String[] args) {
        StringBuilder a=new StringBuilder("hello");
        a.append("world");


        StringBuilder b=new StringBuilder("abcdef");
        b.append("hello");
        String ret=b.toString();
    }


    public static void main2(String[] args) {
//            String s="";
//            for(int i=0;i<10;i++)
//                s+=i;

        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<10;i++){
            stringBuilder.append(i);
        }

    }

}

