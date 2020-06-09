package laba7;

import laba6.Plane;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList<E> implements List<Plane> {
    private Node head;
    private Node tail;
    private int size;
    public MyList(){
    }
    public MyList(Plane plane){
        add(plane);
    }
    public MyList(Collection<? extends Plane> collection){
        addAll(collection);
    }
    @Override
    public int size() {
        return size;
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
    public Iterator<Plane> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(Plane plane) {
        Node node = new Node(plane, null, null);
        if (head == null){
            head = node;
        }else{
            tail.setNext(node);
        }
        tail = node;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Plane> c) {
        boolean isCollectionChanged = false;
        for(Plane plane: c){
            isCollectionChanged |= add(plane);
        }
        return isCollectionChanged;
    }

    @Override
    public boolean addAll(int i, Collection<? extends Plane> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Plane get(int i) {
        return null;
    }

    @Override
    public Plane set(int i, Plane plane) {
        return null;
    }

    @Override
    public void add(int i, Plane plane) {

    }

    @Override
    public Plane remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Plane> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Plane> listIterator(int i) {
        return null;
    }

    @Override
    public List<Plane> subList(int i, int i1) {
        return null;
    }
}
