package collectionpract.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortSimpleArrayList {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        al.add("Viru");
        al.add("Saurav");
        al.add("Mukesh");
        al.add("Tahir");
        al.add("Anil");


        Collections.sort(al);

      Iterator<String> itr =  al.iterator();

      while (itr.hasNext())
      {
          System.out.println(itr.next());
      }


    }
}
