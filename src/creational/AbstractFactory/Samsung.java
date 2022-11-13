package creational.AbstractFactory;

public class Samsung extends Device{
	private String ram;
	private String processor;

	public Samsung(String ram, String processor) {
		super();
		this.ram = ram;
		this.processor = processor;
	}

	@Override
	public String getDetails() {
		return "Samsung Ram size: " + this.ram + ", Processor type: " + this.processor;
	}

	@Override
	public String toString() {
		return "Samsung [ram=" + ram + ", processor=" + processor + "]";
	}
	 

}
