package gui4;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BMICalculatorImpl extends UnicastRemoteObject implements BMICalculator {
    protected BMICalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public double calculateBMI(double weight, double height) throws RemoteException {
        return weight / (height * height);
    }
}
