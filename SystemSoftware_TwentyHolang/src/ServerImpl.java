import java.rmi.RemoteException;

import java.rmi.server.UnicastRemoteObject;

public class ServerImpl extends UnicastRemoteObject implements Client{
	private static final long serialVersionUID = 1L;

	public ServerImpl() throws RemoteException {
		super();
	}
	
	public void Send(String buffer) throws RemoteException {
		
	}
}
