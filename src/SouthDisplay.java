import javax.swing.JPanel;
import javax.swing.JSlider;

public class SouthDisplay extends JPanel {
	public JSlider slider1;
	public JSlider slider2;
	public JSlider slider3;
	public JSlider slider4;
	public JSlider slider5;
	public JSlider slider6;
public SouthDisplay(){
	slider1 = new JSlider();
	slider2 = new JSlider();
	slider3 = new JSlider();
	slider4 = new JSlider();
	slider5 = new JSlider();
	slider6 = new JSlider();
	add(slider1);
	add(slider2);
	add(slider3);
	add(slider4);
	add(slider5);
	add(slider6);
	
}
}
