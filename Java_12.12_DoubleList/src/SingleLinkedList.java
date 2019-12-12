 class DoubleNode{
    int val;
    public DoubleNode prev;
    public DoubleNode next;

     public DoubleNode(DoubleNode prev, int val, DoubleNode next) {
         this.val = val;
         this.prev = prev;
         this.next = next;
     }
 }

public class SingleLinkedList {
    private int size;
    private DoubleNode head;
    private DoubleNode last;

    public void addFirst(int val){
        DoubleNode node=new DoubleNode(null,val,null);
        if(last==null){
            head=last=node;
            size++;
            return;
        }
        node.next=head;
        head.prev=node;
        head=node;
        size++;
    }

    public void addLast(int val){
        DoubleNode node=new DoubleNode(null,val,null);
        if(head==null){
            head=last=node;
            size++;
            return;
        }
        node.prev=last;
        last.next=node;
        last=node;
        size++;
    }

    public void addIndex(int index,int val){
        if(index<0||index>size){
            System.out.println("输入错误");
        }else if(index==0){
            addFirst(val);
        }else if(index==size){
            addLast(val);
        }else{
            DoubleNode prev=node(index-1);
            DoubleNode node=new DoubleNode(prev,val,prev.next);
            prev.next=node;
            node.next.prev=node;
            size++;
        }
    }



  // 获取index位置的结点
    public DoubleNode node(int index) {
        if (index < (size >> 1)) {
            DoubleNode x = head;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
            return x;
        } else {
            DoubleNode x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x;
        }
    }


    public boolean rangeCheck(int index){
        if(index<0||index>size) {
            System.out.println("索引错误");
             return false;
        }else{
            return true;
        }
    }


    public int getSize(){
        return size;
    }


    public int get(int index){
        if(rangeCheck(index)){
            return node(index).val;
        }
        return -1;
    }



    public int set(int index){
        if(rangeCheck(index)){
            return node(index).val;
        }
        return -1;
    }



    public void remove(int data){
        DoubleNode x=head;
        while(x!=null){
            if(x.val==data){
                DoubleNode next=x.next;
                unlink(x);
                break;
            }else{
                x=x.next;
            }
        }
    }


    public void removeall(int data){
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

    public void print(){
        DoubleNode t=head;
        while(t!=null){
            System.out.println(t.val+"、");
            t=t.next;
        }
    }

    //删除链表中x结点
    public void unlink(DoubleNode x){
        DoubleNode prev=x.prev;
        DoubleNode next=x.next;
        if(prev==null){
            head=head.next;
        }else{
            prev.next=next;
            x.prev=null;
        }
        if(next==null){
            last=last.prev;
        }else{
            next.prev=prev;
            x.next=null;
        }
        x.val=0;
        size--;
    }




}
