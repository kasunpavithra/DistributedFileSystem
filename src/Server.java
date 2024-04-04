import java.rmi.*;
import java.rmi.registry.*;
public class Server {
    public static void main(String[] args){
        try{
            System.setProperty("java.rmi.server.hostname","192.168.8.100");
            Adder stub = new AdderRemote();

            Registry registry = LocateRegistry.createRegistry(5000);

            registry.bind("adder", stub);

            System.out.println("Server is Running!");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
