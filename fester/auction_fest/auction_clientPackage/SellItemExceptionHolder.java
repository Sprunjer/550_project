package auction_fest.auction_clientPackage;

/**
* auction_fest/auction_clientPackage/SellItemExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from AuctionFest.idl
* Saturday, March 11, 2017 11:26:53 AM PST
*/

public final class SellItemExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public auction_fest.auction_clientPackage.SellItemException value = null;

  public SellItemExceptionHolder ()
  {
  }

  public SellItemExceptionHolder (auction_fest.auction_clientPackage.SellItemException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = auction_fest.auction_clientPackage.SellItemExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    auction_fest.auction_clientPackage.SellItemExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return auction_fest.auction_clientPackage.SellItemExceptionHelper.type ();
  }

}
