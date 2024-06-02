package BusResv;
import java.util.*;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name of Passenger");
		passengerName=s.next();
		
		System.out.println("Enter BusNo");
		busNo=s.nextInt();
		
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput=s.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  public boolean isAvailable() throws SQLException{
	  BusDAO busdao=new BusDAO();
	  BookingDAO bookingdao=new BookingDAO();
	  int capacity=busdao.getCapacity(busNo);
	  /*int capacity=0;
	  for(Bus bus:buses) {
		  if(bus.getBusno()==busNo)
			  capacity=bus.getCapacity();
	  
	  int booked=0;
	  for(Booking b:bookings) {
		  if(b.busNo == busNo && b.date.equals(date))
		  {
			  booked++;
		  }
	  }}*/
	  int booked=bookingdao.getBookedCount(busNo,date);
	  return booked<capacity;
  }
}
