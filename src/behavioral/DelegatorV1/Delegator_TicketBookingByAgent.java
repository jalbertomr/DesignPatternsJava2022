package behavioral.DelegatorV1;

public class Delegator_TicketBookingByAgent implements IDelegatee_TravelBooking{

	IDelegatee_TravelBooking travelBooking;
	
	public Delegator_TicketBookingByAgent(IDelegatee_TravelBooking travelBooking) {
		super();
		this.travelBooking = travelBooking;
	}

	// Delegation 
	@Override
	public void bookTicket() {
		travelBooking.bookTicket();
	}

}
