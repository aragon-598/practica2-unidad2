/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.occ.edu.sv.ingenieria.tpi135.container;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author aragon598
 */
public class Container {
    
   List<Package> contents;
   
   public Container(){
       contents = new LinkedList<Package>();
   }
   
   /**
    * 
    * @param b
    * @return 
    */
   public boolean add(Package b){
       return !contents.contains(b) && contents.add(b);
   }
   
   
   /**
    * 
    * @param b
    * @return 
    */
   public boolean remove(Package b) {
        return contents.remove(b);
    }
   
   /**
    * 
    * @return 
    */
    public double getVolume() {
        int sum = 0;
        for (Package b : contents) {
            sum += b.getVolume();
    }
    return sum;
    }
    
    /**
     * 
     * @return 
     */
    public int size() {
        return contents.size();
    }
    
    /**
     * 
     */
    public void clear() {
        contents.clear();
    }
    
    /**
     * 
     * @param b
     * @return 
     */
    public boolean contains(Package b) {
        return contents.contains(b);
    }
    
}
