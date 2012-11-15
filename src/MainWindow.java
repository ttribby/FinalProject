import javax.swing.JFrame;


public class MainWindow extends JFrame {
	public MainWindow(){
		PlayingArea playingArea = new PlayingArea();
		add(playingArea);
		setSize(600,550);
	}
	public static void main(String[] args) {
		MainWindow mainWindow = new MainWindow();
		
		

	}
}
