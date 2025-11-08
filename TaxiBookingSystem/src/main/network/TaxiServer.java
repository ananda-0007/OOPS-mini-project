package main.network;

import java.io.*;
import java.net.*;

public class TaxiServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Taxi Server started...");
        Socket socket = server.accept();
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        System.out.println("Client says: " + dis.readUTF());
        dis.close();
        socket.close();
        server.close();
    }
}
