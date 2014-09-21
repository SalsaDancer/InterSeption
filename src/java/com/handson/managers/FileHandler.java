/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.handson.managers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
 class FileHandler {
      private int parameter;
   private  String filePathString;
   private  BufferedReader bufferedReader;

    public BufferedReader getBufferedReader() {
        return bufferedReader;
    }

    public void setBufferedReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }


    public int getParameter() {
        return parameter;
    }

    public void setParameter(int parameter) {
        this.parameter = parameter;
    }

    public String getFilePathString() {
        return filePathString;
    }

    public void setFilePathString(String filePathString) {
        this.filePathString = filePathString;
    }

   

    public File getF() {
        return f;
    }

    public void setF(File f) {
        this.f = f;
    }
   private File f;
    public  void doChecks(String[] args) throws Exception{
    if (args.length<2) throw new Exception("Files should be three");
   CheckFilePaths(args);
    
}
     /**
     * @param file 
     */
    public void setFilePath(String filePathString){
        this.filePathString=filePathString;
         
    }
    /**
     * Method that opens a Path / File
     * 
     */
    public void openFile(){
        f= new File(filePathString);
        
    }
     /**
     * Method that tries to find if a path/ File Exists 
     * @return 
     */
    public boolean pathExists(){
       
return f.exists() && !f.isDirectory();

    }
private  void CheckFilePaths (String[] paths) throws FileNotFoundException{
  for (String s:paths){
    setFilePath(s);
    openFile();
    if (!pathExists()) throw new FileNotFoundException("File Path / Does not Exist"+s);
  }
  System.out.println("System file Paths found");
    
}
public void closeBufferReader(){
       try {
           bufferedReader.close();
       } catch (IOException ex) {
           Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
       }
}


}
