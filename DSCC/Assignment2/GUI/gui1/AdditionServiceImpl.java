package gui1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdditionServiceImpl extends UnicastRemoteObject implements AdditionService {
    protected AdditionServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}
