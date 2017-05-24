
public class TicketMachine {
	public static void main(String[] args){
		int total = 0;
		Ticket[] tickets = new Ticket[3];
		tickets[0] = new Standard(1, "Monday");
		tickets[1] = new Student(2, "Monday");
		tickets[2] = new Child(3, "Monday");
		
		for(int i = 0; i < 3; i++){
			System.out.println(tickets[i]);
			total = total + tickets[i].getPrice();
		}
		System.out.println("The total cost of tickets for this movie is £" + total);
				
	}
}
