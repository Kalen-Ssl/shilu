/**
 * @proargm: Java_2.17
 * @description:
 * @author:shilu
 * @create: 2020--17 19:32
 **/
public class UDisk implements USB {

    @Override
    public void setup() {
        System.out.println("U盘安装驱动");
    }

    @Override
    public void work() {
        System.out.println("U盘正常使用");
    }
}
