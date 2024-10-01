package gui4;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BMICalculator extends Remote {
    double calculateBMI(double weight, double height) throws RemoteException;
}

