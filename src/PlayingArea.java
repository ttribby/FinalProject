import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;


public class PlayingArea extends JPanel{
private MainWindow mainWindow;
private David david;
private Goliath goliath;
private Rock rock;
private Sling sling;
public PlayingArea(MainWindow mainWindow){
	this.mainWindow = mainWindow;
	CellClickedListener cellClickedListener = new CellClickedListener();
	addMouseListener(cellClickedListener);
	addMouseMotionListener(cellClickedListener);
	repaint();
	david = new David();
	goliath = new Goliath();
	rock = new Rock();
	sling = new Sling(david);
	Timer oneMilliSecTimer = new Timer();
	mouseXCoord = 0;
	mouseYCoord = 0;
	distanceDragged = 0;
	oneMilliSecTimer.schedule(new UpdateDrawing(),0,30);
}
private class UpdateDrawing extends TimerTask {
	public void run() {
		System.out.println("-------");
		repaint();
	}
}

private Location mouseClickLocation;
@Override
protected void paintComponent(Graphics g) {
	// TODO Auto-generated method stub
	super.paintComponent(g);
	david.drawDavid(g);
	sling.drawNextEndOfSlingLocation(0, 5, g);
	if(drawLine){
		g.drawLine(lineStart.getX(), lineStart.getY(), lineEnd.getX(), lineEnd.getY());
		if ((lineEnd.getX()-lineStart.getX())   == 0)
			mainWindow.southDisplay.angleResult.setText("0");
		else{
			
			mainWindow.southDisplay.angleResult.setText(angle+ "deg");
			
		}
		mainWindow.southDisplay.powerResult.setText(distanceDragged/2 + "%");

	}
}//////////////////}//////////////////}//////////////////}//////////////////}//////////////////}//////////////////}//////////////////

//shooting angle from 0 to 360
private int shootingAngle;
private int angle = 0;
private int mouseXCoord;
private int mouseYCoord;
private int distanceDragged;
private boolean drawLine = false;
private Location lineStart = new Location(0,0);
private Location lineEnd = new Location(0,0);
private class CellClickedListener implements MouseListener, MouseMotionListener{
	private int x,y;
	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseXCoord = e.getX();
		mouseYCoord = e.getY();
		angle = 0;
		distanceDragged = 0;
		drawLine = true;
		lineStart.setX(e.getX());
		lineStart.setY(e.getY());
		lineEnd.setX(e.getX());
		lineEnd.setY(e.getY());
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		drawLine = false;
		repaint();
	}

	public void mouseDragged(MouseEvent e) {
	    distanceDragged = (int) (Math.abs(Math.sqrt((Math.pow(mouseXCoord-e.getX(), 2) + Math.pow(( mouseYCoord)-e.getY(),2)))));
	    System.out.println(distanceDragged);
	    
	    lineEnd.setX(e.getX());
	    lineEnd.setY(e.getY());
	    angle = (int) Math.floor((Math.atan2( (lineEnd.getY()-lineStart.getY()),(lineStart.getX()-lineEnd.getX())  )*180/Math.PI) );
	    sling.updateAngle(angle);
	    repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		
	} 
}
}
