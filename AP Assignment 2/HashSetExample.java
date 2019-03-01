/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashsetexample;

import java.util.HashSet;

/**
 *
 * @author Fatima
 */
public class HashSetExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a HashSet 
        HashSet<String> hset = new HashSet<String>(); 
  
        // add elements to HashSet 
        hset.add("geeks"); 
        hset.add("for"); 
        hset.add("practice"); 
        hset.add("contribute"); 
  
        // Duplicate removed 
        hset.add("geeks"); 
  
        // Displaying HashSet elements 
        System.out.println("HashSet contains: "); 
        for (String temp : hset) { 
            System.out.println(temp); 
        } 
    }
    
}
