import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class MyServer implements MyRemoteInterface {
    public MyServer() {}

    public String sayHello() {
        return "Hello, client!";
    }

    public static void main(String args[]) {
        try {
            MyServer obj = new MyServer();
            MyRemoteInterface stub = (MyRemoteInterface) UnicastRemoteObject.exportObject(obj, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.createRegistry(5000);
            registry.bind("RemoteObject", stub);

            System.out.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
