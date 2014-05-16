package Day2;

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

	// paint method let you paint something on the window
	public void paint(Graphics g) {
		// use these code as an example

		/*		g.drawLine(x1, y1, x2, y2);

				g.drawOval(x, y, width, height);
				g.drawRect(x, y, width, height);

				g.fillOval(x, y, width, height);
				g.fillRect(x, y, width, height);

				g.drawString(string, x, y);*/
	}
}