/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorexample;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Fatima
 */
public class VectorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Vector<String> v=new Vector<String>();//creating vector  
      v.add("Jack");//method of Collection  
      v.addElement("James");//method of Vector  
      v.addElement("Jonathan");  
      //traversing elements using Enumeration  
      Enumeration e=v.elements();  
      while(e.hasMoreElements()){  
       System.out.println(e.nextElement());  
      }  
    }
    
}
