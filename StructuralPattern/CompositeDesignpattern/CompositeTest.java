package CompositeDesignpattern;

public class CompositeTest {

	public static void main(String[] args) 
	{
		Component hd = new Leaf(3000,"Harddiskdrive");
		Component mouse = new Leaf(700,"Mouse");
		Component monitor = new Leaf(10000,"Monitor");
		Component ram = new Leaf(4500,"Ram");
		Component cpu = new Leaf(15000,"CPU");
		
		
		
		Composite ph = new Composite("peripheral:");
		Composite cabinet = new Composite("Cabinet");
		Composite mb = new Composite("Motherboard");
		Composite computer = new Composite("Computer:");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		ph.showPrice();
		System.out.println("\n******************\n");
		computer.showPrice();
		
		
	}

}
