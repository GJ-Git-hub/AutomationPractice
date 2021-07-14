package collectionpract.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdAllCollectionExample {

    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        al.add("C");
        al.add("Core Java");
        al.add("Advance_Java");

        System.out.println("Inisial List =" +al);

        Collections.addAll(al,"C++","Python");

        System.out.println("After use collection =" +al);

        String[] arr = {"PHP","Javascript"};

        Collections.addAll(al,arr);

        System.out.println("After Add array List " +al);
        Collections.sort(al, Collections.<String>reverseOrder());

        System.out.println("Sorted List " +al);

    }
}
