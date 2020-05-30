package tang;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoDemo2 {
    public static void main(String[] args) throws IOException {
        copyImage();
    }

    public static void copyImage() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("d:/rose.jpg");
            fileOutputStream = new FileOutputStream("d:/rose2.jpg");
            byte[] buffer = new byte[1024];
            int len = 0;
            while (true) {
                len = fileInputStream.read(buffer);
                if (len == -1) {
                    break;
                }

                fileOutputStream.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }


    public static void copyImage2() {
        try (FileInputStream fileInputStream = new FileInputStream("d:/rose.jpg");
             FileOutputStream fileOutputStream = new FileOutputStream("d:/rose2.jpg")) {
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}