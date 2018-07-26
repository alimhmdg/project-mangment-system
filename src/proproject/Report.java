package proproject;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Report {
    File pro = new File("Products.txt");
    FileManager fm=new FileManager();
    private String ReportID; // To Define The ID Of Report
    private String Describtion; // To Define The Describtion Of Report
    public String Data; // To Define The Data Of Report
    
     /*This Method To Set The Describtion Of Report*/
     /*This Method To Check The Expirty Of Data*/
     public ArrayList<Products> CheckExpirtyOfProduct()
     {
         try{
         ArrayList<Products> expirtylist=new ArrayList<Products>();
         ArrayList<Products> list=fm.GetAll(pro);
         Calendar c2=Calendar.getInstance();
         Calendar c1=Calendar.getInstance();
         SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
         for(int k=0;k<list.size();k++){
         Date expirt=format.parse(list.get(k).ExpirtyProduct);
         c2.setTime(expirt);
         c1.add(Calendar.DATE, 30);
         if(c1.getTimeInMillis()>=c2.getTimeInMillis()){
             expirtylist.add(list.get(k));
         }
         }
         return expirtylist;
         }
         catch(Exception e){
             e.printStackTrace();
         }
        return null;
     }
     
     /*This Method To Check The Quantity Of Product*/
     public ArrayList<Products> CheckQuantityOdProduct()
     {        
         ArrayList<Products> list=fm.GetAll(pro);
         ArrayList<Products> quantlist=new ArrayList<Products>();
         for(int k=0;k<list.size();k++){
         if(list.get(k).Quantitiy<list.get(k).FixedQuantity){
             quantlist.add(list.get(k));
         }
         }
         return quantlist;
     }
     /*
     public ArrayList<String> getproductsname(){
         ArrayList<Products> list=fm.GetAll(pro);
         ArrayList<String> namelist=new ArrayList<String>();
         for(int k=0;k<list.size();k++){
         namelist.add(list.get(k).Name);
         }
         return namelist;
     }
      */
     
     /*This Method To Know The Report*/
     public ArrayList<String> MakingRebort()
     {
         ArrayList<String> reportlines=new ArrayList<String>();
         ArrayList<Products> list=fm.GetAll(pro);
         for(int k=0;k<list.size();k++){
             String line="product Name: "+list.get(k).Name+"\tproduct ID: "+list.get(k).ID+"\nproduct Price: "+list.get(k).Price+"\tproduct type: "+list.get(k).Type+"\nproduct expirtydate: "+list.get(k).ExpirtyProduct+"\tproduct Quantity: "+list.get(k).Quantitiy;
             reportlines.add(line);
     }
         return reportlines;
     }
}
