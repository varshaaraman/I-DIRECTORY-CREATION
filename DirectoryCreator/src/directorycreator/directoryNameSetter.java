package directorycreator;


import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Varshaa_M
 */

public  class directoryNameSetter{
      public String getDirectoryName()
      {
          Date date = new Date();
          SimpleDateFormat date_new = new SimpleDateFormat("MM-dd-YYYY");
          String directoryName=date_new.format(date);
          return directoryName;
          
          
     
      }
  }
    
