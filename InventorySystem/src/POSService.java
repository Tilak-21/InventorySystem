
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 Executes Simple Bank Access Protocol commands
 from a socket.
 */
public class POSService implements Runnable
{
    private Socket s;
    private Scanner in;
    private PrintWriter out;
    private POS inventory2;

    /**
     Constructs a service object that processes commands
     from a socket for a bank.
     @param aSocket the socket
     @param aBank the bank
     */
    public POSService (Socket aSocket, POS aBank)
    {
        s = aSocket;
        inventory2 = aBank;
    }

    public void run()
    {
        try
        {
            try
            {
                in = new Scanner(s.getInputStream());
                out = new PrintWriter(s.getOutputStream());
                doService();
            }
            finally
            {
                s.close();
            }
        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }
    }

    /**
     Executes all commands until the QUIT command or the
     end of input.
     */
    public void doService() throws IOException
    {
        while (true)
        {
            if (!in.hasNext()) { return; }
            String command = in.next();
            if (command.equals("QUIT")) { return; }
            else { executeCommand(command); }
        }
    }

    /**
     Executes a single command.
     @param command the command to execute
     */
    public void executeCommand(String command)
    {
        int inventory = in.nextInt();
        if (command.equals("CheckIn"))
        {
            int amount = in.nextInt();
            inventory2.CheckIn(inventory, amount);
        }
        else if (command.equals("CheckOut"))
        {
            int amount = in.nextInt();
            inventory2.CheckOut(inventory, amount);
        }
        else if (!command.equals("GetStock"))
        {
            out.println("Invalid command");
            out.flush();
            return;
        }
        out.println(inventory + " " + inventory2.GetStock(inventory));
        out.flush();
    }
}