//server program
import java.rmi.*;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
public class AddServer
{
public static void main(String args[])
{
	try{
        ServerInterface stub=new Model();
        LocateRegistry.createRegistry(5001);
        System.setProperty("java.rmi.server.hostname","192.168.1.2");
        Naming.rebind("rmi://localhost:5001/server", stub);
        System.out.println("Started");
    }catch(Exception e){
        System.out.println(e);
    }
}
}