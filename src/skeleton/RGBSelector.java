package skeleton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class RGBSelector {
	
	private JFrame frame;
	private JSlider redSlider, blueSlider, greenSlider;
	private JPanel textAndSlide, textFieldContainer, sliderContainer, lastPanel, colorBox;
	private JTextField redTextField, blueTextField, greenTextField, hexaTextField;
	private String hexa;

	public RGBSelector() {
		frame = new JFrame("RGBSelector");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		//frame.setMinimumSize(new Dimension(500,200));
		
		//Instanciation des JPanels
		textAndSlide = new JPanel();
		
		textFieldContainer = new JPanel();
		BoxLayout flow = new BoxLayout(textFieldContainer, BoxLayout.Y_AXIS);
		textFieldContainer.setLayout(flow);
		
		sliderContainer = new JPanel();
		BoxLayout yaxis2 = new BoxLayout(sliderContainer, BoxLayout.Y_AXIS);
		sliderContainer.setLayout(yaxis2);
		
		lastPanel = new JPanel();
		BorderLayout xaxis2 = new BorderLayout();
		lastPanel.setLayout(xaxis2);
		
		//Instanciation et ajout des différents composants à la fenêtre
		Container panel = frame.getContentPane();
		BoxLayout layout = new BoxLayout(panel, BoxLayout.X_AXIS);
		panel.setLayout(layout);
		
		//Sliders
		redSlider = new JSlider(0,255);
		redSlider.addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e) {
				redTextField.setText(Integer.toString(redSlider.getValue()));
				colorBox.setBackground(new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue()));
				hexaTextField.setText(Integer.toHexString(redSlider.getValue()) + Integer.toHexString(greenSlider.getValue()) + Integer.toHexString(blueSlider.getValue()));
			}
		});
		greenSlider = new JSlider(0,255);
		greenSlider.addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e) {
				greenTextField.setText(Integer.toString(greenSlider.getValue()));
				colorBox.setBackground(new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue()));
				hexaTextField.setText(Integer.toHexString(redSlider.getValue()) + Integer.toHexString(greenSlider.getValue()) + Integer.toHexString(blueSlider.getValue()));
			}
		});
		blueSlider = new JSlider(0,255);
		blueSlider.addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent e) {
				blueTextField.setText(Integer.toString(blueSlider.getValue()));
				colorBox.setBackground(new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue()));
				hexaTextField.setText(Integer.toHexString(redSlider.getValue()) + Integer.toHexString(greenSlider.getValue()) + Integer.toHexString(blueSlider.getValue()));
			}
		});
		sliderContainer.add(redSlider);
		sliderContainer.add(greenSlider);
		sliderContainer.add(blueSlider);
		
		//JTextFields
		redTextField = new JTextField(Integer.toString(redSlider.getValue()),3);
		redTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				redSlider.setValue(Integer.parseInt(redTextField.getText()));
				hexaTextField.setText(Integer.toHexString(redSlider.getValue()) + Integer.toHexString(greenSlider.getValue()) + Integer.toHexString(blueSlider.getValue()));
			}	
		});
		greenTextField = new JTextField(Integer.toString(greenSlider.getValue()),3);
		greenTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				greenSlider.setValue(Integer.parseInt(greenTextField.getText()));
				hexaTextField.setText(Integer.toHexString(redSlider.getValue()) + Integer.toHexString(greenSlider.getValue()) + Integer.toHexString(blueSlider.getValue()));
			}	
		});
		blueTextField = new JTextField(Integer.toString(blueSlider.getValue()),3);
		blueTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				blueSlider.setValue(Integer.parseInt(blueTextField.getText()));
				hexaTextField.setText(Integer.toHexString(redSlider.getValue()) + Integer.toHexString(greenSlider.getValue()) + Integer.toHexString(blueSlider.getValue()));
			}	
		});
		textFieldContainer.add(redTextField);
		textFieldContainer.add(greenTextField);
		textFieldContainer.add(blueTextField);
		
		//Hexa and color
		hexa = Integer.toHexString(redSlider.getValue()) + Integer.toHexString(greenSlider.getValue()) + Integer.toHexString(blueSlider.getValue());
		hexaTextField = new JTextField(hexa, 6);
		hexaTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				Color color = Color.decode("#" + hexaTextField.getText());
				colorBox.setBackground(color);
				redSlider.setValue(color.getRed());
				greenSlider.setValue(color.getGreen());
				blueSlider.setValue(color.getBlue());
				redTextField.setText(Integer.toString(color.getRed()));
				greenTextField.setText(Integer.toString(color.getGreen()));
				blueTextField.setText(Integer.toString(color.getBlue()));
			}	
		});
		colorBox = new JPanel();
		colorBox.setBackground(new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue()));
		lastPanel.add(hexaTextField, BorderLayout.NORTH);
		lastPanel.add(colorBox, BorderLayout.CENTER);
		
		textAndSlide.add(sliderContainer);
		textAndSlide.add(textFieldContainer);
		
		panel.add(textAndSlide);
		panel.add(lastPanel);
		
		frame.setVisible(true);
		frame.pack();
	}
	
}
