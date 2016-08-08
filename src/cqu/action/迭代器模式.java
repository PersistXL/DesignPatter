package cqu.action;

public class ������ģʽ {
	public static void main(String[] args) {
		Collection collection = new MyCollection();
		Iterator it = collection.iterator();
		
		while(it.hasNext()){
			System.out.print(it.next()+" , ");
		}
	}
}

interface Collection {
	
	public Iterator iterator();
	
	/*ȡ�ü���Ԫ��*/
	public Object get(int i);
	
	/*ȡ�ü��ϴ�С*/
	public int size();
}

interface Iterator {
	//ǰ��
	public Object previous();
	
	//����
	public Object next();
	public boolean hasNext();
	
	//ȡ�õ�һ��Ԫ��
	public Object first();
}

class MyCollection implements Collection {

	public String string[] = {"A","B","C","D","E"};
	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		return string[i];
	}

	@Override
	public int size() {
		return string.length;
	}
}

class MyIterator implements Iterator {

	private Collection collection;
	private int pos = -1;
	
	public MyIterator(Collection collection){
		this.collection = collection;
	}
	
	@Override
	public Object previous() {
		if(pos > 0){
			pos--;
		}
		return collection.get(pos);
	}

	@Override
	public Object next() {
		if(pos<collection.size()-1){
			pos++;
		}
		return collection.get(pos);
	}

	@Override
	public boolean hasNext() {
		if(pos<collection.size()-1){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public Object first() {
		pos = 0;
		return collection.get(pos);
	}

}
