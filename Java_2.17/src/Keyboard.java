/**
 * @proargm: Java_2.17
 * @description:
 * @author:shilu
 * @create: 2020--17 19:23
 **/
public class Keyboard implements USB {
    @Override
    public void setup() {
        System.out.println("键盘插入电脑");
    }

    @Override
    public void work() {
        System.out.println("键盘开始工作");
    }


}
