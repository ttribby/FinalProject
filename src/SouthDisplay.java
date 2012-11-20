import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
import javax.swing.JSlider;


public class SouthDisplay extends JPanel {
	private PlayingArea playingArea;
	public JSlider slider1;
	public JSlider slider2;
	public JSlider slider3;
	public JSlider slider4;
	public JSlider slider5;
	public JSlider slider6;
public SouthDisplay(PlayingArea playingArea){
	this.playingArea = playingArea;
	slider1 = new JSlider();
	slider2 = new JSlider();
	slider3 = new JSlider();
	slider4 = new JSlider();
	slider5 = new JSlider();
	slider6 = new JSlider();
	slider1.addMouseMotionListener(new FishishedSchrolling());
	slider2.addMouseMotionListener(new FishishedSchrolling());
	slider3.addMouseMotionListener(new FishishedSchrolling());
	slider4.addMouseMotionListener(new FishishedSchrolling());
	slider5.addMouseMotionListener(new FishishedSchrolling());
	slider6.addMouseMotionListener(new FishishedSchrolling());
	add(slider1);
	add(slider2);
	add(slider3);
	add(slider4);
	add(slider5);
	add(slider6);
	
}

private class FishishedSchrolling implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		playingArea.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		playingArea.repaint();
	}

}

}
