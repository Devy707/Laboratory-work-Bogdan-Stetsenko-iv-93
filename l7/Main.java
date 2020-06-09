package laba7;

import laba6.Plane;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList<>(new Plane(100,20,3000));
        System.out.println(myList);
        myList.add(new Plane(1,1,1));
        myList.add(new Plane(2,2,2));

        MyList emptyList = new MyList();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Plane(4,4,4));
        arrayList.add(new Plane(45,45,45));
        MyList list2 = new MyList(arrayList);
    }
}
