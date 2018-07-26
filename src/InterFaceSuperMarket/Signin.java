package InterFaceSuperMarket;

import java.io.IOException;

public interface Signin {

     public int login(String username,String password)throws  IOException;
    public boolean register(String username,String password)throws IOException;
}
