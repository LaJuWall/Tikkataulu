package Harkkatyo;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Paneeli helpottamaan heittosarjojen lisäystä
 * 
 * @author Lasse Wallden
 * @version 7.2.2012
 *
 */
public class lisaaSarja extends JPanel {
	private JLabel lblSarja;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public lisaaSarja() {
		setLayout(null);
		
		lblSarja = new JLabel("Sarja 1");
		lblSarja.setBounds(10, 12, 52, 17);
		add(lblSarja);
		
		textField = new JTextField();
		textField.setBounds(86, 10, 25, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 10, 25, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(190, 10, 25, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(239, 10, 25, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(289, 10, 25, 20);
		add(textField_4);
		textField_4.setColumns(10);

	}

	public String getCaption() {
		return lblSarja.getText();
	}
	public void setCaption(String text) {
		lblSarja.setText(text);
	}
}
