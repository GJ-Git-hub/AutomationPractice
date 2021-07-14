package collectionpract.collections;

import java.util.*;

public class SortArrayListUsingComparatorClass {

    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(50);
        al.add(30);
        al.add(60);
        al.add(20);
        al.add(90);

        Comparator cmp = Collections.reverseOrder();
        Collections.sort(al,cmp);
        System.out.println("Printing Sort in decentding order");

       Iterator<Integer> itr = al.iterator();
       while (itr.hasNext())
       {
           System.out.println(itr.next());
       }

    }
}
