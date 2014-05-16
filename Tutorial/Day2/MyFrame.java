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
		// g.setFont(new Font("Microsoft YaHei", Font.BOLD, 50));

		// g.setColor(Color.blue);
		// g.setColor(Color.green);
		// g.setColor(Color.black);

		// g.drawLine(x1, y1, x2, y2);
		// g.drawString(str, x, y);

		// g.drawOval(x, y, width, height);
		// g.drawRect(x, y, width, height);
		// g.drawArc(x, y, width, height, startAngle, arcAngle);
		// g.drawRoundRect(x, y, width, height, arcWidth, arcHeight);

		// g.fillOval(x, y, width, height);
		// g.fillRect(x, y, width, height);
		// g.fillArc(x, y, width, height, startAngle, arcAngle);
		// g.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
	}
}