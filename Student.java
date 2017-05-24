
public class Student extends Ticket{
	private String day;
	
	public Student(int number, String day) {
		super(number);
		this.day = day;
	}
	
	public int getPrice() {
	    if (day.equals("Wednesday")) {
	      return 4;
	    } else {
	      return 6;
	    }
	  }
	
	public String toString() {
	      return super.toString() ;
	  }

}
