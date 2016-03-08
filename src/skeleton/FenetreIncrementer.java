package skeleton;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FenetreIncrementer {

	private JLabel label;
	
	public FenetreIncrementer () {
		//Construction de la JFrame
		this.label = new JLabel("0");
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
		JButton button = new JButton("incrémenter");
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("clic sur le bouton");
				int labelText = Integer.parseInt(label.getText());
				label.setText("" + ++labelText);
			}
		});
		pane.add(button);
		
		//nouvelle définition de la fermeture de la frame
		frame.addWindowListener(new FermetureFenetre());
		
		frame.setVisible(true);
		frame.pack();
	}	
}
