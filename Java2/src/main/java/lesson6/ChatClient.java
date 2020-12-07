package lesson6;

import java.io.IOException;
import java.net.Socket;

public class ChatClient {

    public ChatClient() {
        try {
            String SERVER_ADDR = "localhost";
            int SERVER_PORT = 8189;
            Socket sock = new Socket(SERVER_ADDR, SERVER_PORT);
            new Client(sock, "Клиент");
            while(true){
                if(sock.isClosed()){
                    break;
                }
            }
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ChatClient();
    }
}
