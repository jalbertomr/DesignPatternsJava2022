package AbstractFactory;

public class MobileFactory extends AbstractDeviceFactory{

    @Override
	Device getGadget( DeviceType deviceType) {
		switch( deviceType) {
		case HUAWEI:
			return new Huawei("8Gb", "Kirin");
		case SAMSUNG:
			return new Samsung("12Gb", "Snapdragon 865");
		}
		return null;
	}

}
