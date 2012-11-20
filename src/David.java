public class David {
	public David(){

	
		
		
		crotchLocationLocation =  new Location(125,175);
		leftFootLocationLocation =  new Location(100,200);
		rightFootLocationLocation =  new Location(150,200);
		neckLocation =  new Location(125,125);
		shootingElboLocation = new Location(125,100);
		shootingHandLocation= new Location(175,75);
		nonShootingHandLocation= new Location(30,30);
		
	}
public Location nonShootingHandLocation;
	public Location shootingHandLocation;
	
	public Location shootingElboLocation;
	public Location crotchLocationLocation;
	public Location leftFootLocationLocation;
	public Location rightFootLocationLocation;
	public Location neckLocation;
	private int armLength = 20;
	public Location getHandShootingLocation(int angle){
		int y=(int) (shootingHandLocation.getX() - armLength*Math.acos(angle));
		int x=(int) (shootingHandLocation.getX() - armLength*Math.asin(angle));
		return new Location(x,y);
	}
}
