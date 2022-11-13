package structural.adapter_wrapper;

/**
 * wikipedia
 * 
 * @author bext
 *
 */

public class Client_Main {

	public static void main(String[] args) {
		Target_Guitar target_electriGuitar = new DirectTarget_ElectricGuitar();
		target_electriGuitar.onGuitar();
		target_electriGuitar.offGuitar();
		Target_Guitar target_acousticGuitar = new AdapterWrapper_ElectricAcousticGuitar();
		target_acousticGuitar.onGuitar();
		target_acousticGuitar.offGuitar();
	}
}
