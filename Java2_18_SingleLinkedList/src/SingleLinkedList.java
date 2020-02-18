

//车头
    class Node {
        private int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }


        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }


        public Node getNext() {
            return next;
        }


        public void setMext(Node next) {
            this.next = next;
        }

}



//火车
public class SingleLinkedList{
    private int size;
    private Node last;
    private  Node first;

    public Node getFirst(){
        return first;
    }

    public void add(int data){
        addLast(data);
    }



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


    public void addLast(int data){
        Node node=new Node(data,null);
        if(last==null){
            last=first=node;
            size++;
            return;
        }
        last.next=node;
        last=node;
        size++;

    }



    public void addIndex(int index,int data){
        if(index<0||index>size){
            System.out.println("索引非法");
            return;
        }
        else if(index==size){
            addLast(data);
        }else if(index==0){
            addFirst(data);
        }else{
            Node node=new Node(data,null);
            Node prev=getIndexNode(index-1);
            node.next=node;
            size++;
        }
    }


    public int get(int index){
        if(rangeCheck(index)){
            Node node = getIndexNode(index);
            return node.getData();
        }
        return -1;
    }



    public boolean contains(int data){
        Node temp=first;
        while(temp!=null){
            if(temp.getData()==data){
                System.out.println("找到元素");
                return true;
            }
            temp=temp.next;
        }
        System.out.println("没有指定元素");
        return false;
    }



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
//                }else{
//                    prev=prev.next;
//                }
//            }
//        }
        Node dummyHead=new Node(data-1,null);
        dummyHead.next=first;
        Node temp=dummyHead;
        while(temp.next!=null){
            if(temp.next.getData()==data){
                temp.next=temp.next.next;
                size--;
                break;
            }else{
                temp=temp.next;
            }
        }
        first=dummyHead.next;
     }




     public void removeAll(int data){
//        while(first!=null&&first.getData()==data){
//            first=first.next;
//            size--;
//        }
//        if(first==null){
//            return;
//        }else{
//            Node prev=first;
//            while(prev.next!=null){
//                if(prev.next.getData()==data){
//                    prev.next=prev.next.next;
//                    size--;
//                }else{
//                    prev=prev.next;
//                }
//            }
//        }
        Node dummyHead=new Node(data-1,null);
            dummyHead.next=first;
            Node prev=dummyHead;
            while(prev.next!=null){
                if(prev.next.getData()==data){
                    prev.next=prev.next.next;
                    size--;
                }else{
                    prev=prev.next;
                }
            }
            first=dummyHead.next;
     }


     public void set(int index,int data){
        if(rangeCheck(index)){
            Node node=getIndexNode(index);
            node.setData(data);
        }
     }




     public void print(){
        Node temp=first;
        while(temp!=null){
            System.out.println(temp.getData());
            temp=temp.next;
        }
        for(Node x=first;x!=null;x=x.next){
            System.out.println(x.getData()+".");
        }
     }





     private Node getIndexNode(int index){
        Node temp=first;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
     }


     private boolean rangeCheck(int index){
        if(index<0||index>=size){
            System.out.println("索引非法");
            return false;
        }
        return true;
     }






}

































