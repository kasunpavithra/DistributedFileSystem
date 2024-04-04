import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemoteInterface extends Remote {
    // Remote method declaration
    String sayHello() throws RemoteException;
}
