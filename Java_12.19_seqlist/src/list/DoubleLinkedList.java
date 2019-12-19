package list;


 class DoubleNode{

     DoubleNode prev;
      int val;
     DoubleNode next;

     public DoubleNode(DoubleNode prev, int val, DoubleNode next) {
         this.prev = prev;
         this.val = val;
         this.next = next;
     }
 }

public class DoubleLinkedList {
     private int size;
     private DoubleNode head;
     private DoubleNode last;

     //尾插
    public void addLast(int data){
        //产生一个新结点
        DoubleNode node=new DoubleNode(null,data,null);
        if(head==null){
            size++;
            head=last=node;
            return;
        }
        node.prev=last;
        last.next=node;
        last=node;
        size++;
    }



    public void addFirst(int data){
        DoubleNode node=new DoubleNode(null,data,null);
        if(head==null){
            size++;
            head=last=node;
            return;
        }
        node.next=head;
        head.prev=node;
        head=node;
        size++;
    }


    //取得index位置的结点
    public DoubleNode node(int index){
        //若index在中间位置的左边
        if(index<(size>>1)){
            //从左边开始遍历
            DoubleNode x=head;
            for(int i=0;i<index;i++){
                x=x.next;
            }
            return x;
        }else{
            DoubleNode x=last;
            for(int i=size;i>size-index;i++){
                x=x.prev;
            }
            return x;
        }
    }



    public void addIndex(int index,int data){
        if(index<0||index>size){
            System.out.println("索引非法");
            return;
        } else if (index == 0) {
            addFirst(data);
        }else if (index == size) {
            addLast(data);
        }else {
               //获得待插入结点的前驱结点
               DoubleNode prev=node(index-1);
               DoubleNode node=new DoubleNode(prev,data,prev.next);
               prev.next=node;
               node.next.prev=node;
               size++;
            }
    }


    public int get(int index) {
        if (rangeCheck(index)) {
            return node(index).val;
        }
        return -1;
    }


    //将链表中的x结点删除
    private void unlink(DoubleNode x) {
        DoubleNode prev = x.prev;
        DoubleNode next = x.next;
        //先处理前驱结点
        if(prev==null){
            head=head.next;
        }else{
            prev.next=next;
            x.prev=null;
        }
        //处理后继结点
        if(next==null){
            last=last.prev;
        }else{
            next.prev=prev;
            x.next=null;
        }
        x.val=0;
        size--;
    }


    //删除链表中指定数据的结点
    public void remove(int data) {
      DoubleNode x=head;
      while(x!=null){
          if(x.val==data){
              unlink(x);
              break;
          }else{
              x=x.next;
          }
      }
    }


    //删除链表中所有指定数据的结点
    public void removeAll(int data){
       DoubleNode x=head;
       while(x!=null){
           if(x.val==data){
               DoubleNode next=x.next;
               unlink(x);
               x=next;
           }else{
               x=x.next;
           }
       }
    }

    public void set(int index,int data) {
        if (rangeCheck(index)) {
            node(index).val = data;
            return;
        }
    }

    public void print() {
        DoubleNode x = head;
        while (x != null) {
            System.out.print(x.val +"、");
            x = x.next;
        }
    }

    public int getSize() {
        return size;
    }


    private boolean rangeCheck(int index) {
        if (index < 0 || index >= size) {
            System.out.println("索引非法!");
            return false;
        }
        return true;
    }




}
