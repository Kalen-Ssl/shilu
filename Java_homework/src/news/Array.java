package news;
public class Array<E> {
	private E[] data;
	private int size;
	@SuppressWarnings("unchecked")
	//构造函数，传入数组的容量capacity构造Array
	public Array(int capacity){
		data=(E[])new Object[capacity];
		size=0;
	}
	
	//构造函数（无参），默认容量capacity=10
	public Array(){
		this(10);
	}
	
	//获取数组容量
	public int getCapacity()
	{
		return data.length;
	}
	
	//获取数组中的元素个数
	public int getSize(){
		return size;
	}
	
	//返回数组是否为空
	public boolean isEmpty(){
		return size==0;
	}
	//在指定位置插入一个新元素e
	public void add(int index,E e)
	{
		if(size==data.length)
			throw new IllegalArgumentException("");
		if(index<0||index>size)
			throw new IllegalArgumentException("");
		for(int i=size-1;i>=index;i--)
			data[i+1]=data[i];
			data[index]=e;
		size++;
	}
	
	//在所有元素后加一个新元素
	public void addLast(E e){
		add(size,e);
	}
	
	//在所有元素前加一个新元素
	public void addFirst(E e){
	add(0,e);}
	
   //获取index索引处的元素
	public E get(int index){
		if(index<0||index>=size)
		throw new IllegalArgumentException("GET");
		return data[index];
	}
	
	//修改index索引位置的元素为e
	public void set(int index,E e){
		if(index<0||index>=size)
		throw new IllegalArgumentException("SET");
		data[index]=e;
	}
	
	
	//查找数组中是否有元素e
	public boolean contains(E e){
		for(int i=0;i<size;i++){
			if(data[i].equals(e))
				return true;
		}
		return false;
	}
	
	
	//查找数组中元素e所在的索引，如果不存在元素e，则返回-1
	public int find(E e)
	{
		for(int i=0;i<size;i++){
			if(data[i]==(e))
				return i;
		}
		return -1;
	}
	
	//从数组中删除index位置的元素，返回删除的元素
	public E remove(int index)
	{
		if(index<0||index>=size)
			throw new IllegalArgumentException("remove");
		E ret=data[index];
		for(int i=index+1;i<size;i++)
			data[i-1]=data[i];
		size--;
		data[size]=null;
		return ret;
	}
	//从数组中删除第一个元素，返回删除的元素
	public E removeFirst(){
		return remove(0);
	}
	//从数组中删除最后一个元素，返回删除的元素
	public E removeLast(){
		return remove(size-1);
	}
	//从数组中删除元素e
	public void removeElement(E e){
		int index=find(e);
		if(index!=-1)
			remove(index);
	}
	
	public E getLast() {
		return get(size-1);
	}
	public String toString(){
    	StringBuilder res=new StringBuilder();
    	res.append(String.format("Array:size=%d, capacity=%d\n",size,data.length));
    	res.append('[');
    	for(int i=0;i<size;i++){
    		res.append(data[i]);
    		if(i!=size-1)
    			res.append(",");
    			
    	}
    	res.append(']');
    	return res.toString();
    }
}