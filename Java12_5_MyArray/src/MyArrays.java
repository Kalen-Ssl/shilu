import java.util.Arrays;
public class MyArrays {
    int num[];
    int size;

    public MyArrays(int length){
        this.num=new int[length];
    }


    //数组尾插
    public void add(int data){
        if(size==num.length){
            grow();
        }
        num[size]=data;
        size++;
    }

    //指定位置插入元素
    public void add(int index,int data) {

        if (index < 0 || index > size) {
            System.out.println("索引非法!");
            return;
        }
        if (index == size) {
            add(data);
        }else{

           if (size == num.length) {
             grow();
        }

        System.arraycopy(num, index, num, index + 1, size - index);
        num[index] = data;
        size++;
        }

    }

    public void print()
    {
        //这里的for each为什么会存在问题？
       /* for(int i:num){
            System.out.print(num[i]+" ");
        }
        */
       for(int i=0;i<size;i++){
           System.out.print(num[i]+" ");
       }
        System.out.println();
    }


    public boolean delect(int data){
        for(int i=0;i<size;i++){
           if(num[i]==data)
           {
               System.arraycopy(num,i+1,num,i,size-i-1);
               num[size]=0;
               size--;
               return true;
           }
        }
        return false;
    }

    public int search(int data){
        for(int i=0;i<size;i++){
            if(num[i]==data){
                return i;
            }
        }
        return -1;
    }

    public void exchange(int index,int data){
       if(ifs(index))
       {
           num[index]=data;
       }

    }

    public void clear()
    {
        for(int i=0;i<size;i++){
            num[i]=0;
        }
        size=0;
    }

    private void grow(){
        num=Arrays.copyOf(num,num.length<<1);
    }

    private boolean ifs(int index){
        if(index<0&&index>size){
            System.out.println("输入错误");
            return false;
        }
        return true;
    }

}
