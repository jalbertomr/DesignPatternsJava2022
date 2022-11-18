package behavioral.DelegatorV1;

public class ConcreteDelegatee_AirBooking implements IDelegatee_TravelBooking{

	@Override
	public void bookTicket() {
		System.out.println("Flight ticket booked");
	}

}
