package fuxi2;

/**
 * @proargm: Java_ssl
 * @description:
 * @author:shilu
 * @create: 2020--29 22:39
 **/

class Node{
    long data;
    Node leftchild;
    Node rightchild;
    public Node(long data){
        this.data=data;
    }
}

public class Tree {
    private Node root;

    public void insert(long value){
        //创建新节点
        Node newNode=new Node(value);
        Node current=root;
        //如果root为null，则树为空
        if(root==null){
            root=newNode;
        }else{
            while(true){//如果当前节点数据比Value要小，则向左，否则向右
                if(current.data>value){
                    if(current.leftchild==null){
                        current.leftchild=newNode;
                        return;
                    }else{
                        current=current.leftchild;
                    }
                }else{
                    if(current.rightchild==null){
                        current.rightchild=newNode;
                        return;
                    }else{
                        current=current.leftchild;
                    }
                }
            }
        }
    }

    public Node find(long value){
        if(root == null)
            return null;
        Node current = root;
        while (current.data != value) {
            // 进行比较，查找值比当前节点小时，继续左边查找；否则右边查找
            if(current.data > value) {
                current = current.leftchild;
            } else {
                current = current.rightchild;
            }
            if(current == null)
                return null;
        }
        return current;
    }

    public void list(){

        inOrderTraverse(root);
    }

    private void inOrderTraverse(Node node) {
        if (node == null)
            return;
        inOrderTraverse(node.leftchild);
        System.out.print(node.data + " ");
        inOrderTraverse(node.rightchild);
    }


    public static void main(String[] args) {

        Tree tree = new Tree();

        int[] arr = new int[]{5,3,4,1,12,15,9,8,6,7,10,13,14,30};

        for (int i = 0; i < arr.length; i++) {
            tree.insert(arr[i]);
        }

        tree.list();
        System.out.println();
        tree.list();
    }



}



















