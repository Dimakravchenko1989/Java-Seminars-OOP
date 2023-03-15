package Seminar_4.gb.list;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    private int index;
    private final T[] values;

    public ArrayIterator(T[] values) {
        this.index = 0;
        this.values = values;
    }

    @Override
    public T next() {
        // TODO Auto-generated method stub
        return values[index++];
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return index < values.length;
    }
}