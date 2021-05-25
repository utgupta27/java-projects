package practical;

import java.io.*;
import java.net.*;
public class ClientDemo {
    public static void main(String[] args) {
        try{
            Socket s=new Socket("localhost",6666);
            DataOutputStream dataOut = new DataOutputStream(s.getOutputStream());
            dataOut.writeUTF("Hello Server");
            dataOut.flush();
            dataOut.close();
            s.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}