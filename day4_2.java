package days;

import java.util.Scanner;

//删除公共字符
public class day4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        for (int i = 0; i < second.length(); i++) {
            String temp = String.valueOf(second.charAt(i));
            first = first.replaceAll(temp, "");
        }
        System.out.println(first);
    }
}
