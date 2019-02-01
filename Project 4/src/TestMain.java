// Virginia Pollock
// CIS 2353
// Fall 2018
// Prof. John P. Baugh

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    try {
          scan = new Scanner(new File("arrlist.txt"));
          ArrayList<Integer> list = new ArrayList<Integer>();
          while (scan.hasNextInt()) {

               int num = scan.nextInt();
               list.add(num);

          }

      System.out.println("Numbers: \n" + list + "\n");
      ArrayList<ArrList.Pair> closest = ArrList.closestNumbers(list);
      System.out.println("Closest pair:");

      for (ArrList.Pair pair : closest) {
           System.out.println(pair);
      }
    }
    catch (FileNotFoundException e) {
          System.out.println("Could not read a file");
    }
    
    }
}