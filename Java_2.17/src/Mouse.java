
public class Mouse implements USB {
    @Override
    public void setup() {
        System.out.println("鼠标插入电脑");
    }

    @Override
    public void work() {
        System.out.println("鼠标开始工作");
    }
}
