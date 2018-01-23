package homework4;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTable;

public class GUI {

	public GUI() {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		JTable table = new JTable(5, 5);
		table.setShowVerticalLines(true);
		frame.add(table);
		frame.setSize(400,128);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
