package Classes;

public class ArrayListImplementation_01<E> extends FixedArray<E> {

	public ArrayListImplementation_01(int size) {
		super(size);
	}

	public ArrayListImplementation_01() {
		super();
	}
	
	public boolean add(E a) {
		if(getCurIndex() == getSize()) {
			growArray();
		}
		
		return super.add(a);
	}
	
	private void growArray() {
		setSize(2 * getSize());
		
		E[] newArray = (E[]) new Object[getSize()];
		
		for(int i = 0; i < getCurIndex(); i++) {
			newArray[i] = get(i);
		}
		
		setArray((E[]) newArray);
	}
	
}
