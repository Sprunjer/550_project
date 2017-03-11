package auction_fest.auction_clientPackage;


/**
* auction_fest/auction_clientPackage/StatusExceptionHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from AuctionFest.idl
* Saturday, March 11, 2017 11:26:53 AM PST
*/

abstract public class StatusExceptionHelper
{
  private static String  _id = "IDL:auction_fest/auction_client/StatusException:1.0";

  public static void insert (org.omg.CORBA.Any a, auction_fest.auction_clientPackage.StatusException that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static auction_fest.auction_clientPackage.StatusException extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [1];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "description",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (auction_fest.auction_clientPackage.StatusExceptionHelper.id (), "StatusException", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static auction_fest.auction_clientPackage.StatusException read (org.omg.CORBA.portable.InputStream istream)
  {
    auction_fest.auction_clientPackage.StatusException value = new auction_fest.auction_clientPackage.StatusException ();
    // read and discard the repository ID
    istream.read_string ();
    value.description = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, auction_fest.auction_clientPackage.StatusException value)
  {
    // write the repository ID
    ostream.write_string (id ());
    ostream.write_string (value.description);
  }

}
