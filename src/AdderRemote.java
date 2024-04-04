import java.io.Console;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class AdderRemote extends UnicastRemoteObject implements Adder {
    AdderRemote() throws RemoteException{
        super();
    }

    public int add(int x, int y){
        System.out.println("Add Request came!");
        return x+y;
    }
}
