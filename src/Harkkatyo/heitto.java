package Harkkatyo;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Component;

/**
 * Paneeli, joka helpottaa yksittäisen heiton tuloksen muokkaamista
 * 
 * @author Lasse Wallden
 * @version 7.2.2012
 *
 */
public class heitto extends JPanel {
	private JTextField textField;
	private JLabel lblHeitto;

	/**
	 * Create the panel.
	 */
	public heitto() {
		setSize(new Dimension(60, 57));
		setMaximumSize(new Dimension(60, 57));
		setPreferredSize(new Dimension(59, 57));
		setMinimumSize(new Dimension(60, 57));
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(16, 31, 25, 20);
		add(textField);
		textField.setColumns(10);
		
		lblHeitto = new JLabel("Heitto 1");
		lblHeitto.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblHeitto.setBounds(9, 10, 46, 14);
		add(lblHeitto);

	}
	
	public String getCaption() {
		return lblHeitto.getText();
	}
	public void setCaption(String text) {
		lblHeitto.setText(text);
	}
}
