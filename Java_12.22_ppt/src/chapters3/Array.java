package chapters3;

public class Array<E>{
	private E[] data;
    private int size;
   //���캯�����������������capacity����Array
    @SuppressWarnings("unchecked")
	public Array(int capacity){
    	 data=(E[]) new Object[capacity];
    	 size=0;
    }
    
    public Array(){
    	//data=(E[]) new Object[10];
    	this(10);
    }
    
    //��ȡ���������
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
    
    
    //��ȡindexλ�õ�Ԫ��
    public E get(int index){
    	if(index<0||index>=size){
    		return null;
    	}
    	return data[index];
    }
    
    //�޸�indexλ�õ�Ԫ��Ϊe
    public void set(int index,E e){
    	if(index<0||index>=size){
    		return;
    	}
    	data[index]=e;
    }
    
    
    //�����������Ƿ���Ԫ��e
    public boolean contains(E e){
    	for(int i=0;i<size;i++){
    		if(data[i].equals(e)){
    			return true;
    		}
    	}
    	return false;
    }
    
    //����������Ԫ��e���ڵ�����
    public int find(E e){
    	for(int i=0;i<size;i++){
    		if(data[i].equals(e)){
    			return i;
    		}
    	}
    	return -1;
    }
    
    //ɾ��indexλ��Ԫ�أ������ظ�Ԫ��
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
    
    
    //��������ɾ��Ԫ��e
    public void removeElement(E e){
    	int index=find(e);
    	if(index!=-1){
    		remove(index);
    	}
    }
    
    //��дtoString
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
    
    //������ռ�������ı�
	private void resize(int newCapacity){
		@SuppressWarnings("unchecked")
		E[] newData=(E[])new Object[newCapacity];
		for(int i=0;i<size;i++){
			newData[i]=data[i];
		}
		data=newData;
	}
    
    
}
