
public class Standard extends Ticket{
	private String day;
	
	public Standard(int number, String day) {
		super(number);
		this.day = day;
	}
	
	public int getPrice() {
	    if (day.equals("Wednesday")) {
	      return 6;
	    } else {
	      return 8;
	    }
	  }
	
	public String toString() {
	      return super.toString() ;
	  }
}
