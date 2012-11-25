import java.awt.Graphics;


public class Sling {
	private David david;
	public Sling(David david){
		this.david = david;
		movingLeft = false;
		slingLengthRadius = 80;
		int waa = david.shootingHandLocation.getX();
		endOfSling = new Location((david.shootingHandLocation.getX() + slingLengthRadius),(david.shootingHandLocation.getY() ));

	}
	private Location endOfSling;
	private boolean movingLeft;

	private int slingLengthRadius;
	private int getSlingLengthFromPosition(){
		return (int) Math.sqrt(Math.pow((endOfSling.getX()-david.shootingHandLocation.getX()), 2) +Math.pow((endOfSling.getY()-david.shootingHandLocation.getY()), 2) );
	}
	public void updateAngle(int angle){
		endOfSling.setX((int) (getSlingLengthFromPosition()*Math.cos(angle)+david.shootingHandLocation.getX()));
		endOfSling.setY((int) (getSlingLengthFromPosition()*Math.sin(angle)+david.shootingHandLocation.getY()));
	}
	public void drawNextEndOfSlingLocation(int angle,int speed,Graphics g){
		int xMovingIncrementor;
		int yMovingIncrementor;
		//if sling is moving to the left
		if(movingLeft){
			//if reached left end
			if(getSlingLengthFromPosition()>=slingLengthRadius){
				movingLeft=false;
				xMovingIncrementor = (int)(speed*Math.cos(angle));
				yMovingIncrementor = (int)(speed*Math.sin(angle));
				System.out.println("xMovingIncrementor = " + xMovingIncrementor);
				System.out.println("yMovingIncrementor = " + yMovingIncrementor);
				endOfSling.setX(xMovingIncrementor+endOfSling.getX());
				endOfSling.setY(yMovingIncrementor+endOfSling.getY());
				System.out.println("movingLeft = false");
			}else{
			//keep moving to the left
				xMovingIncrementor = (int)(-speed*Math.cos(angle));
				yMovingIncrementor = (int)(-speed*Math.sin(angle));
				endOfSling.setX(xMovingIncrementor+endOfSling.getX());
				endOfSling.setY(yMovingIncrementor+endOfSling.getY());
			}
		}else{
			//if reached right end
			if(getSlingLengthFromPosition()>=slingLengthRadius){
				xMovingIncrementor = (int)(-speed*Math.cos(angle));
				yMovingIncrementor = (int)(-speed*Math.sin(angle));
				System.out.println("xMovingIncrementor = " + xMovingIncrementor);
				System.out.println("yMovingIncrementor = " + yMovingIncrementor);
				endOfSling.setX(xMovingIncrementor+endOfSling.getX());
				endOfSling.setY(yMovingIncrementor+endOfSling.getY());
				movingLeft=true;
				System.out.println("movingLeft = true");
			}else{
			//keep moving to the keep moving right
				xMovingIncrementor = (int)(speed*Math.cos(angle));
				yMovingIncrementor = (int)(speed*Math.sin(angle));
				endOfSling.setX(xMovingIncrementor+endOfSling.getX());
				endOfSling.setY(yMovingIncrementor+endOfSling.getY());


			}	
		}
		System.out.println("xlocation is " + endOfSling.getX());
		System.out.println("ylocation is " + endOfSling.getY());
		g.drawLine(david.shootingHandLocation.getX(), david.shootingHandLocation.getY(), endOfSling.getX(), endOfSling.getY());
		g.fillOval(endOfSling.getX()-rockWidth/2,endOfSling.getY()-rockWidth/2, rockWidth, rockWidth);
	}
	private int rockWidth = 10;
}
