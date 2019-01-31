package user_interface;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import game.Game;

/**
 * TODO
 * 
 * @author Joseph Hodskins
 */
public class GUI {

	public static void main(String[] args) {
		Game hangManGame = new Game();
    	 
		String initialText = "Hangman the Game!!!";
		final JTextArea area = new JTextArea(initialText, 8, 50);

		JPanel buttonPanel = new JPanel();
		buttonPanel.add(new JButton(new AbstractAction("New Game") {
			public void actionPerformed(ActionEvent e) {
				hangManGame.newGame();
			}
		}));

	JFrame frame = new JFrame("Hangman");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.getContentPane().add(new JScrollPane(area), BorderLayout.CENTER);
    	frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    	frame.pack();
    	frame.setVisible(true);
	}
}