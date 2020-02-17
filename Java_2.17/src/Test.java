/**
 * @proargm: Java_2.17
 * @description:
 * @author:shilu
 * @create: 2020--17 19:29
 **/
public class Test {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.plugin(new Mouse());
        computer.plugin(new Keyboard());
        computer.plugin(new UDisk());
    }
}
