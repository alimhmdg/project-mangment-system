package proproject;

import InterFaceSuperMarket.Operations;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class FileManager implements Operations,Serializable{

    @Override
       public < T > void Add(File f,T data) throws IOException ,ClassNotFoundException
        {
        
        if(f.canRead()){
        ObjectInputStream in=new ObjectInputStream(new FileInputStream(f));
        ArrayList<T> list=(ArrayList<T>)in.readObject();
        list.add(data);
        f.createNewFile();
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(f));
        out.writeObject(list);
        out.close();
        }
        else{
            ArrayList <T>list=new ArrayList<T>();
            list.add(data);
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(f));
            out.writeObject(list);
            out.close();
        }
        }
        
    @Override
    public < T > T Search(File f, String ID) { 
             try 
             {
                 FileInputStream in=new FileInputStream(f);
                 ObjectInputStream   read = new   ObjectInputStream (in);
                 ArrayList<T> list=new ArrayList<T>();
                 list=(ArrayList<T>)read.readObject();
                
                 for(int i = 0 ; i<list.size() ; i++)
                 {
                     if(list.get(i).getClass().equals(new Human().getClass()))
                     {
                     Human employee=(Human)list.get(i);
                     if(ID.equals(employee.ID))
                     {
                         return list.get(i);
                     }
                 }
                     else if(list.get(i).getClass().equals(new Products().getClass()))
                             {
                     
                               Products product=(Products)list.get(i);
                     if(ID.equals(product.ID)){
                         return list.get(i);
                     }
                     }
                 }
             }
             catch(Exception e) 
             {
                 System.out.println(e.getMessage());
             }
             return null;     
         }     


    @Override
    public < T > void Update(File f, String ID,T newdata ) {
        try{
                ObjectInputStream in=new ObjectInputStream(new FileInputStream(f));
                ArrayList<T> list=(ArrayList<T>)in.readObject();
                for(int k=0;k<list.size();k++){
                    if(list.get(k).getClass().equals(new Human().getClass()))
                    {
                     Human h=(Human)list.get(k);
                    if(h.ID.equals(ID)){
                        list.set(k,newdata);
                    }
                   }
                    
                    else if(list.get(k).getClass().equals(new Products().getClass()))
                    {
                        Products p=(Products)list.get(k);
                        if(p.ID.equals(ID)){
                            list.set(k, newdata);
                        }
                    }
                    
                }
                    
                f.createNewFile();
                ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(f));
                out.writeObject(list);
                out.close();
        }
            catch(IOException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    @Override
    public <T> int Delete(File f, String ID) throws IOException, ClassNotFoundException {
        try{
                ObjectInputStream in=new ObjectInputStream(new FileInputStream(f));
                ArrayList<T> list=(ArrayList<T>)in.readObject();
                for(int k=0;k<list.size();k++){
                    if(list.get(k).getClass().equals(new Human().getClass()))
                    {
                     Human h=(Human)list.get(k);
                    if(h.ID.equals(ID)){
                        list.remove(k);
                            f.createNewFile();
                            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(f));
                            out.writeObject(list);
                            out.close();
                            return 1;
                    }
                    }
                    
                    else if(list.get(k).getClass().equals(new Products().getClass()))
                    {
                        Products p=(Products)list.get(k);
                        if(p.ID.equals(ID)){
                            list.remove(k);
                            f.createNewFile();
                            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(f));
                            out.writeObject(list);
                            out.close();
                            return 1;
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
    public <T> ArrayList<T> GetAll(File f)
    {
      
         try{
            ObjectInputStream in=new ObjectInputStream(new FileInputStream(f));
            ArrayList<T> list=(ArrayList<T>)in.readObject();
            if(list!=null){
                return list;
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return null ;
    }         
    }    








































