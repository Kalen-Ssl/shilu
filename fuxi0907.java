package fuxi3;
import java.util.Stack;

public class fuxi0907 {


    //二叉树的镜像
    public class TreeNode{
        int val=0;
        TreeNode right=null;
        TreeNode left=null;
        public TreeNode(int val){
            this.val=val;
        }
    }
     public void Mirror(TreeNode node){
         if(node==null){
             return;
         }
         TreeNode temp=node.left;
         node.left=node.right;
         node.right=temp;
         Mirror(node.left);
         Mirror(node.right);
     }


     //循环二分查找
     public static int binSearch_1(int key,int[] array){
         int low=0;
         int high=array.length-1;
         int middle=0;
         if(key<array[low]||key>array[high]||low>high){
             return -1;
         }
         while(low<=high){
             middle=(low+high)/2;
             if(array[middle]==key){
                 return array[middle];
             }else if(array[middle]<key){
                   low=middle+1;
                 }else{
                high=middle-1;
             }
         }
         return -1;
     }


    //递归二分查找
     public static int binSearch_2(int key,int[] array,int low,int high){
         if(key<array[low]||key>array[high]||low>high){
             return -1;
         }
         int middle=(low+high)/2;
         if(array[middle]>key){
             return(binSearch_2(key,array,low,middle-1));
         }else if(array[middle]<key){
             return(binSearch_2(key,array,middle+1,high));
         }else{
             return array[middle];
         }
     }



      //二分查找
      public static void main(String[] args){
          int[] array={1,2,3,4,6,7,8,9,10};
          System.out.println(binSearch_2(7,array,0,8));
          System.out.println(binSearch_1(7,array));
      }


       //两个栈实现队列
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node){
            stack1.push(node);
        }

        public int pop() {
            if(stack2.empty()){
                while(stack1.size()>0){
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

}
