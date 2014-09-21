package com.handsjob.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 

import com.handson.managers.FileManager;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Peter Kosmas
 */
public class TestClass {
   static FileManager manager;
  static String path;
 static  String path2;
 
    /**
     * Main 
     * @param args 
     */
    public static void main(String[] args){
      args=new String[3];
          String path="c://test/";
          args[0]=path+"file1.txt";
          args[1]=path+"file2.txt";
          args[2]=path+"file4.txt";
      FileManager manager;
       manager = new FileManager(args);
       try {
           manager.doChecks(args);
           manager.start();

       } catch (Exception ex) {
           System.out.println(ex);
           Logger.getLogger(TestClass.class.getName()).log(Level.SEVERE, null, ex);
       }
         
        
       
        
    }

    


}
