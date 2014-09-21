/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.handson.tools;

import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Logger;

/**
 *
 * @author Peter Kosmas
 */
public class InterseptionTool {
    /**
     * Guava Library from : https://code.google.com/p/guava-libraries/
     * @param set
     * @param set2
     * @return 
     */
    public Set<String> beginInterception(Set<String> set,Set<String> set2){
        
        
            Set<String> intersection = Sets.intersection(set, set2);
       
        return intersection;
   
}
    
}
