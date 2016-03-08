package skeleton;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NameButton {
	private JLabel label;
	private JButton button1;
	private JButton button2;
	private JButton button3;	

	public NameButton() {
		//Construction de la JFrame
		this.label = new JLabel("Bouton ?");
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		JFrame frame = new JFrame("JFrame");
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		
		//récupération du container et création du layout
		Container pane = frame.getContentPane();
		BoxLayout layout = new BoxLayout(pane, BoxLayout.Y_AXIS);
		pane.setLayout(layout);

		//ajout des différents éléments au container
		pane.add(label);
		this.button1 = new JButton("Bouton 1");
		button1.setAlignmentX(Component.CENTER_ALIGNMENT);
		button1.addActionListener(new PrintButtonName());
		pane.add(button1);
		this.button2 = new JButton("Bouton 2");
		button2.setAlignmentX(Component.CENTER_ALIGNMENT);
		button2.addActionListener(new PrintButtonName());
		pane.add(button2);
		this.button3 = new JButton("Bouton 3");
		button3.setAlignmentX(Component.CENTER_ALIGNMENT);
		button3.addActionListener(new PrintButtonName());
		pane.add(button3);
		
		frame.setVisible(true);
		frame.pack();
		
		new ArdoiseMagique();
	}
	
	private class PrintButtonName implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			label.setText(button.getText());
		}
		
	}
	
}
