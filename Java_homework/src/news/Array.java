package news;
public class Array<E> {
	private E[] data;
	private int size;
	@SuppressWarnings("unchecked")
	//���캯�����������������capacity����Array
	public Array(int capacity){
		data=(E[])new Object[capacity];
		size=0;
	}
	
	//���캯�����޲Σ���Ĭ������capacity=10
	public Array(){
		this(10);
	}
	
	//��ȡ��������
	public int getCapacity()
	{
		return data.length;
	}
	
	//��ȡ�����е�Ԫ�ظ���
	public int getSize(){
		return size;
	}
	
	//���������Ƿ�Ϊ��
	public boolean isEmpty(){
		return size==0;
	}
	//��ָ��λ�ò���һ����Ԫ��e
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
	
	//������Ԫ�غ��һ����Ԫ��
	public void addLast(E e){
		add(size,e);
	}
	
	//������Ԫ��ǰ��һ����Ԫ��
	public void addFirst(E e){
	add(0,e);}
	
   //��ȡindex��������Ԫ��
	public E get(int index){
		if(index<0||index>=size)
		throw new IllegalArgumentException("GET");
		return data[index];
	}
	
	//�޸�index����λ�õ�Ԫ��Ϊe
	public void set(int index,E e){
		if(index<0||index>=size)
		throw new IllegalArgumentException("SET");
		data[index]=e;
	}
	
	
	//�����������Ƿ���Ԫ��e
	public boolean contains(E e){
		for(int i=0;i<size;i++){
			if(data[i].equals(e))
				return true;
		}
		return false;
	}
	
	
	//����������Ԫ��e���ڵ����������������Ԫ��e���򷵻�-1
	public int find(E e)
	{
		for(int i=0;i<size;i++){
			if(data[i]==(e))
				return i;
		}
		return -1;
	}
	
	//��������ɾ��indexλ�õ�Ԫ�أ�����ɾ����Ԫ��
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
	//��������ɾ����һ��Ԫ�أ�����ɾ����Ԫ��
	public E removeFirst(){
		return remove(0);
	}
	//��������ɾ�����һ��Ԫ�أ�����ɾ����Ԫ��
	public E removeLast(){
		return remove(size-1);
	}
	//��������ɾ��Ԫ��e
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