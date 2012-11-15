import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;


public class MainWindow extends JFrame {
public SouthDisplay southDisplay;
	
	public MainWindow(){
		PlayingArea playingArea = new PlayingArea(this);
		add(playingArea,BorderLayout.CENTER);
		setSize(1300,550);
		southDisplay = new SouthDisplay();
		add(southDisplay,BorderLayout.SOUTH);
		
	}
	public static void main(String[] args) {
		MainWindow mainWindow = new MainWindow();
		mainWindow.setVisible(true);
		
	}
}
