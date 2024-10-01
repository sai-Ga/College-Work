package addition;

import java.rmi.Naming;

public class AdditionClient {
    public static void main(String[] args) {
        try {
            AdditionInterface addition = (AdditionInterface) Naming.lookup("rmi://localhost/AdditionService");
            int result = addition.add(5, 10);
            System.out.println("Result of addition: " + result);
        } catch (Exception e) {
            System.out.println("Client exception: " + e);
        }
    }
}
