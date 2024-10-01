package timeservice;

import java.rmi.Naming;

public class TimeClient {
    public static void main(String[] args) {
        try {
            TimeService timeService = (TimeService) Naming.lookup("rmi://localhost/TimeService");
            String currentTime = timeService.getCurrentTime();
            System.out.println("Current Date and Time from Server: " + currentTime);
        } catch (Exception e) {
            System.out.println("Client exception: " + e);
        }
    }
}

