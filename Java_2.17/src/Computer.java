
public class Computer  {
    //USB设备插入方法
    public void plugin(USB usb){
        usb.setup();
        usb.work();
    }
}
