package InterFaceSuperMarket;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public interface Operations {

    public < T > void Add(File f,T data) throws IOException ,ClassNotFoundException;
    public < T > T Search(File f, String ID);
    public < T > void Update(File f, String ID,T newdata ) ;
    public < T > int Delete(File f, String ID) throws IOException ,ClassNotFoundException;
    public <T> ArrayList<T> GetAll(File f);
}
