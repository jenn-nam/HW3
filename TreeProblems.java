/*
 * *** Jennifer Nambo / 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    //creating two temporary tree sets for original sets
    Set<Integer> setTempA = new TreeSet<>(setA);
    Set<Integer> setTempB = new TreeSet<>(setB);

    //take the complement of setA, respect to setB
     setTempA.removeAll(setB);

     //take the complement of setB, respect to setA
    setTempB.removeAll(setA);

    //combine elements from removal
    setTempA.addAll(setTempB);

    return setTempA;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    //use iterator method
    Iterator<Integer> iterator = treeMap.keySet().iterator();
    //now we can iterate the keys and remove them if even
    while (iterator.hasNext()) {
      //get the next key
      Integer currentKey = iterator.next();
      //check if key is even
      if (currentKey % 2 ==0) {
        //if the key is even, then remove it
        iterator.remove();
      }
    }
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    //can utilize equals method here to successfully check if two tree maps are equal
    //this would check the keys and values
    return tree1.equals(tree2);

  }

} // end treeProblems class
