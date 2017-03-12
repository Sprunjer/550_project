

package auction_fest; 
import auction_fest.*;
import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import java.io.*; 

public class Seller {
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
  
      auction_fest fester = auction_clientHelper.narrow(ncRef.resolve_str(auction_fest));

    
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

                auction_fest fester = auction_clientHelper.narrow(ncRef.resolve_str("auction_fest"));

                int choice_checker = 0;

                while (choice_checker != 5) {
                    System.out.println("Thank you for coming to our aucton program\n");
                    System.out.println("Enter the crossponding number");
                    System.out.println("Enter 1 to sell your item");
                    System.out.println("Enter 2 to close the cell");
                    System.out.println("Enter 3 to see the bid status");
		    System.out.println("Enter 4 to see the see the auction status");
                    System.out.println("Enter 5 if you want leave ");

                    String prompt;

                    prompt = StdinReader.readLine("Choose 1 to 5: ");

                    choice_checker = Integer.parseInt(prompt);

                    if (choice_checker == 1) //view auction status
                    {
                        
					 String seller_name = StdinReader.readLine(" Please enter your seller name")
					 String item_name = StdinReader.readLine("Please enter the item name")
					 float starting_price = StdinReader.readLine("Please enter the starting price")
					 
					 
					 boolean entered_correctly = fester.offer(seller_name,starting_price);
					 
					 if (entered_correctly=true)
					      System.out.println(" Good job. Now hope that it will be sold");
						 
					else
					
					      System.out.println(" Not yet. Do it again");
						  }
					 
					   catch (Exception e){System.out.println(e);}
			
					
                        

                    } else if (choice_checker == 2) 
                    {
                        try {

                        String item_name = StdinReader.readLine("Please Enter The name of item that want to sell")      
						boolean entered_correctly = fester.sell(item_name)

                        } catch (Exception e)

                        {
                            System.out.println(e);
                        }

                    } else if (choice_checker == 3) 
                    {
                        try {
                            String price = StdinReader.readLine("Please enter your price here: ");

                            String msg_fester = fester.view_bid_status(price);

                            System.out.println(msg_fester + "\n");

                        } catch (Exception e)

                        {
                            System.out.println(e);
                        }
                    }
		    else if (choice_checker == 4)
		    {
			  
                           view_auction_status();
                            
                        } catch (Exception e)

                        {
                            System.out.println(e);
                        }

                }//end of while

            } catch (Exception e) {
                System.out.println("ERROR : " + e);
                e.printStackTrace(System.out);
            }
        }
    }
} 
