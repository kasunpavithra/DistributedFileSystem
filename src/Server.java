import java.rmi.*;
import java.rmi.registry.*;
public class Server {
    public static void main(String[] args){
        try{
            Adder stub = new AdderRemote();

            Registry registry = LocateRegistry.createRegistry(5000);

            System.setProperty("java.rmi.server.hostname","192.168.59.1");
            Naming.rebind("rmi://192.168.59.1:5000/adder", stub);

            System.out.println("Server is Running!");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
