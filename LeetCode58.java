package LeetCode;


public class LeetCode58 {
    public String reverseWords(String s) {
        String[] strings = s.trim().split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = strings.length - 1; i >= 0; i--) {
            if (strings[i].equals("")) {
                continue;
            }
            if (i == 0) {
                stringBuffer.append(strings[i].trim());
            } else {
                stringBuffer.append(strings[i].trim()).append(" ");
            }
        }
        return stringBuffer.toString();
    }
}
