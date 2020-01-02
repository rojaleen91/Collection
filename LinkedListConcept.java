package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("qtp");
        ll.add("selenium");
        ll.add("rpv");
        ll.add("rft");

        //get method
        System.out.println("Conetenf linked list"+ll);
        System.out.println(ll.get(0));

        //set method
        ll.set(0,"tom");
        System.out.println(ll.get(0));

        //remove method
        //ll.remove(0);
        System.out.println(ll);
       System.out.println("for loop");
        for (int i = 0;i<=ll.size()-1; i++)
        {
            System.out.println(ll.get(i));
        }
        System.out.println("advance for loop");
       for (String str:ll)
       {
           System.out.println(str);

        }
       System.out.println("iterator");
        Iterator<String> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
