//Author Name: Angel Ramos
//Date: 8/28/2020
//Program Name: Ramos_Drone
//Purpose: Simulation using button, drone movement in x, y,z location

package Drone;

public class Ramos_Drone {
	
	private int x = 0;
	private int y = 0;
	private int z = 0;
	private String orientation = "North";
	
	public Ramos_Drone(int x, int y, int z, String orientation) {
		setX(x);
		setY(y);
		setZ(z);
		setOrientation(orientation);
	}
	
	public void moveUp(int z) {
		setZ(z+1);
	}
	
	public void moveDown(int z) {
		setZ(z-1);
	}
	
	public void moveForward(int x, int y, String orientation) {
		if(orientation == "North") {
			setY(y+1);
		}
		else if(orientation == "South") {
			setY(y-1);
		}
		else if(orientation == "East") {
			setX(x+1);
		}
		else if(orientation == "West") {
			setX(x-1);
		}	
	}
	
	public void moveBackward(int x, int y, String orientation) {
		if(orientation == "North") {
			setY(y-1);
		}
		else if(orientation == "South") {
			setY(y+1);
		}
		else if(orientation == "East") {
			setX(x-1);
		}
		else if(orientation == "West") {
			setX(x+1);
		}	
	}
	
	public void turnLeft(String orientation) {
		if(orientation == "North") {
			setOrientation("West");
		}
		else if(orientation == "West") {
			setOrientation("South");
		}
		else if(orientation == "South") {
			setOrientation("East");
		}
		else if(orientation == "East") {
			setOrientation("North");
		}	
	}
	
	public void turnRight(String orientation) {
		if(orientation == "North") {
			setOrientation("East");
		}
		else if(orientation == "East") {
			setOrientation("South");
		}
		else if(orientation == "South") {
			setOrientation("West");
		}
		else if(orientation == "West") {
			setOrientation("North");
		}	
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	
	@Override
	public String toString() {
		return "Ramos_Drone [x_pos=" + x + ", y_pos=" + y + ", z_pos=" + z + ", orientation=" + orientation + "]";
	}
}
