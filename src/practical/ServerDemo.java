package practical;

import java.io.DataInputStream;
import java.net.Socket;
import java.net.ServerSocket;

public class ServerDemo {
    public static void main(String[] args){
        try{
            ServerSocket ss=new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream data =new DataInputStream(s.getInputStream());
            String  str = (String)data.readUTF();
            System.out.println("message= "+str);
            ss.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}