package Client_Code;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя: ");

            String name = scanner.nextLine();
            Socket socket = new Socket("127.0.0.1", 1111);

            Client client = new Client(socket, name);

            InetAddress inetAddress = socket.getInetAddress();
            System.out.println(inetAddress);
            String hostAddress = inetAddress.getHostAddress();
            System.out.println(hostAddress);
            System.out.println(socket.getLocalPort());

            client.listen4Message();
            client.sendMessage();
        }
        catch (UnknownHostException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
