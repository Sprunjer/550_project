package auction_fest;


/**
* auction_fest/auction_client.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from AuctionFest.idl
* Saturday, March 11, 2017 11:26:53 AM PST
*/

public interface auction_client extends auction_clientOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
    public class Client {

        public static void main(String args[]) {
            try {
                // create and initialize the ORB
                ORB orb = ORB.init(args, null);

                // get the root naming context
                org.omg.CORBA.Object objRef =
                        orb.resolve_initial_references("NameService");

                // Use NamingContextExt instead of NamingContext. This is
                // part of the Interoperable Naming Service.
                NamingContextExt ncRef =
                        NamingContextExtHelper.narrow(objRef);

                // resolve the Object Reference in Naming

                auction_fest fester = auction_clientHelper.narrow(ncRef.resolve_str("Auction_Fest"));

                int choice_checker = 0;

                while (choice_checker != 4) {
                    System.out.println("Thank you for coming to our aucton program\n");
                    System.out.println("Enter the crossponding number");
                    System.out.println("Enter 1 to see the Auction Status");
                    System.out.println("Enter 2 to bid on the price");
                    System.out.println("Enter 3 to see the bid status");
                    System.out.println("Enter 4 if you want leave ");

                    String prompt;

                    prompt = StdinReader.readLine("Choose 1 to 4: ");

                    choice_checker = Integer.parseInt(prompt);

                    if (choice_checker == 1) //view auction status
                    {
                        auction_fest.auction_clientPackage.auction_status status =
                                new auction_fest.auction_clientPackage.auction_status();
                        status = fester.view_auction_status();
                        String message = "User Name:" + status.user + " Item: " + status.item +
                                " Current Price: " + status.currentPrice + " is the highest bidder at the moment\n";
                        System.out.println(message);

                    } else if (choice_checker == 2) // if the choice is 2 this will be a bid
                    {
                        try {

                            String user = StdinReader.readLine("Please Type Your Name: ");

                            String strOffer = StdinReader.readLine("Propose your bid here : ");

                            float propose = Float.parseFloat(strOffer);

                            boolean propose_current = fester.bid(user, propose);

                            if (propose_current == true) System.out.println("The bid was sucessful \n");

                            else System.out.println("Outbidden! Increase your bid amount! \n");

                        } catch (Exception e)

                        {
                            System.out.println(e);
                        }

                    } else if (choice_checker == 3) //if choice is 2 then this weill be checking the choice
                    {
                        try {
                            String name = StdinReader.readLine("Please enter your name here: ");

                            String msg_fester = fester.view_bid_status(name);

                            System.out.println(msg_fester + "\n");

                        } catch (Exception e)

                        {
                            System.out.println(e);
                        }
                    }

                }//end of while

            } catch (Exception e) {
                System.out.println("ERROR : " + e);
                e.printStackTrace(System.out);
            }
        }
    }
} // interface auction_client
