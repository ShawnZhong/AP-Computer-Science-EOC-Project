package Day4Example;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
	public void launchFrame() {
		setSize(750, 750);
		setLocation(100, 100);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void paint(Graphics g) {
		for (double x = -30; x < 30; x += .01) {
			double y = Math.sin(x);
			g.fillOval((int) (x * 20 + 375), (int) (-y * 20 + 375), 5, 5);
		}
	}
}
