package fuxi3;


import java.util.Arrays;
import java.util.Stack;

public class fuxi0908{
   public class TreeNode {
       int val;
       TreeNode left=null;
       TreeNode right=null;
       public TreeNode(int val){
           this.val=val;
       }
   }


   //求二叉树的深度
    public int TreeDepth(TreeNode root){
       if(root==null){
           return 0;
       }
       int left=TreeDepth(root.left);
       int right=TreeDepth(root.right);
       return Math.max(left,right)+1;
    }


    //二分法求旋转数组
    public int MinArray(int[] array){
       int low=0;
       int high=array.length+1;
       while(low<high){
           int mid=(high+low)/2;
           if(array[mid]>array[high]){
               low=mid+1;
           }else if(array[mid]<array[high]){
               high=mid;
           }else{
               high=high-1;
           }
       }
       return array[low];
    }

    //构建乘积数组
    public int[] multiply(int[] A) {
        int n=A.length;
        int[] B=new int[n];
        for(int i=0;i<A.length;i++){
            B[i]=1;
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                if(i==j){
                    continue;
                }
                B[i]=B[i]*A[j];
            }
        }
        return B;
    }

    //用两个栈实现队列
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        int num=stack2.pop();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return num;
    }

    //重建二叉树
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
       if(pre==null){
           return null;
       }
       int rootVal=pre[0];
       if(pre.length==1){
           return new TreeNode(rootVal);
       }
       TreeNode root=new TreeNode(rootVal);
       int rootIndex=0;
       for(int i=0;i<pre.length;i++){
           if(in[i]==rootVal){
               rootIndex=i;
               break;
           }
       }
       root.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,rootIndex+1),Arrays.copyOfRange(in,0,rootIndex));
       root.right=reConstructBinaryTree(Arrays.copyOfRange(pre,rootIndex+1,pre.length),Arrays.copyOfRange(in,rootIndex+1,pre.length));
        return root;
    }

}














