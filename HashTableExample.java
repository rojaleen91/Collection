package collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableExample {
    public static void main(String args[]) {

        Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
        h1.put(1,"tanvi");
        h1.put(2,"roja");
        h1.put(3,"raju");
        //create a clone copy
        Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
        h2 = (Hashtable)h1.clone();
        System.out.println("values of hashtable h1"+" "+h1);
        System.out.println("values of hashtable h2"+" "+h2);
        //clear value
        h1.clear();
        System.out.println("values of hashtable h1"+" "+h1);
        System.out.println("values of hashtable h2"+" "+h2);
        //contains value
        Hashtable h3 = new Hashtable();
        h3.put(4,"naveen");
        h3.put(5,"manager");
        h3.put(6,"selenium");
        if (h3.containsValue("naveen")){
            System.out.println("value is found");
        }
        //print all values from hashtable using ----Enumeration..elements()....
        Enumeration em = h3.elements();
        System.out.println("print valus from hashtable using enumaration elements");
        while (em.hasMoreElements()){
            System.out.println(em.nextElement());
        }
        //get all the valus from hashtable using entryset
        System.out.println("print valus from hashtable using entryset");
        Set s = h3.entrySet();
        System.out.println(s);
        Hashtable h4 = new Hashtable();
        h4.put(4,"naveen");
        h4.put(5,"manager");
        h4.put(6,"selenium");

        //check both hash tables are equal or not
       if (h3.equals(h4)){
           System.out.println("equal");
       }
       //get the values from specific key
        System.out.println(h4.get(4));

       //GET HASHCODE of each object
        System.out.println(h3.hashCode());


    }
}
