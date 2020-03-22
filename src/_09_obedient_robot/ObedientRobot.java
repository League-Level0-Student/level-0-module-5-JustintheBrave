package _09_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	
	static Robot shape = new Robot("batman");

	
	public static void main(String[] args) {
		shape.miniaturize();
		shape.setSpeed(200);
		shape.penDown();
		
		String ans = JOptionPane.showInputDialog("what shape do you want(square, triangle, circle)?");
		String color = JOptionPane.showInputDialog("what color do you want(red, green, blue, purple)?");
		
		
		if(color.equalsIgnoreCase("red")) {
			shape.setPenColor(255,4,25);
		}
		
		else if(color.equalsIgnoreCase("green")) {
			shape.setPenColor(23,255,25);
		}
		
		else if(color.equalsIgnoreCase("blue")) {
			shape.setPenColor(25,4,255);
		}
		
		else if(color.equalsIgnoreCase("purple")) {
			shape.setPenColor(255,55,255);
		}
		
		
		if(ans.equalsIgnoreCase("square")) {
			drawSquare();
		}
		
		else if(ans.equalsIgnoreCase("circle")) {
			drawCircle();
		}
		
		else if(ans.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}
		
		shape.hide();
			
	}
	public static void drawSquare() {
		for(int i=0; i<4; i++) {
			shape.move(100);
			shape.turn(90);
		}
	}
	
	public static void drawCircle() {
		for(int j=0; j<360; j++) {
			shape.move(1);
			shape.turn(1);
		}	
	}
	
	public static void drawTriangle() {
		for (int o = 0; o < 3; o++) {
			shape.move(100);
			shape.turn(120);
		}
	}
	
	
	
	
}
