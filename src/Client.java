import java.rmi.*;
import java.rmi.registry.*;
public class Client {
    public static void main(String[] args){
        try{

            Registry registry = LocateRegistry.getRegistry("rmi://192.168.8.100",5000);
            System.out.println("Registry Located");

            System.out.println(registry);


            Adder stub = (Adder) Naming.lookup("rmi://192.168.8.100:5000/adder");

            System.out.println(stub.add(10,21));

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
