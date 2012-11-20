import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;


public class PlayingArea extends JPanel{
private MainWindow mainWindow;
private David david;
private Goliath goliath;
private Rock rock;

public PlayingArea(MainWindow mainWindow){
	this.mainWindow = mainWindow;
	addMouseListener(new CellClickedListener());
	repaint();
	isLaunched = false;
}

private Location mouseClickLocation;
@Override
protected void paintComponent(Graphics g) {
	// TODO Auto-generated method stub
	super.paintComponent(g);
	
//	g.drawArc(30, 30, 300, 100, 50, 50);
	
//	System.out.println("look here" + );
	System.out.println(mainWindow.southDisplay.slider5.getValue()/100.0*360.0);
	shootingAngle = (int)( mainWindow.southDisplay.slider5.getValue()/100.0*360.0);
	Location theHandleLocation = getBowHandleLocation();
	g.drawArc(30, 30, 50,50,getBowStartAngle(),180);
	g.drawLine(30, 30, 80, 80);
}

//shooting angle from 0 to 360
private int shootingAngle;


private int getBowStartAngle(){
	return shootingAngle+270;
}

private Location getTopBowHandleLocation(){
	Location topHandle = new Location(david.davidsHoldHand.getX()-Math.,david.davidsHoldHand.getY());
	
}

private boolean isLaunched;
private Location getBottomBowHandleLocation(){
	return new Location();
	
}

private void getAngleDataForBow(int angleData []){
	//x y width height startAngle arcAngle

	
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
