/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Fatima
 */
public class ArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      List<String> al=new ArrayList<String>();//creating arraylist    
    al.add("Sonoo");//adding object in arraylist    
    al.add("Michael");    
    al.add("James");    
    al.add("Andy");    
    //traversing elements using Iterator  
    Iterator itr=al.iterator();  
    while(itr.hasNext())
    {  
       System.out.println(itr.next());  
    }    
   }
    
}
