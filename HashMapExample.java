package collection;



import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class HashMapExample {

    public static void main(String args[]) {

        /* This is how to declare HashMap */
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        /*Adding elements to HashMap*/
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");

        /* Display content using Iterator*/

       for (Map.Entry m : hmap.entrySet()){
        System.out.println(m.getKey()+" "+m.getValue());
       }
       HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
       Employee e1 = new Employee("ram",25,"werwerw");
       Employee e2 = new Employee("sigh",34,"76786");
       emp.put(1,e1);
       emp.put(2,e2);
       for (Map.Entry<Integer,Employee> m : emp.entrySet()){
           int key = m.getKey();
           Employee value = m.getValue();
           System.out.println(key+" info");
           System.out.println(value.name+" "+value.age+" "+value.dept);
       }
    }
}
