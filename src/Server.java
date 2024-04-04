import javax.management.remote.rmi.RMIServer;
import java.rmi.*;
import java.rmi.registry.*;
public class Server {
    public static void main(String[] args){
        try{
            Adder stub = new AdderRemote();
            System.setProperty("java.rmi.server.hostname","192.168.8.100");

            Registry registry = LocateRegistry.createRegistry(5000);

            System.out.println(registry);


            Naming.rebind("adder", stub);
            System.out.println("Server is Running!");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
