package homework4;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

public class Panel implements Observer {
	private Color color;
	private int id;
	static int counter; 
	public Panel(){
		id=counter;
		counter++;
		
	}
	@Override
	public void update(Observable o, Object arg) {
		color=(Color)arg;
		
	}
	//fhfgdfg f u 

}
