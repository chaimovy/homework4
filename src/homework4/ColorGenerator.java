package homework4;
import javax.swing.Timer;
import java.awt.Color;
import java.util.Random;

public class ColorGenerator {
	private static ColorGenerator colorGenerator=null;
	private Color color;
	private Timer t;
	
	protected ColorGenerator(
			) {
		genColor();
		int delay = 1000; // delay for 1 sec. 
		int period = 10000; // repeat every 10 sec. 
		Timer timer = new Timer(period, null); 
		timer.scheduleAtFixedRate(new TimerTask() 
		    { 
		        public void run() 
		        { 
		            displayData();  // display the data
		        } 
		    }, delay, period);  
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
