package gui2;

import java.math.BigInteger;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FactorialService extends Remote {
    BigInteger factorial(int number) throws RemoteException;
}

