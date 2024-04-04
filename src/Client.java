import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args){
        try{

            Registry registry = LocateRegistry.getRegistry("192.168.8.100", 5000);

            Adder stub = (Adder) registry.lookup("adder");

            System.out.println(stub.add(10,21));

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
