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
		// write the range of t blow
		for (double t = 0; t < 0; t += .001) {
			// write your parametric equation here
			double x = 1;
			double y = 1;
			// (x * 20 + 375) is used to scale & correct the x-coordinate
			// (-y * 20 + 375) is used to scale & correct the y-coordinate
			// (int) is used to convert them to integer
			g.fillOval((int) (x * 20 + 375), (int) (-y * 20 + 375), 5, 5);
		}
	}
}
