package gui6;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class GreatestNumberServiceImpl extends UnicastRemoteObject implements GreatestNumberService {
    protected GreatestNumberServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public int findGreatest(int a, int b) throws RemoteException {
        return Math.max(a, b);
    }
}
