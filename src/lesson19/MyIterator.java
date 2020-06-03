package lesson19;

import data.Auto;

public interface MyIterator<T> {
    boolean hasNext();
    T next();
}
