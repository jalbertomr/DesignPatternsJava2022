package creational.AbstractFactory;

public class Client {

	public static void main(String[] args) {
		
		Device dell = FactoryGenerator.getFactory( FactoryType.LAPTOPFACTORY).getGadget( DeviceType.DELL);
		
		System.out.println( dell.getDetails());
		
		AbstractDeviceFactory mobileFactory = FactoryGenerator.getFactory( FactoryType.MOBILEFACTORY);
		Device samsung = mobileFactory.getGadget( DeviceType.SAMSUNG);
		System.out.println( samsung.getDetails());
	}

}
