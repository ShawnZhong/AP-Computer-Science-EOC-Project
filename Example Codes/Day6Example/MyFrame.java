package Day6Example;

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
		for (double theta = 0; theta < 2 * Math.PI; theta += .001) {
			double x = 300 * Math.sin(5 * theta);
			double y = 300 * Math.cos(6 * theta);
			g.fillOval((int) x + 375, (int) -y + 375, 5, 5);
		}
	}
}
