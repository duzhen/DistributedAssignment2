package dfrs;

/**
* dfrs/DFRSHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/workspace/CORBA_Assignment/src/dfrs.idl
* 2016年10月27日 星期四 下午09时44分05秒 EDT
*/

public final class DFRSHolder implements org.omg.CORBA.portable.Streamable
{
  public dfrs.DFRS value = null;

  public DFRSHolder ()
  {
  }

  public DFRSHolder (dfrs.DFRS initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = dfrs.DFRSHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    dfrs.DFRSHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return dfrs.DFRSHelper.type ();
  }

}
