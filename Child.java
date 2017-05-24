
public class Child extends Ticket{
	private String day;
	
	public Child(int number, String day) {
		super(number);
		this.day = day;
	}
	
	public int getPrice() {
	    if (day.equals("Wednesday")) {
	      return 2;
	    } else {
	      return 4;
	    }
	  }
	
	public String toString() {
	      return super.toString() ;
	  }
}
