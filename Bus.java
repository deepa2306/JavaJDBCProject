package BusResv;

public class Bus {
	
	 private int busNo;
     private boolean ac;
     private int capacity;  // get and set methods
     
     Bus(int no,boolean ac,int cap)
     {
    	 this.busNo=no;
    	 this.ac=ac;
    	 this.capacity=cap;
     }
     
     public int getBusNo()
     {
    	 return busNo;
     }
	public int getCapacity() //accessor method
	{
		return capacity;
	}
	public void setCapacity(int cap)  // mutator
	{
		capacity=cap;
	}

	public boolean isAc() //accessor method
	{
		return ac;
	}
	public void setac(boolean val)  // mutator
	{
		ac=val;
	}
	
	

}
