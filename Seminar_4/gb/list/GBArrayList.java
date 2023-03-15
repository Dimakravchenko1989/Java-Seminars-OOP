package Seminar_4.gb.list;
import java.util.Iterator;
import Seminar_4.gb.GBList;


public class GBArrayList<T> implements GBList<T> {
    private T[] values;

    public GBArrayList() {
        this.values = (T[]) new Object[0];
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(values);
    }

    @Override
    public boolean add(T type) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = type;
            return true;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void remove(int index) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountAfterIndex);
            
        } catch (ClassCastException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, T type) {
        values[index] = type;
    }

}
