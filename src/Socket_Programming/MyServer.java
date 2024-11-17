package Socket_Programming;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public static void main(String[] args) {
        try {

            ServerSocket serverSocket=new ServerSocket(6666);
            Socket socket=serverSocket.accept();
            DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());

            DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String write="",recevie="";
            while(!write.equals("Stop")){
                System.out.println("Waiting for client");
                recevie=dataInputStream.readUTF();
                System.out.println("Client :"+recevie);
                write=br.readLine();
                dataOutputStream.writeUTF(write);
                dataOutputStream.flush();
            }
            dataInputStream.close();
            socket.close();
            serverSocket.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

}

