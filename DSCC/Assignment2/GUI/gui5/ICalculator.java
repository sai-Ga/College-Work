package gui5;


import java.rmi.*;
public interface ICalculator extends Remote
{
double add (double x, double y) throws RemoteException;
double sub (double x,double y) throws RemoteException;
double mul (double x, double y) throws RemoteException;
double div (double x,double y)throws RemoteException;

}
