import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;


public class PlayingArea extends JPanel{
private MainWindow mainWindow;
public PlayingArea(MainWindow mainWindow){
	this.mainWindow = mainWindow;
	addMouseListener(new CellClickedListener());
	repaint();
	System.out.println("Raa");
}


@Override
protected void paintComponent(Graphics g) {
	// TODO Auto-generated method stub
	super.paintComponent(g);
//	g.drawArc(30, 30, 300, 100, 50, 50);
	
//	System.out.println("look here" + );
	g.drawArc(30, 30,10* mainWindow.southDisplay.slider3.getValue(),10* mainWindow.southDisplay.slider4.getValue(), mainWindow.southDisplay.slider5.getValue(), mainWindow.southDisplay.slider6.getValue());
}




private class CellClickedListener implements MouseListener {
	private int x,y;
	@Override
	public void mouseClicked(MouseEvent e) {
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	
	}




}
}
