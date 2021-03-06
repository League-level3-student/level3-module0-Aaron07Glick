package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
Robot[] robots = new Robot[5];
		//3. use a for loop to initialize the robots.
	for (int i = 0; i < robots.length; i++) {
		robots[i] = new Robot();
		
	}
			//4. make each robot start at the bottom of the screen, side by side, facing up
		robots[0].setX(40);
		robots[0].setY(500);
		robots[1].setX(120);
		robots[1].setY(500);
		robots[2].setX(200);
		robots[2].setY(500);
		robots[3].setX(280);
		robots[3].setY(500);
		robots[4].setX(360);
		robots[4].setY(500);
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		Random rand = new Random();
		
		
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		while (robots[0].getY() >= 0 || robots[1].getY() >= 0 || robots[2].getY() >= 0 || robots[3].getY() >= 0 || robots[4].getY() >= 0 ) {
			for (int i = 0; i < 5; i++) {
				int ran = rand.nextInt(50);
				robots[i].move(ran);
			}
			if(robots[0].getY() <= 0 || robots[1].getY() <= 0 || robots[2].getY() <= 0 || robots[3].getY() <= 0 || robots[4].getY() <= 0 ) {
				break;
			}
		}
		//7. declare that robot the winner and throw it a party!
    		if(robots[0].getY() <= 0) {
    			for (int i = 0; i < robots.length; i++) {
					robots[i].sparkle();
				}
    		}
    		if(robots[1].getY() <= 0) {
    			for (int i = 0; i < robots.length; i++) {
					robots[i].sparkle();
				}
    		}
    		if(robots[2].getY() <= 0) {
    			for (int i = 0; i < robots.length; i++) {
					robots[i].sparkle();
				}
    		}
    		if(robots[3].getY() <= 0) {
    			for (int i = 0; i < robots.length; i++) {
					robots[i].sparkle();
				}
    		}
    		if(robots[4].getY() <= 0) {
    			for (int i = 0; i < robots.length; i++) {
					robots[i].sparkle();
				}
    		}
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
