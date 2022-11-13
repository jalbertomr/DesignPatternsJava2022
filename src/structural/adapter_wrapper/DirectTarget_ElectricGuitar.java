package structural.adapter_wrapper;

public class DirectTarget_ElectricGuitar implements Target_Guitar{

	@Override
	public void onGuitar() {
		System.out.println("Playing Electric Guitar.");
	}

	@Override
	public void offGuitar() {
		System.out.println("Stop playing Electric Guitar.");
	}

}
