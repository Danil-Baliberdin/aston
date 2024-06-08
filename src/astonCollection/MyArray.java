package astonCollection;

public class MyArray<T>  {
    private T[] array;
    private int arraySize;
    private final static int defaultSize = 20;
    private final static int multyplyer = 3;

    public MyArray(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("capacity <=0!");
        } else {
            array = (T[]) new Object[size];
        }
    }

    public MyArray() {
        array = (T[]) new Object[defaultSize];
    }

    private void growList() {
        int newCapacity = array.length * multyplyer;
        T[] newList = (T[]) new Object[newCapacity];
        System.arraycopy(this.array, 0, newList, 0, array.length);
        this.array = newList;
    }

    public void addElement(T element) {
        if (arraySize >= defaultSize) {
            growList();
        }
        array[arraySize++] = element;
    }

    public T get(int id){
        return array[id];
    }

    public T remove(int index) {
        T element = array[index];
        System.arraycopy(array, index + 1, array, index, arraySize - index - 1);
        arraySize--;
        array[arraySize] = null;
        return element;
    }
    public void addAll(MyArray<T> e) {
        for (int i = 0; i < e.arraySize; i++) {
            this.addElement(e.get(i));
        }
    }
    public void print() {
        for (T elem : array) {
            System.out.print(elem + ", ");
        }
    }


}
