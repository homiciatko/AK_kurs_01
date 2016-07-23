package day_08.ballsExample;

public class BallRunnable implements Runnable {
	
	BallPanel ballPanel;
	private Ball ball;
	
	public BallRunnable(Ball ball, BallPanel ballPanel) {
		this.ball = ball;
		this.ballPanel = ballPanel;
	}
	
	
	@Override
	public void run() {
		
		int max = 1000;
		
		for (int i =0; i<max; i++) {
			ball.move(ballPanel.getBounds());
			ballPanel.repaint();
//			ballPanel.paint(ballPanel.getGraphics());
			try {
				Thread.sleep(2);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}

}
