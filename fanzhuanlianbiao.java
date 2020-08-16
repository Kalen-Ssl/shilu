package fuxi;

class Nodes{
      int data;
      Nodes next;
      public Nodes(int a){
          data=a;
      }
      public int getData(){
          return data;
      }
      public void setData(int a){
          this.data=a;
      }
      public Nodes getNext(){
          return next;
      }
      public void setNext(Nodes next){
          this.next=next;
      }
}

public class fanzhuanlianbiao {
    public static void main(String[] args) {
        Nodes head=new Nodes(0);
        Nodes node1=new Nodes(1);
        Nodes node2=new Nodes(2);
        Nodes node3=new Nodes(3);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        Nodes h=head;
        while(h!=null){
            System.out.println(h.getData()+" ");
            h=h.next;
        }
        head=rever(head);
        System.out.println("-----------");
        while(head!=null){
            System.out.println(head.getData());
            head=head.next;
        }
    }

    public static Nodes rever(Nodes head){
         if(head==null){
             return head;
         }
         Nodes pre=head;
         Nodes cur=head.getNext();
         Nodes tmp;
         while(cur!=null) {
             tmp = cur.getNext();
             cur.setNext(pre);

             pre = cur;
             cur = tmp;
         }
         head.setNext(null);
         return pre;
    }


}
