package gui9;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GCDServiceImpl extends UnicastRemoteObject implements GCDService {
    protected GCDServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public int calculateGCD(int a, int b) throws RemoteException {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
