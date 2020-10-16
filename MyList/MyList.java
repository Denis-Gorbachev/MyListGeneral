package com.company;
import java.util.Collection;
import java.util.Iterator;

public class MyList <T> implements Collection<T> {
    class Node<T> {
        private T value;
        private Node <T> next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

        public T getValue() {
            return value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public boolean hasNext() {
            return (this.next != null ? true : false);
        }
    }

    private Node<T> begin;  
    private long length;
    private Comparable comparable;

    public MyList(Comparable compare) {
        this.begin = null;
        this.length = 0;
        this.comparable = compare;
    }

    public void swap(int firstpos, int secondpos) {
        Node<T> iter1;
        String a;
        Node<T> iter2;
        iter1 = indexAt(firstpos);
        iter2 = indexAt(secondpos);
        a = iter1.getValue().toString();
        iter1.setValue(iter2.getValue());
        iter2.setValue((T) a);
    }

    public Node<T> indexAt(int index) {
        Node<T> iter = this.begin;
        if (0 <= index && index <= this.length) { 
            for (int i = 0; i < index; ++i) {
                iter = iter.getNext(); 
            }
            return iter; 
        }else {
            return null; 
        }
    }

    public Node end() {
        if (this.begin == null)
            return null;

        Node iter = this.begin;
        while (iter.hasNext()) {
            iter = iter.getNext();
        }
        return iter;
    }

    public String toString() {
        String result = "[";
        if (this.begin != null) {
            Node iter = this.begin;
            while (iter.hasNext()) {
                result += iter.getValue().toString() + ", ";
                iter = iter.getNext();
        }
        result += iter.getValue().toString() + " ";
        }
        result += "]";
        return result;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add (T t) {
        if (this.begin == null) {
            this.begin = new Node(t);
        } else {
            this.end().setNext(new Node(t));
            }
        this.length++;
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
        while(true)
        {
            break;
        }
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
    public void sort() {
        Node iter;
        Node min;
        int k;
        for (int i = 0; i < this.length; ++i) {
            k = i;
            min = indexAt(i);
            for (int j = i; j < this.length; ++j) {
                iter = indexAt(j);
                if (this.comparable.compare(iter, min) <= 0) {
                    min = indexAt(j);
                    k = j;
                }
            }
            swap(i, k);
        }
    }
}
