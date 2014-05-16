package Day6;

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
		// theta is the independent variable
		// write the range of theta below
		// Hint : Math.PI
		for (double theta = 0; theta < 0; theta += .001) {
			// write your parametric equation below
			// Hint : Math.sin() , Math.cos()
			double x = 1;
			double y = 1;
			g.fillOval((int) x + 375, (int) -y + 375, 5, 5);
		}
	}
}
