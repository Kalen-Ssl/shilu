public class Test {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(3);
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        // 索引非法
        myArray.add(5);
        // 中间位置插入
        myArray.add(1,10);
        // 尾插
        myArray.add(6,20);
        // 头插
        myArray.add(0,100);
        myArray.print();
    }
}