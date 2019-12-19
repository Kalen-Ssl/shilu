package array;


public class Test {
    public static void main(String[] args){
        MyArray myArray=new MyArray(3);
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(1,10);
        myArray.remove(4);
        myArray.print();
    }
}
