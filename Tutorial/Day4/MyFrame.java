package Day4;

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
		// we cannot draw a line directly
		// but we can draw many small circle instead
		// this for loop draw a small circle every time

		// x is the independent variable
		// write the range of x blow
		for (double x = 0; x < 0; x += .001) {
			// write your function here
			// Hint : Math.sin()
			double y = 1;

			// (x * 20 + 375) is used to scale & correct the x-coordinate
			// (-y * 20 + 375) is used to scale & correct the y-coordinate
			// 375 is a half of the window
			// (int) is used to convert them to integer
			// the last two 5 is the radius of the circle (or dot)
			g.fillOval((int) (x * 20 + 375), (int) (-y * 20 + 375), 5, 5);
		}
	}
}
