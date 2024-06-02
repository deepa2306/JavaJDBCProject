package BusResv;

import java.util.Scanner;

public class BusDemo {

	public static void main(String[] args){
		BusDAO busdao=new BusDAO();
		try
		{
		busdao.display();
		// TODO Auto-generated method stub
		/*ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,1));
		buses.add(new Bus(2,false,60));
		buses.add(new Bus(3,true,90));*/
		
		
		
		int userOpt=1;
		Scanner s=new Scanner(System.in);
   while(userOpt==1) {
	   
		System.out.println("Enter 1 to Book and 2 to exit");
		userOpt=s.nextInt();
		if(userOpt==1)
		{
			Booking booking=new Booking();
			if(booking.isAvailable())
			{
				BookingDAO bookingdao=new BookingDAO();
				bookingdao.addBooking(booking);
				System.out.println("Your Booking confirmed ");
			}
			else
			{
				System.out.println("Sorry . Bus is full.try Another bus or date.");
			}
		
		}
   }
		s.close();
   }
   catch(Exception e)
   {
	   System.out.println(e);
   }
   
		}
}

