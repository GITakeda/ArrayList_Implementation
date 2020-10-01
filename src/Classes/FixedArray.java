package Classes;

public class FixedArray<E> {

    private E array[];
    private int size;
    private int curIndex = 0;

    public FixedArray(int size) {
        array = (E[]) new Object[size];
        this.size = size;
    }

    public FixedArray() {
        array = (E[]) new Object[10];
        this.size = 10;
    }

    public boolean add(E a) {
        if(curIndex == size) {
            return false;
        }

        array[curIndex++] = a;

        return true;
    }

    public boolean remove(int pos) {
        if(pos >= curIndex) {
            return false;
        }

        for(int i = pos; i < curIndex; i++) {
            if(i == size - 1) {
                array[i] = null;
                continue;
            }
            array[i] = array[i + 1];
        }

        curIndex--;

        return true;
    }

    public E get(int pos) {
        if(pos < curIndex) {
            return (E) array[pos];
        }

        return null;
    }

    protected void setArray(E[] array) {
        this.array = array;
    }

    protected void setSize(int size) {
        this.size = size;
    }

    protected void setCurIndex(int curIndex) {
        this.curIndex = curIndex;
    }

    protected E[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

    protected int getCurIndex() {
        return curIndex;
    }
}