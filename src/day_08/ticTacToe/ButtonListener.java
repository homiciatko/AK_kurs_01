package day_08.ticTacToe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonListener implements ActionListener {
	
	private int counter = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton) e.getSource();
		if (counter++ %2 == 0) {
			clickedButton.setText("X");
		}
		else  {
			clickedButton.setText("O");
		}
		clickedButton.setEnabled(false);
	}
	
}
