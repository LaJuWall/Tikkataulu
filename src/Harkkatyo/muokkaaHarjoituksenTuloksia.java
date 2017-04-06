package Harkkatyo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Ikkuna, joka avautuu käyttäjän muokatessa harjoitus tuloksia
 * 
 * @author Lasse Wallden
 * @version 7.2.2012
 *
 */
public class muokkaaHarjoituksenTuloksia extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					muokkaaHarjoituksenTuloksia frame = new muokkaaHarjoituksenTuloksia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public muokkaaHarjoituksenTuloksia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(67, 114, 31, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(135, 114, 31, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(206, 114, 31, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(267, 113, 31, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(335, 112, 31, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblLisHarjoitussarja = new JLabel("Muokkaa harjoituksen tuloksia");
		lblLisHarjoitussarja.setBackground(Color.WHITE);
		lblLisHarjoitussarja.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblLisHarjoitussarja.setHorizontalAlignment(SwingConstants.CENTER);
		lblLisHarjoitussarja.setBounds(0, 5, 435, 36);
		contentPane.add(lblLisHarjoitussarja);
		
		JLabel lblPivmr = new JLabel("P\u00E4iv\u00E4m\u00E4\u00E4r\u00E4");
		lblPivmr.setHorizontalAlignment(SwingConstants.CENTER);
		lblPivmr.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblPivmr.setBounds(7, 50, 86, 14);
		contentPane.add(lblPivmr);
		
		JLabel lblHeitto = new JLabel("Heitto 1");
		lblHeitto.setBounds(64, 92, 46, 14);
		contentPane.add(lblHeitto);
		
		JLabel lblHeitto_1 = new JLabel("Heitto 2");
		lblHeitto_1.setBounds(133, 92, 46, 14);
		contentPane.add(lblHeitto_1);
		
		JLabel lblHeitto_2 = new JLabel("Heitto 3");
		lblHeitto_2.setBounds(202, 92, 46, 14);
		contentPane.add(lblHeitto_2);
		
		JLabel lblHeitto_3 = new JLabel("Heitto 4");
		lblHeitto_3.setBounds(266, 92, 46, 14);
		contentPane.add(lblHeitto_3);
		
		JLabel lblHeitto_4 = new JLabel("Heitto 5");
		lblHeitto_4.setBounds(336, 92, 46, 14);
		contentPane.add(lblHeitto_4);
		
		JButton btnTalleta = new JButton("Talleta");
		btnTalleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tikkataulu.talletaHarkanTulokset();
			}
		});
		btnTalleta.setBounds(267, 165, 89, 23);
		contentPane.add(btnTalleta);
		
		JButton btnPeruuta = new JButton("Peruuta");
		btnPeruuta.setBounds(96, 165, 89, 23);
		contentPane.add(btnPeruuta);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2.5.2008", "10.6.2008"}));
		comboBox.setBounds(97, 48, 141, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Lis\u00E4\u00E4 uusi harjoitus");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tikkataulu.lisaaHarjoitus();
			}
		});
		btnNewButton.setBounds(272, 47, 147, 23);
		contentPane.add(btnNewButton);
	}
}
