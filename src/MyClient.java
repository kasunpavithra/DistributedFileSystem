import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {
    public static void main(String[] args) {
        try {
            // Replace "serverIpAddress" with the IP address of the server
            Registry registry = LocateRegistry.getRegistry("192.168.8.100", 5000);

            MyRemoteInterface stub = (MyRemoteInterface) registry.lookup("RemoteObject");

            String response = stub.sayHello();
            System.out.println("Response from server: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}