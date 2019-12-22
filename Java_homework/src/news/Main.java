package news;



public class Main {
    public static void main(String[] args){
    	Array<Integer> arr=new Array<Integer>(20);
    	for(int i=0;i<10;i++)
    		arr.addLast(i);
    	System.out.print(arr);
    	
    	arr.add(1, 100);
    	System.out.print(arr);
    	
    	arr.addFirst(-1);
    	System.out.print(arr);
    	
    	arr.remove(2);
    	System.out.print(arr);
    	
    	arr.removeElement(4);
    	System.out.print(arr);
    	
    	arr.removeFirst();
    	System.out.print(arr);
    	
    	
    	ArrayStack<Integer> stack=new ArrayStack<Integer>();
		for(int i=0;i<5;i++) {
    		stack.push(i);
    		System.out.println(stack);
    	}
    	stack.pop();
    	System.out.println(stack);
    }
}