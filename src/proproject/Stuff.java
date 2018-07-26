package proproject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import InterFaceSuperMarket.Signin;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
public class Stuff implements Signin{

      public File f=new File("acconts.txt");

@Override
    public int login(String username, String password) throws IOException{   
           try{
       ObjectInputStream read = new ObjectInputStream(new FileInputStream(f));
        HashMap<String,String> input= new HashMap<String,String>();
        input=(HashMap<String,String>)read.readObject();
        for(String name : input.keySet())     
        {
        if(name.equals(username) && input.get(name).equals(password) )
        {     
         if(password.charAt(0) == 's')
         {
         return 1;   
         }
         else if(password.charAt(0) == 'e')
         {
         return 2;
         }
         else if(password.charAt(0) == 'c')
         {
         return 3;
         } 
        }        
        }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return 0;
    }
    @Override
    public boolean register(String username, String password)  
    {
        try{
        if(f.canRead()){
     ObjectInputStream read = new ObjectInputStream(new FileInputStream(f));
      HashMap <String,String> input=(HashMap<String,String>)read.readObject();
      for(String temp: input.keySet())
      {
          if(temp.equals(username))
          {
              return false;
          }
      }
      input.put(username,password);
      ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream(f));
      write.writeObject(input);
      write.close();   
        }
     
     else{
         ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream(f));
         HashMap <String,String> input =new HashMap<String,String>();
         input.put(username,password);
         write.writeObject(input);
         write.close();
     
        }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    return true;
    }
}
