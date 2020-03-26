
import service.StudentService;
import service.impl.StudentServiceImpl;
import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerExample {
    private static final int PORT = 1099;
    private static Registry registry;

    public static void startRegistry() throws RemoteException
    {
        // create registry at Server.
        registry =  LocateRegistry.createRegistry(PORT);
    }

    public static void registerObject(String name, Remote remoteObj)
            throws RemoteException, AlreadyBoundException
    {
        //registry remote object with any name
        registry.bind(name, remoteObj);
        System.out.println("Registered: " + name + " -> "
                + remoteObj.getClass().getName() + "[" + remoteObj + "]");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Server starting...");
        startRegistry();
        registerObject(StudentService.class.getSimpleName(), new StudentServiceImpl());

        // Server stared, listening requests from client
        System.out.println("Server started!");
    }
}