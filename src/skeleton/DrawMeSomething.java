package skeleton;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class DrawMeSomething {

	ArdoiseMagique ardoise;
	
	public DrawMeSomething() {
		JFrame frame = new JFrame("Ardoise magique");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		frame.setMinimumSize(new Dimension(1000,500));
		frame.setVisible(true);
		frame.pack();

		this.ardoise = new ArdoiseMagique();
		ardoise.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {}

			@Override
			public void mousePressed(MouseEvent e) {
				ardoise.newCurve();
				ardoise.addPoint((int)e.getPoint().getX(), (int)e.getPoint().getY());
			}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}
			
		});
		frame.setContentPane(new ArdoiseMagique());
	}
	
}
