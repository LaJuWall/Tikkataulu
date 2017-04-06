package Harkkatyo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class poistaKilpailu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					poistaKilpailu frame = new poistaKilpailu();
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
	public poistaKilpailu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 363, 167);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPoistaKilpailu = new JLabel("Poista Kilpailu");
		lblPoistaKilpailu.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblPoistaKilpailu.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoistaKilpailu.setBounds(0, 8, 347, 40);
		contentPane.add(lblPoistaKilpailu);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"KerhonKes\u00E4Kisa2008"}));
		comboBox.setBounds(129, 59, 178, 20);
		contentPane.add(comboBox);
		
		JLabel lblValitseKilpailu = new JLabel("Valitse kilpailu");
		lblValitseKilpailu.setHorizontalAlignment(SwingConstants.CENTER);
		lblValitseKilpailu.setBounds(31, 62, 99, 14);
		contentPane.add(lblValitseKilpailu);
		
		JButton btnNewButton = new JButton("Poista");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tikkataulu.poistaKilpailunTiedot();
			}
		});
		btnNewButton.setBounds(218, 90, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Peruuta");
		btnNewButton_1.setBounds(41, 90, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
