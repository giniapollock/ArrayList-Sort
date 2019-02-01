// Virginia Pollock
// CIS 2353
// Fall 2018
// Prof. John P. Baugh

import java.util.ArrayList;
import java.util.Collections;

public class ArrList {
   
static class Pair {
    
    int item1;
    int item2;

    public Pair(int item1, int item2) {
      this.item1 = item1;
      this.item2 = item2;
    }

    @Override
    public String toString() {
      return "(" + item1 + "," + item2 + ")";
    }
}


public static ArrayList<ArrList.Pair> closestNumbers(ArrayList<Integer> list) {

    ArrayList<Integer> temp = new ArrayList<Integer>(list);
    ArrayList<ArrList.Pair> result = new ArrayList<ArrList.Pair>();

    Collections.sort(temp);
    int minDistance = 0;
    int item1, item2;
    ArrList.Pair pair;

    for (int i = 0; i < temp.size() - 1; i++) {
        
          item1 = temp.get(i);
          item2 = temp.get(i + 1);
          pair = new ArrList.Pair(item1, item2);

          if (i == 0) {

               minDistance = Math.abs(item1 - item2);
               result.add(pair);
          } 
          else if (Math.abs(item1 - item2) == minDistance) {
              
               result.add(pair);
          } 
          else if (Math.abs(item1 - item2) < minDistance) {
              
               minDistance = Math.abs(item1 - item2);
               result.clear();
               result.add(pair);
        }
    }
    return result;
}
}