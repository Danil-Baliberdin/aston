import astonCollection.ArraySort;
import astonCollection.MyArray;

import java.sql.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        MyArray<Integer> array = new MyArray<Integer>(8);
        array.addElement(321);
        array.addElement(2);
        array.addElement(3);
        array.addElement(3213);array.addElement(4);
        array.addElement(4);
        array.addElement(3);

        array.print();

        ArraySort sorter = new ArraySort(array.getArray());
        sorter.bubbleSorter();
        sorter.printer();
    }
}
