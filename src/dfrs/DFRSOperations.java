package dfrs;


/**
* dfrs/DFRSOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/workspace/CORBA_Assignment/src/dfrs.idl
* 2016年11月6日 星期日 下午10时16分50秒 EST
*/

public interface DFRSOperations 
{
  dfrs.Result transferReservation (int passengerID, String currentCity, String otherCity);
  String getBookedFlightCount (String recordType);
  dfrs.Result editFlightRecord (int recordID, String fieldName, String newValue);
  dfrs.Result bookFlight (String firstName, String lastName, String address, String phone, String destination, String date, String ticketClass);
  String getAllFlightInfo ();
} // interface DFRSOperations
