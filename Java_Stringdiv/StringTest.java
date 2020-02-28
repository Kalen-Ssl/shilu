import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
         String s="ab-cd,ef,sg-fd";
        String[] strings1=s.split(",",3);
        for(int i=0;i<strings1.length;i++){
            String[] strings2=strings1[i].split("-");
            for(int j=0;j<strings2.length;j++){
                System.out.println(strings2[j]);

            }
        }
    }

    public static void main2(String[] args) {
        byte[] bytes={97,98,99,100};
        String s=new String(bytes);
        System.out.println(s);

        String s1="abcd";
        System.out.println(s1);
        byte[] bytes1=s1.getBytes();
        System.out.println(Arrays.toString(bytes1));

    }
}
