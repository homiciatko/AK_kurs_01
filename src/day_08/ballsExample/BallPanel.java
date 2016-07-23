package day_08.ballsExample;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class BallPanel extends JPanel{
	
	private List<Ball> balls = new ArrayList<Ball>();
	
	public void add(Ball ball) {
		balls.add(ball);
	}
	
	@Override
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		Graphics2D graphics2d = (Graphics2D) graphics;
		
		for (Ball ball : balls)
			graphics2d.fill(ball.getShape());
		
	}

}
