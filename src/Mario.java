
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.util.*;

public class Mario extends MovingImage {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;
	private double vX, vY;

	public Mario(int x, int y) {
		super("mario.png", x, y, MARIO_WIDTH, MARIO_HEIGHT);
		vX = 0;
		vY = 0;
	}

	// METHODS
	public void walk(int dir) {
		moveByAmount(dir*2,0);
		System.out.println("Tested");
	}

	public void jump() {
		// JUMP!
	}

	public void act(ArrayList<Shape> obstacles) {
		vY+= 0.7;
		super.y+=vY;
		System.out.println("asd");
	}
}