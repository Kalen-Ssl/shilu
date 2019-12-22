package chapters3;

public class Array<E>{
	private E[] data;
    private int size;
   //构造函数，传入数组的容量capacity构造Array
    @SuppressWarnings("unchecked")
	public Array(int capacity){
    	 data=(E[]) new Object[capacity];
    	 size=0;
    }
    
    public Array(){
    	//data=(E[]) new Object[10];
    	this(10);
    }
    
    //获取数组的容量
    public int getCapacity(){
    	return data.length;
    }
    
    public int getSize(){
    	return size;
    }
    
    public boolean isEmpty(){
    	return size==0;
    }
    
    public void add(int index,E e){
    	if(size==data.length){
    		return;
    	}
    	if(index<0||index>size){
    		return;
    	}
    	for(int i=size-1;i>=index;i--){
    		data[i+1]=data[i];
    	}
    	data[index]=e;
    	size++;
    }
    
    public void addLast(E e){
    	add(size,e);
    }
    
    public void addFirst(E e){
    	add(0,e);
    }
    
    
    //获取index位置的元素
    public E get(int index){
    	if(index<0||index>=size){
    		return null;
    	}
    	return data[index];
    }
    
    //修改index位置的元素为e
    public void set(int index,E e){
    	if(index<0||index>=size){
    		return;
    	}
    	data[index]=e;
    }
    
    
    //查找数组中是否有元素e
    public boolean contains(E e){
    	for(int i=0;i<size;i++){
    		if(data[i].equals(e)){
    			return true;
    		}
    	}
    	return false;
    }
    
    //查找数组中元素e所在的索引
    public int find(E e){
    	for(int i=0;i<size;i++){
    		if(data[i].equals(e)){
    			return i;
    		}
    	}
    	return -1;
    }
    
    //删除index位置元素，并返回该元素
    public E remove(int index){
    	if(index<0||index>=size){
    		return null;
    	}
    	E ret=data[index];
    	for(int i=index+1;i<size;i++){
    		data[i-1]=data[i];
    	}
    	size--;
    	data[size]=null;
    	return ret;
    }
    
    public E removeFirst(){
    	return remove(0);
    }
    
    public E removeLast(){
    	return remove(size-1);
    }
    
    
    //从数组中删除元素e
    public void removeElement(E e){
    	int index=find(e);
    	if(index!=-1){
    		remove(index);
    	}
    }
    
    //重写toString
    public String toString(){
    	StringBuilder res=new StringBuilder();
    	res.append(String.format("Array:size=%d,capacity=%d\n",size,data.length));
    	res.append("[");
    	for(int i=0;i<size;i++){
    		res.append(data[i]);
    		if(i!=size-1){
    			res.append(",");
    		}
    		else{
    			res.append("]");
    		}
    	}
    	return res.toString();
    }
    
    //将数组空间的容量改变
	private void resize(int newCapacity){
		@SuppressWarnings("unchecked")
		E[] newData=(E[])new Object[newCapacity];
		for(int i=0;i<size;i++){
			newData[i]=data[i];
		}
		data=newData;
	}
    
    
}
