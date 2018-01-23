package homework4;

import javax.swing.Timer;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ColorGenerator {
	private static ColorGenerator colorGenerator=null;
	private Color color;
	private Timer t;
	
	protected ColorGenerator() {
		genColor();
		t = new Timer(2000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				updateColor();
			}
		});
		t.start();
	}
	public static ColorGenerator getInstance() {
		if (colorGenerator==null)
			colorGenerator=new ColorGenerator();
		return colorGenerator; 
	}
	private void genColor() {
		Random rand = new Random();
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		color = new Color(r, g, b);
	}
	public Color getColor() {
		return color;
	}
	private void updateColor() {
		genColor();
	}
}
