/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.handson.main;

import com.handson.managers.FileManager;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Peter Kosmas
 */
public class Main {
   static FileManager manager;
  static String path;
 static  String path2;
 
    /**
     * Main 
     * @param args 
     */
    public static void main(String[] args){
      
          
      FileManager manager=new FileManager(args);
       try {
           manager.doChecks(args);
           manager.start();
           manager.closeWriter();
       } catch (Exception ex) {
           System.out.println(ex);
           Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
       }
         
        
       
        
    }

    


}
