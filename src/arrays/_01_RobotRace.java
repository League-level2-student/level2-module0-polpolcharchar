package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot robots[] = new Robot[50];
		int robotAngles[] = new int[50];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setSpeed(1000000);
			robots[i].moveTo(/*50 + (90 * i)*/200, 300);

		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		Random r = new Random();
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		
		boolean raceFinished = false;
		int winner = 0;
		
		
		while (!(raceFinished)) {
			for (int i = 0; i < robots.length; i++) {

				robots[i].move(r.nextInt(10));
				int placeholder = r.nextInt(5);
				robots[i].turn(placeholder);
				robotAngles[i] += placeholder;
				if(robotAngles[i] >= 360) {
					raceFinished = true;
					winner = i;
				}
				
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
System.out.println("Winner is robot " + (winner + 1) + "!");
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
