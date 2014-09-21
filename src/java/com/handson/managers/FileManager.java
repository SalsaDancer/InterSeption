/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.handson.managers;

import com.handson.tools.InterseptionTool;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Peter Kosmas
 */
public class FileManager extends FileHandler{
      final   private String[] files;
      private Set<String> pathSet=new TreeSet<String>();
      private Set<String> pathSet2=new TreeSet<String>();
      InterseptionTool interseption=new InterseptionTool();
      private Set<String> finalSet=new TreeSet<String>();
       private BufferedWriter bufferedWriter;
    private  FileWriter fileWritter;
  public  FileManager(String[] files){
      this.files=files;
  }

  
   
    /*
    * Method that starts the gathering the Information 
    * 1 for First path
    * 2 for Second path
    */
    private void gatherInfo(int parameter){
        if (parameter==1)
        iterate(pathSet);
        else if (parameter==2) iterate(pathSet2);
        
    }
    

  public void start() throws IOException{
     
         setFilePath(files[0]);
         openFile();
         gatherInfo(1);
         closeBufferReader();
         setFilePath(files[1]);
         openFile();
         gatherInfo(2);
         closeBufferReader();
         finalSet=interseption.beginInterception(pathSet, pathSet2);
         appendFile(files[2]);
         closeWriter();
    
  }
 
    /**
     * 
     * @param set 
     */
       private void iterate (Set set){
       
        try {
            setBufferedReader(new BufferedReader(new FileReader(getF())));
        
            String line;
        
            while ((line = getBufferedReader().readLine()) != null) {
                set.add(line);
            }
             
            } 
       catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
                
                
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }//end catch 
    }

     private void appendFile(String filename) throws IOException{
         setFilePath(filename);
         openFile();

    		//true = append file
    		fileWritter = new FileWriter(getF().getAbsoluteFile(),true);
    	        bufferedWriter= new BufferedWriter(fileWritter);
    	       for (String s:finalSet){
                   System.out.println("Writing on file word : "+s);
                bufferedWriter.write(s);
                bufferedWriter.newLine();
               System.out.println("Files Merged");
               }
               bufferedWriter.flush();
             bufferedWriter.close();
            
      
           
  }
public void closeWriter(){
      
}
}
