import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class SocketConnectionDemo {
        public static void main(String[] args) throws IOException {
            String host = "tchudasama.greenriverdev.com";
            String resource = "/";

            final int HTTP_PORT = 80;

            //open socket
            try (Socket s = new Socket(host,HTTP_PORT)) {
                //getting IO streams from the socket
                InputStream inStream = s.getInputStream();
                OutputStream outStream = s.getOutputStream();

                //Creating a scanner and connecting it to the input stream

                Scanner in = new Scanner(inStream);
                PrintWriter out = new PrintWriter(outStream);



                String command = "GET " + resource + " HTTP/1.1\r\n" + "Host: " + host + "\r\n\r\n";

                out.print(command);
                out.flush();


                while (in.hasNextLine()) {
                    String input = in.nextLine();
                    System.out.println(input);
                }
            }

        }


    }
