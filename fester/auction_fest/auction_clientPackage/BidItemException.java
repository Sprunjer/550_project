package auction_fest.auction_clientPackage;


/**
* auction_fest/auction_clientPackage/BidItemException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from AuctionFest.idl
* Saturday, March 11, 2017 11:26:53 AM PST
*/

public final class BidItemException extends org.omg.CORBA.UserException
{
  public String description = null;

  public BidItemException ()
  {
    super(BidItemExceptionHelper.id());
  } // ctor

  public BidItemException (String _description)
  {
    super(BidItemExceptionHelper.id());
    description = _description;
  } // ctor


  public BidItemException (String $reason, String _description)
  {
    super(BidItemExceptionHelper.id() + "  " + $reason);
    description = _description;
  } // ctor

} // class BidItemException