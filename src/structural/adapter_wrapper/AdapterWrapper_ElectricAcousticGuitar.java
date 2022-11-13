package structural.adapter_wrapper;

public class AdapterWrapper_ElectricAcousticGuitar implements Target_Guitar{

	Adaptee_AcousticGuitar adaptee_acousticGuitar = new Adaptee_AcousticGuitar();
	
	@Override
	public void onGuitar() {
		adaptee_acousticGuitar.play();
		
	}

	@Override
	public void offGuitar() {
		adaptee_acousticGuitar.leaveGuitar();
	}

}
