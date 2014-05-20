package Day9Example;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
	double a = 5;

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		f.launchFrame();
	}

	public void launchFrame() {
		setSize(750, 750);
		setLocation(100, 100);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT)
					a -= 0.025;
				if (e.getKeyCode() == KeyEvent.VK_RIGHT)
					a += 0.025;
				repaint();
			}
		});
	}

	public void paint(Graphics g) {
		// Hint :background is a filled rectangle
		g.fillRect(0, 0, 750, 750);

		for (double theta = 0; theta < 2 * Math.PI; theta += .001) {
			double x = 300 * Math.sin(a * theta);
			double y = 300 * Math.cos((a + 1) * theta);
			g.fillOval((int) x + 375, (int) -y + 375, 7, 7);
		}

		g.drawString("a = " + a, 75, 60);

	}
}
