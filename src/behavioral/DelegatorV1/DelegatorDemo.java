package behavioral.DelegatorV1;

public class DelegatorDemo {

	public static void main(String[] args) {

		// TicketBooking by agent is delegating train ticket booking to other class
		Delegator_TicketBookingByAgent agent = new Delegator_TicketBookingByAgent( new ConcreteDelegatee_TrainBooking());
		agent.bookTicket();
		
		agent = new Delegator_TicketBookingByAgent( new ConcreteDelegatee_AirBooking());
		agent.bookTicket();

	}

}
