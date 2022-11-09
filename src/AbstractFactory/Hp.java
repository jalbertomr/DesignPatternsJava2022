package AbstractFactory;

public class Hp extends Device {
	private String ram;
	private String processor;
	private String gpu;

	public Hp(String ram, String processor, String gpuType) {
		super();
		this.ram = ram;
		this.processor = processor;
		this.gpu = gpuType;
	}

	@Override
	public String getDetails() {
		return "Hp Ram size: " + this.ram + ", Processor type: " + this.processor + ", Gpu type: " + this.gpu;
	}

	@Override
	public String toString() {
		return "Hp [ram=" + ram + ", processor=" + processor + ", gpu=" + gpu + "]";
	}

}
