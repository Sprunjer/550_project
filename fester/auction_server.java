import auction_fest.*;
package auction_fest;
import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import org.omg.CosNaming.NamingContextPackage.*;

public  class auction_server extends auction_clientPOA.java {
    private  String message = "\Are you ready to get something done here?\n"
    private ORB orb;



    public void setOrb(ORB orb_val)
    {
        orb= orb_val;
    }

    public String auction_maker() {
        return message;

    }

    public void auction_maker (String newmessage) {
        message = newmessagemessage;
    }
}
