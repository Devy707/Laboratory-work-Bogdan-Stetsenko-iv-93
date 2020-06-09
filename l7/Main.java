package laba7;

import laba6.Plane;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList(new Plane(0, 0,0));
        myList.add(new Plane(1,1,1));
        myList.add(new Plane(2,2,2));

        MyList emptyList = new MyList();
        emptyList.add(new Plane(3,3,3));

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Plane(4,4,4));
        arrayList.add(new Plane(5,5,5));
        arrayList.add(new Plane(6,6,6));
        MyList list2 = new MyList(arrayList);

        Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ListIterator listIterator = list2.listIterator();
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
    }
}
