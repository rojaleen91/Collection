package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
    public static void main(String[] args) {
        int a[] = new int[3];//static array size fixed

        //non-generic
        ArrayList ar = new ArrayList();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add("ram");
        ar.add(80.7);
        ar.add(90);
        // System.out.println(ar);//print all values from arraylist
        System.out.println(ar.size());//size of array
        System.out.println(ar.get(0));//print all values as per index
        for (int j = 0; j <= ar.size() - 1; j++) {
            System.out.println(ar.get(j));
        }
        //generic
        ArrayList<Integer> ai = new ArrayList<Integer>();
        ai.add(40);
        ai.add(50);
        System.out.println(ai.get(1));

        //*************************
        //employee class object
        Employee e1 = new Employee("ram", 26, "56768");
        Employee e2 = new Employee("ram2", 28, "596768");
        Employee e3 = new Employee("ram3", 56, "5665656");
        //create arraylist
        ArrayList<Employee> ar2 = new ArrayList<Employee>();
        ar2.add(e1);
        ar2.add(e2);
        ar2.add(e3);

        //iterator to traverse the values
        Iterator<Employee> itr = ar2.iterator();
        while (itr.hasNext()) {
            Employee emp = itr.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);
        }


        //****************addall
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("s");
        a1.add("d");
        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("sw");
        a2.add("i");
        a2.add("s");
        a1.addAll(a2);
        for (int k = 0; k <= a1.size() - 1; k++) {
            System.out.println(a1.get(k));
        }
        //***********removeall
        /*a1.removeAll(a2);
        for (int k = 0; k <= a1.size() - 1; k++) {
            System.out.println(a1.get(k));
        }*/
        //retainall
        a1.retainAll(a2);
        for (int k = 0; k <= a1.size() - 1; k++) {
            System.out.println(a1.get(k));
        }


    }

}
