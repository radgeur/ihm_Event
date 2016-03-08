package skeleton;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class main {

	public static void main(String[] args) {
		//Construction de la JFrame
		JLabel label = new JLabel("0");
		JFrame frame = new JFrame("JFrame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		//récupération du container et création du layout
		Container pane = frame.getContentPane();
		BoxLayout layout = new BoxLayout(pane, BoxLayout.Y_AXIS);
		pane.setLayout(layout);

		//ajout des différents éléments au container
		pane.add(label);
		pane.add(new JButton("Button 1"));
	}
	
}
