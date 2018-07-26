package proproject;

public class Order {

    private String NumberOfOrder; // To Define The Number Of Product
    public String NameOfOrder; // To Define The Name Of Product
    
    /*This Method To Set The Number Of Product*/
    public boolean setNumberOfProduct(String Number)
    {
    if((Number.length())<10)
    {
       this.NameOfOrder=Number;
        return true;
    }
    else
        return false;
    }
    /*This Method To Get The Number Of Product*/
    public String getNumberOfProduct()
    {
     return this.NumberOfOrder;
    }
    
    /*This method To Import The Data Of Product*/
    public void ImportProductData()
    {
     Products product = new Products();
    }
    
    /*This Method To Cancel The Order*/
    public void Cancellation()
    {
    
    }
    
}
