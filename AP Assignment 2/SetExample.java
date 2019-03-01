/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setexample;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Fatima
 */
public class SetExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set deonstration using HashSet 
        Set<String> hash_Set = new HashSet<String>(); 
        hash_Set.add("Geeks"); 
        hash_Set.add("For"); 
        hash_Set.add("Geeks"); 
        hash_Set.add("Example"); 
        hash_Set.add("Set"); 
        System.out.print("Set output without the duplicates"); 
  
        System.out.println(hash_Set); 
  
        // Set deonstration using TreeSet 
        System.out.print("Sorted Set after passing into TreeSet"); 
        Set<String> tree_Set = new TreeSet<String>(hash_Set); 
        System.out.println(tree_Set); 
    }
    
}
