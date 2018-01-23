package homework4;

import java.awt.Color;
import java.util.Observable;

public class Billboard extends Observable{
	private Color color;
		
		public Billboard(){
			color = Color.BLUE;
			for(int i=0; i<25; i++)
				addObserver(new Panel());
		}
		
		public Color getColor(){
			return this.color;
		}
		
		public void setColor(Color color){
			this.color = color;
			setChanged();
			notifyObservers();
		}
}
