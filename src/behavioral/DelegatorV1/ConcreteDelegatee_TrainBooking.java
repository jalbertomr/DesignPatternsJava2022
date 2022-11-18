package behavioral.DelegatorV1;

public class ConcreteDelegatee_TrainBooking implements IDelegatee_TravelBooking {

	@Override
	public void bookTicket() {
		System.out.println("Train ticket booked");
	}

}
