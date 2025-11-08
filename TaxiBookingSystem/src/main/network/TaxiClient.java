package main.network;

import java.io.*;
import java.net.*;

public class TaxiClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeUTF("Requesting Taxi from Client");
        dos.flush();
        dos.close();
        socket.close();
    }
}
