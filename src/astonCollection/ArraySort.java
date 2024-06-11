package astonCollection;

public class ArraySort<T>{
    private long[] a;
    private int elems;

    public ArraySort(T[] max){
        a = new long[max.length];
        elems = max.length;
        try{
            for (int i = 0; i < elems; i++) {
                a[i] = (int) max[i];
            }
        }catch (NullPointerException e){
        }

    }

    public void printer(){
        for (int i = 0; i < elems; i++){
            System.out.print(a[i] + " ");
            System.out.println("");
        }
        System.out.println("----Окончание вывода массива----");
    }

    private void toSwap(int first, int second){
        long dummy = a[first];
        a[first] = a[second];
        a[second] = dummy;
    }
    public void bubbleSorter(){


        for (int out = elems - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(a[in] > a[in + 1])
                    toSwap(in, in + 1);
            }
        }
    }
}
