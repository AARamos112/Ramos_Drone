//Author Name: Angel Ramos
//Date: 8/28/2020
//Program Name: Ramos_Drone
//Purpose: Simulation using button, drone movement in x, y,z location

package Drone;
import java.util.Scanner;

public class testDrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int y = 0;
		int z = 0;
		String orientation = "North";
		int option = 0;
		Ramos_Drone Drone = new Ramos_Drone(x, y, z, orientation);
			
		Scanner input = new Scanner(System.in);
		do {
			try {
				System.out.println("Which direction would you lik to move the drone?"
						+ "\n1 - Move Up\n2 - Move Down\n3 - Move Forward\n4 - Move Backward"
						+ "\n5 - Turn Left\n6 - Turn Right\n7 - Display Position\n8 - Exit Navigation");
				option = input.nextInt();
			}
			catch(Exception ex){	
			} 
			if( option == 1) {
				Drone.moveUp(Drone.getZ());
				System.out.println("You have moved up");
			}
			
			if( option == 2) {
				Drone.moveDown(Drone.getZ());	
				System.out.println("You have moved down");
			}
			
			if( option == 3) {
				Drone.moveForward(Drone.getX(),Drone.getY(), Drone.getOrientation());
				System.out.println("You have moved forward");
			}
			
			if( option == 4) {
				Drone.moveBackward(Drone.getX(),Drone.getY(), Drone.getOrientation());
				System.out.println("You have moved backward");
			}
			
			if( option == 5) {
				Drone.turnLeft(Drone.getOrientation());
				System.out.println("You have turned left");
			}
			
			if( option == 6) {
				Drone.turnRight(Drone.getOrientation());
				System.out.println("You have turned right");
			}
			
			if( option == 7) {
				System.out.println(Drone.toString());	
			}
					
		}while( option != 8);
		System.out.print("Goodbye!");
		input.close();
		 
	}
}
