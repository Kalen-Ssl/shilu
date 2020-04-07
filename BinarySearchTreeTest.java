package work;

public class BinarySearchTreeTest {

        public static void preOrder(BinarySearchTree.Node root) {
            if(root == null) {
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(BinarySearchTree.Node root) {
            if(root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

        public static void main(String[] args) {
            int[] array = {5,3,4,1,7,8,2,6,0,9};
            BinarySearchTree binarySearchTree = new BinarySearchTree();
            for (int val : array) {
                binarySearchTree.insert(val);
            }
            binarySearchTree.insert(5);
            preOrder(binarySearchTree.root);
            System.out.println();
            inOrder(binarySearchTree.root);
            System.out.println();
            System.out.println(binarySearchTree.search(7).data);
            binarySearchTree.remove(7);
            preOrder(binarySearchTree.root);
            System.out.println();
            inOrder(binarySearchTree.root);
            System.out.println();
        }

}
