package Classes;

public class ArrayListImplementation_02<E> extends FixedArray<E> {
	
	public ArrayListImplementation_02(int size) {
		super(size);
	}
	
	public ArrayListImplementation_02() {
		super();
	}

	@Override
	public boolean add(E a) {
		if(getCurIndex() == getSize()) {
			growArray();
		}

		return super.add(a);
	}

	private void growArray() {
		setSize((int) Math.ceil(1.5 * getSize()));
		
		E[] newArray = (E[]) new Object[getSize()];
		
		for(int i = 0; i < getCurIndex(); i++) {
			newArray[i] = get(i);
		}
		
		setArray((E[]) newArray);
	}
	
}
