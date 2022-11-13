package creational.AbstractFactory;

public class Huawei extends Device {
	private String ram;
	private String processor;

	public Huawei(String ram, String processor) {
		super();
		this.ram = ram;
		this.processor = processor;
	}

	@Override
	public String getDetails() {
		return "Huawei Ram size: " + this.ram + ", Processor type: " + this.processor;
	}

	@Override
	public String toString() {
		return "Huawei [ram=" + ram + ", processor=" + processor + "]";
	}
	 

}
