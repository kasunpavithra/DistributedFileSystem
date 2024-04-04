import java.rmi.*;
public class Client {
    public static void main(String[] args){
        try{
            Adder stub = (Adder) Naming.lookup("rmi://192.168.59.1:5000/adder");

            System.out.println(stub.add(10,21));

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
