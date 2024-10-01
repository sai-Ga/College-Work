package gui8;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ReverseNumberServiceImpl extends UnicastRemoteObject implements ReverseNumberService {
    protected ReverseNumberServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public int reverseNumber(int number) throws RemoteException {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
