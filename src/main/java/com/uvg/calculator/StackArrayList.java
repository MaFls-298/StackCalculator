package com.uvg.calculator;

import java.util.ArrayList;
import java.util.Collection;

public class StackArrayList<T> implements Stack<T> {

    private final Collection<T> collection;
    private final ArrayList<T> list;

    public StackArrayList() {
        this.list = new ArrayList<>();
        this.collection = list; 
    }

    @Override
    public void push(T item) {
        list.add(item);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack vaciio");
        }
        return list.remove(list.size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack vacio");
        }
        return list.get(list.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }
}


