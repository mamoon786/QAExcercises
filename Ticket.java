
public class Ticket {
	private int number;
	
	public Ticket(int number){
		this.number = number;
	}
	
	public int getPrice() {
	    return 0;
	  }

	  public String toString() {
	     return "Ticket " + this.number + ", Price: £" + this.getPrice();
	  }
}
