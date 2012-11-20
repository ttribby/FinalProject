
public class Sling {
	private David david;
	public Sling(David david){
		this.david = david;
		movingLeft = true;
		slingLengthRadius = 20;
	}
	private Location endOfSling;
	private boolean movingLeft;

	private int slingLengthRadius;
	private int getSlingLengthFromPosition(){
		return (int) Math.hypot( (endOfSling.getX()-david.shootingHandLocation.getX()),(endOfSling.getY()-david.shootingHandLocation.getY()));
	}
	public Location getNextEndOfSlingLocation(int angle,int speed){
		int xMovingIncrementor;
		int yMovingIncrementor;
		//if sling is moving to the left
		if(movingLeft){
			//if reached left end
			if(getSlingLengthFromPosition()>=slingLengthRadius){
				movingLeft=false;
			}else{
			//keep moving to the left
				xMovingIncrementor = (int)(-speed*Math.asin(angle));
				yMovingIncrementor = (int)(-speed*Math.acos(angle));
				if(xMovingIncrementor!=0 && yMovingIncrementor!=0){
					endOfSling.setX(xMovingIncrementor+endOfSling.getX());
					endOfSling.setY(yMovingIncrementor+endOfSling.getY());
				}
			}
		}else{
			//if reached right end
			if(getSlingLengthFromPosition()>=slingLengthRadius){
				movingLeft=true;
			}else{
			//keep moving to the keep moving right
				xMovingIncrementor = (int)(speed*Math.asin(angle));
				yMovingIncrementor = (int)(speed*Math.acos(angle));
				if(xMovingIncrementor!=0 && yMovingIncrementor!=0){
					endOfSling.setX(xMovingIncrementor+endOfSling.getX());
					endOfSling.setY(yMovingIncrementor+endOfSling.getY());
				}

			}	
		}
		return endOfSling;
	}
}
