package org.example;

import java.util.Iterator;

public class RandomIterator implements Iterator<Integer> {

    protected Randoms randoms;

    public RandomIterator(Randoms randoms){
        this.randoms = randoms;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return randoms.generateValue();
    }

    @Override
    public void remove() {
    }
}
