package Adapterdesignpattern;

import com.Arbind.PilotPen;

public class PenAdapter implements Pen
{
	PilotPen pp = new PilotPen();

	public void write(String str) {
		
		pp.mark(str);
	}
	
}
