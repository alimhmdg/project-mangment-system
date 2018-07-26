package proproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface MyInterface {

    public int login(String username,String password)throws  IOException;
    public boolean register(String username,String password)throws IOException;
} 
