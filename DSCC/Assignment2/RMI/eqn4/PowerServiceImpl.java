package eqn4;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class PowerServiceImpl extends UnicastRemoteObject implements PowerService {
    protected PowerServiceImpl() throws RemoteException { }

    @Override
    public double calculatePower(double Y, int n) throws RemoteException {
        return Math.pow(Y, n); // Calculate Y^n
    }
}

