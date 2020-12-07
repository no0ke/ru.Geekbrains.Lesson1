package lesson6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private Scanner in;
    private Scanner input;
    private PrintWriter out;
    private final Thread threadIn;
    private final Thread threadOut;
    public Client(Socket sock, String name) {
        try {
            in = new Scanner(sock.getInputStream());
            input = new Scanner(System.in);
            out = new PrintWriter(sock.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        threadOut = new Thread(() -> {
            while (true) {
                if (input.hasNext()) {
                    String q = input.next();
                    sendMsg(name+": "+q);
                    if (q.equalsIgnoreCase("close")) break;
                }
            }
            close(sock);

        });
        threadOut.start();
        threadIn = new Thread(() -> {
            while (true) {
                if (in.hasNext()) {
                    String w = in.nextLine();
                    System.out.println(w);
                    if (w.contains("close")) break;
                }
            }
            close(sock);
        });
        threadIn.start();
    }
    private void sendMsg(String w) {
        out.println(w);
        out.flush();
    }
    private void close(Socket sock){
        threadIn.interrupt();
        threadOut.interrupt();
        try {
            sock.close();
        } catch (Exception ignored) {}

    }
}