public class Blank {
    public static void main(String[] args) {
        int blank=0;
        String txt="Hello   World I";
        String[] count1 =txt.split("[ \\t\\n\\x0B\\f\\r]");
        int len=count1.length;
        for (int i = 0; i < count1.length; i++) {
            if (count1[i].equals("")) {
                blank++;
            }
        }

        System.out.println("单词个数："+(len-blank));
    }
}
