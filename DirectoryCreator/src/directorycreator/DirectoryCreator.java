/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directorycreator;

/**
 *
 * @author Varshaa_M
 */
import java.io.File;
public class DirectoryCreator {

    /**
     * 
     * @param args
     */
  
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        directoryNameSetter k = new directoryNameSetter();
        String directoryName = k.getDirectoryName();
        String path = "D:/Archives/" + directoryName;
        File Directory =new File(path);
       boolean isFileCreated = Directory.mkdir();
       if(isFileCreated == false)
           System.exit(0);
        
    }
    
}
