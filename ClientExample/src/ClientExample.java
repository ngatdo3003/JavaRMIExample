import entity.Student;
import service.StudentService;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientExample
{
    // Host or IP of Server
    private static final String HOST = "localhost";
    private static final int PORT = 1099;
    private static Registry registry;

    public static void main(String[] args) throws Exception
    {
        // Search the registry in the specific Host, Port.
        registry = LocateRegistry.getRegistry(HOST, PORT);
        // Lookup StudentService in the Registry.
        StudentService service = (StudentService) registry
                .lookup(StudentService.class.getSimpleName());
        String studentID = "17020001";
        System.out.println("calling server to get information of " + studentID);
        // Get student info:
        Student student = service.getByStudentID(studentID);

        if (student != null)
            System.out.println(student.toString());
        else
            System.out.println("This student doesn't exist!!!");
    }
}
