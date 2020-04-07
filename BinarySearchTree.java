package work;
public class BinarySearchTree {

    static class Node {
        public int data;
        public Node left;
        public Node right;
        public Node(int data) {
            this.data = data;
        }
    }

    public Node root = null;

    public Node search(int val) {
        Node cur = root;
        while (cur != null) {
            if(cur.data == val) {
                return cur;
            }else if(cur.data < val) {
                cur = cur.right;
            }else {
                cur = cur.left;
            }
        }
        return null;
    }

    public boolean insert(int key) {
        Node node = new Node(key);
        if(root == null) {
            root = node;
            return true;
        }
        Node parent = null;
        Node cur = root;
        while (cur != null) {
            if(cur.data == key) {
                return false;
            }else if(cur.data < key) {
                parent = cur;
                cur = cur.right;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
        //cur == null
        if(key < parent.data) {
            parent.left = node;
        }else {
            parent.right = node;
        }
        return true;
    }

    public void remove(int key) {
        Node parent = null;
        Node cur = root;
        while (cur != null) {
            if(cur.data == key) {
                removeNode(parent,cur);
                return;
            }else if(cur.data < key) {
                parent = cur;
                cur = cur.right;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
    }
    private void removeNode(Node parent,Node cur) {
        if(cur.left == null) {
            //3种情况
            if(cur == root) {
                root = cur.right;
            }else if(cur == parent.left) {
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }
        }else if(cur.right == null) {
            if(cur == root) {
                root = cur.left;
            }else if(cur == parent.left) {
                parent.left = cur.left;
            }else {
                parent.right = cur.left;
            }
        }else {
            Node targetParent = cur;
            Node target = cur.right;//替罪羊
            while (target.left != null) {
                targetParent = target;
                target = target.left;
            }
            //并没有删除  只是一个简单的值的偷换
            cur.data = target.data;
            //分为两种情况：
            //1、因为是在右边找，找的是右边最小的数字，又因为右边最小的数字 肯定是左树为空
            //2、所以  删除的时候  分为两种情况
            if(target == targetParent.left) {
                targetParent.left = target.right;
            }else {
                targetParent.right = target.right;
            }
        }
    }

}
