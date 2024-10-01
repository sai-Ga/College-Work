package timeservice;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("serial")
public class TimeServiceImpl extends UnicastRemoteObject implements TimeService {
    protected TimeServiceImpl() throws RemoteException { }

    @Override
    public String getCurrentTime() throws RemoteException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }
}

