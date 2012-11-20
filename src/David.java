import java.awt.Graphics;

public class David {
	public David(){
		crotchLocationLocation =  new Location(125,175+jumper);
		leftFootLocationLocation =  new Location(100,200+jumper);
		rightFootLocationLocation =  new Location(150,200+jumper);
		neckLocation =  new Location(125,125+jumper);
		neckEndLocation =  new Location(125,135+jumper);
		shootingElboLocation = new Location(150,125+jumper);
		shootingHandLocation= new Location(150,90+jumper);
		nonShootingHandLocation= new Location(100,130+jumper);
		headRadius = 15;
		headLocation = new Location(125 - headRadius/2,125-headRadius+jumper);
	}
	private final int  jumper = 200;
	public int headRadius;
	public Location nonShootingHandLocation;
	public Location shootingHandLocation;
	public Location headLocation;
	public Location shootingElboLocation;
	public Location crotchLocationLocation;
	public Location leftFootLocationLocation;
	public Location rightFootLocationLocation;
	public Location neckLocation;
	public Location neckEndLocation;
	private int armLength = 20;
	public Location getHandShootingLocation(int angle){
		int y=(int) (shootingHandLocation.getX() - armLength*Math.acos(angle));
		int x=(int) (shootingHandLocation.getX() - armLength*Math.asin(angle));
		return new Location(x,y);
	}
	
	public void drawDavid(Graphics g){
		g.drawLine(leftFootLocationLocation.getX(), leftFootLocationLocation.getY(), crotchLocationLocation.getX(), crotchLocationLocation.getY());
		g.drawLine(rightFootLocationLocation.getX(), rightFootLocationLocation.getY(), crotchLocationLocation.getX(), crotchLocationLocation.getY());
		g.drawLine(crotchLocationLocation.getX(), crotchLocationLocation.getY(), neckLocation.getX(), neckLocation.getY());
		g.drawOval(headLocation.getX(), headLocation.getY(), headRadius, headRadius);
		g.drawLine(neckEndLocation.getX(), neckEndLocation.getY(), nonShootingHandLocation.getX(), nonShootingHandLocation.getY());
		g.drawLine(neckEndLocation.getX(), neckEndLocation.getY(), shootingElboLocation.getX(), shootingElboLocation.getY());
		g.drawLine(shootingElboLocation.getX(), shootingElboLocation.getY(), shootingHandLocation.getX(), shootingHandLocation.getY());
	}
}
