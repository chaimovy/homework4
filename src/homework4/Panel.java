package homework4;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

public class Panel implements Observer {
	private Color color;
	private int id;
	static int counter=0; 
	public Panel(){
		id=counter;
		counter++;
		
	}
	@Override
	public void update(Observable billboard, Object arg) {
		Billboard bb = (Billboard)billboard;
		color = bb.getColor();
	}

}