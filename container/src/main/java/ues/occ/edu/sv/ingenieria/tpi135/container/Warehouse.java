/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.occ.edu.sv.ingenieria.tpi135.container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author aragon598
 */
public class Warehouse extends Container {
    
    private final double maxCapacity;
    
    public Warehouse(double capacity){
        this.maxCapacity = capacity;
    }
    
    @Override
    public boolean add(Package b){
        if (b.getVolume() + getVolume() <= maxCapacity) {
            return super.add(b);
        }
        return false;
    }
    
    public Iterator<Package> getPackages(){
        List<Package> copyContents = new ArrayList<Package>(contents);
        
        Collections.sort(copyContents, new Comparator<Package>(){
            @Override
            public int compare(Package b1, Package b2) {
                if (b1.getVolume() < b2.getVolume()) {
                    return -1;
                } else if (b1.getVolume() == b2.getVolume()) {
                    return 0;
                } else {
                        return 1;
                    }
            }
            
        });
        return copyContents.iterator();
    }
    
}
