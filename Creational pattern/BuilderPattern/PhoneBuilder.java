package BuilderPattern;

public class PhoneBuilder {
	 private String os;
	 private int ram;
	 private String processors;
	 private double screenshot;
	 private int battery;
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setProcessors(String processors) {
		this.processors = processors;
		return this;
	}
	public PhoneBuilder setScreenshot(double screenshot) {
		this.screenshot = screenshot;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public Phone getPhone()
	{
		return new Phone(os, ram, processors, screenshot, battery);
	}
	 
}
