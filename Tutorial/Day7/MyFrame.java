package Day7;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {

	// we use a variable n instead of fixed value
	double n = 5;

	public void launchFrame() {
		setSize(750, 750);
		setLocation(100, 100);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// like the WindowListener, we will add KeyAdapter
		addKeyListener(new KeyAdapter() {

			// we will override method keyPressed in KeyAdapter class
			public void keyPressed(KeyEvent e) {

				// if your pressed key is left
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					// write your codes here
				}

				// if your pressed key is right
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					// write your codes here
				}

				// repaint the window
				repaint();
			}
		});
	}

	public void paint(Graphics g) {
		// that's what you wrote yesterday
		for (double theta = 0; theta < 2 * Math.PI; theta += .001) {
			// we use a variable n this time instead of fixed value
			double x = 300 * Math.sin(n * theta);
			double y = 300 * Math.cos((n + 1) * theta);
			g.fillOval((int) x + 375, (int) -y + 375, 7, 7);
		}
	}
}
