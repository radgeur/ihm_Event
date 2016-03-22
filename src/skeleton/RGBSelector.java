package skeleton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class RGBSelector {

	public RGBSelector() {
		JFrame frame = new JFrame("RGBSelector");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		//frame.setMinimumSize(new Dimension(500,200));
		
		//Instanciation des JPanels
		JPanel textAndSlide = new JPanel();
		BorderLayout xaxis = new BorderLayout();
		JPanel textFieldContainer = new JPanel();
		FlowLayout flow = new FlowLayout(FlowLayout.LEFT);
		textFieldContainer.setLayout(flow);
		JPanel sliderContainer = new JPanel();
		BoxLayout yaxis2 = new BoxLayout(sliderContainer, BoxLayout.Y_AXIS);
		sliderContainer.setLayout(yaxis2);
		JPanel lastPanel = new JPanel();
		BoxLayout yaxis3 = new BoxLayout(lastPanel, BoxLayout.Y_AXIS);
		lastPanel.setLayout(yaxis3);
		
		//Instanciation et ajout des différents composants à la fenêtre
		Container panel = frame.getContentPane();
		BoxLayout layout = new BoxLayout(panel, BoxLayout.X_AXIS);
		panel.setLayout(layout);
		
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();
		textFieldContainer.add(text1);
		textFieldContainer.add(text2);
		textFieldContainer.add(text3);

		JSlider slider = new JSlider(0,255);
		JSlider slider1 = new JSlider(0,255);
		JSlider slider2 = new JSlider(0,255);
		sliderContainer.add(slider);
		sliderContainer.add(slider1);
		sliderContainer.add(slider2);
		

		JTextField text4 = new JTextField();
		text4.setMinimumSize(new Dimension(50,10));
		JPanel colorBox = new JPanel();
		colorBox.setBackground(Color.MAGENTA);
		lastPanel.add(text4);
		lastPanel.add(colorBox);
		
		textAndSlide.add(sliderContainer, BorderLayout.CENTER);
		textAndSlide.add(textFieldContainer, BorderLayout.EAST);
		
		panel.add(textAndSlide);
		panel.add(lastPanel);
		
		frame.setVisible(true);
		frame.pack();
	}
	
}
