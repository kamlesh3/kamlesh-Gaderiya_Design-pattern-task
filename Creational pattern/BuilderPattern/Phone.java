package BuilderPattern;

public class Phone 
{
 private String os;
 private int ram;
 private String processors;
 private double screenshot;
 private int battery;
public Phone(String os, int ram, String processors, double screenshot, int battery) {
	super();
	this.os = os;
	this.ram = ram;
	this.processors = processors;
	this.screenshot = screenshot;
	this.battery = battery;
}
@Override
public String toString() {
	return "Phone [os=" + os + ", ram=" + ram + ", processors=" + processors + ", screenshot=" + screenshot
			+ ", battery=" + battery + "]";
}
 
 
}
