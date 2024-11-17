package Socket_Programming;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.time.chrono.IsoEra;

public class MyClient {
    public static void main(String[] args) {
        try{

            Socket socket=new Socket("localhost",6666);
            DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String write="",recevie="";
            while (!write.equals("Stop")){
                write=br.readLine();
                dataOutputStream.writeUTF(write);
                // sending data to server
                dataOutputStream.flush();
                recevie= dataInputStream.readUTF();
                System.out.println("Server :"+recevie);
                System.out.println("Waiting for server");
            }
            dataOutputStream.close();
            socket.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
