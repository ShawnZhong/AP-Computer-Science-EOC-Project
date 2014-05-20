package Day2Example;

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
		g.drawLine(0, 0, 750, 750);
		g.fillRect(275, 275, 100, 100);
		g.drawOval(50, 50, 150, 150);
		g.drawString("Hello", 500, 500);
	}
}