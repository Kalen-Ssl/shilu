package list;


class Node{
    private int data;
    Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
}




public class SingleLinkedList{
    private int size;
    private Node first;
    private Node last;

    public Node getFirst(){
        return first;
    }

    public void add(int data){
        addLast(data);
    }

    //头插法
    public void addFirst(int data){
        Node node=new Node(data,null);
        if(first==null){
            first=last=node;
            size++;
            return;
        }
            node.next=first;
            first=node;
            size++;

    }

    //尾插法
    public void addLast(int data){
        Node node=new Node(data,null);
        if(last==null){
            first=last=node;
            size++;
            return;
        }
            last.next=node;
            last=node;
            size++;

    }


    // 根据用户传入的index值取得对应的Node节点
    public Node getIndexNode(int index){
        Node temp=first;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

    /**
     * 根据用户传入的索引值获取节点值
     * @param index
     * @return
     */
    public int get(int index){
        if(rangeCheck(index)){
            Node node=getIndexNode(index);
            return node.getData();
        }
        return -1;
    }


    /**
    * 在链表任意索引处插入新的节点值data
    * @param index
    * @param data
    */
    public void addIndex(int index,int data){
        if(index<0||index>size) {
            System.out.println("索引错误");
            return;
        }else if(index==size){
            addLast(data);
        }else if(index==0){
            addFirst(data);
        }else{
            Node node=new Node(data,null);
            //找到待插入结点的前驱结点
            Node prev=getIndexNode(index-1);
            node.next=prev.next;
            prev.next=node;
            size++;
        }
    }


    /**
     * 查询链表中是否有指定内容节点
     * @param data
     * @return
     */
    public boolean contains(int data){
        Node temp=first;
        while(temp!=null){
            if(temp.getData()==data){
                System.out.println("找到元素");
                return true;
            }
            temp=temp.next;
        }
        System.out.println("未找到元素");
        return false;
    }


    /**
     * 删除第一个值为data的节点
     * @param data
     */
    public void remove(int data){
//        if(first.getData()==data){
//            first=first.next;
//            size--;
//            return;
//        }else{
//            Node prev=first;
//            while(prev.next!=null){
//                if(prev.next.getData()==data){
//                    prev.next=prev.next.next;
//                    size--;
//                    return;
//                }
//                prev=prev.next;
//            }
        //虚拟头结点法
        Node dummyHead=new Node(data-1,null);
        dummyHead.next=first;
        Node temp=dummyHead;
        while(temp.next!=null){
            if(temp.next.getData()==data){
                //此时temp就是待删除的前驱结点
                temp.next=temp.next.next;
                size--;
                break;
            }
            temp=temp.next;
        }
        first=dummyHead.next;
    }



    /**
     * 删除所有值为data的节点
     * @param data
     */
    public void removeAll(int data) {
//        //先删除头结点连续的
//        while(first!=null&&first.getData()==data){
//            first=first.next;
//            size--;
//        }
//        //此时的头结点一定不是要删除的结点
//        if(first==null){
//            return;
//        }else{
//            Node prev=first;
//            while(prev.next!=null){
//                if(prev.next.getData()==data){
//                    prev.next=prev.next.next;
//                    size--;
//                }
//                prev=prev.next;
//            }
//        }
        //虚拟头结点法
        Node dummyHead=new Node(data-1,null);
        dummyHead.next=first;
        Node prev=dummyHead;
        while(prev.next!=null){
            if(prev.next.getData()==data){
                prev.next=prev.next.next;
                size--;
            }
            prev=prev.next;
        }
        first=dummyHead.next;
   }


    /**
     * 修改指定index位置的节点为data值
     * @param index
     * @param data
     */
    public void set(int index,int data){
        if(rangeCheck(index)){
           Node node=getIndexNode(index);
           node.setData(data);
        }
    }


    //遍历一个链表
    public void print(){
//        Node temp=first;
//        while(temp!=null){
//            System.out.print(temp.getData()+"、");
//            temp=temp.next;
//        }

        for(Node x=first;x!=null;x=x.next){
            System.out.print(x.getData()+"、");
        }

    }



    private boolean rangeCheck(int index) {
        if (index < 0 || index >= size) {
            System.out.println("索引非法!");
            return false;
        }
        return true;
    }





    //回文链表
    public Node reverse(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newHead=new Node(head.getData(),null);
        while(head!=null){
            Node node=new Node(head.next.getData(),null);
            node.next=newHead;
            newHead=node;
            head=head.next;
        }
        return newHead;
    }







}
