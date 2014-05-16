package Day5;

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
		// t is the independent variable
		// t increases from -30 to 30 by 0.01
		for (double t = -30; t < 30; t += .01) {
			// write your parametric equation here
			double x = 1;
			double y = 1;
			// (x + 375) is uesd to correct the x-coordinate
			// (-y + 700)is uesd to correct the y-coordinate
			// (int) is used to convert them to integer
			g.fillOval((int) (x + 375), (int) (-y + 700), 5, 5);
		}
	}
}
