package gui7;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NumberToWordsService extends Remote {
    String convertNumberToWords(int number) throws RemoteException;
}
