package eqn1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class EquationServiceImpl extends UnicastRemoteObject implements EquationService {
    protected EquationServiceImpl() throws RemoteException { }

    @Override
    public double calculateEquation(int a, int b) throws RemoteException {
        return Math.pow((a + b), 2); // (a + b)^2
    }
}

