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

public class poistaHarjoitus extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					poistaHarjoitus frame = new poistaHarjoitus();
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
	public poistaHarjoitus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 266, 166);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Poista harjoitus");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 250, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblValitsePivmr = new JLabel("valitse p\u00E4iv\u00E4m\u00E4\u00E4r\u00E4");
		lblValitsePivmr.setHorizontalAlignment(SwingConstants.CENTER);
		lblValitsePivmr.setBounds(0, 45, 250, 14);
		contentPane.add(lblValitsePivmr);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"10.6.2008"}));
		comboBox.setBounds(36, 59, 168, 20);
		contentPane.add(comboBox);
		
		JButton btnPoista = new JButton("Poista");
		btnPoista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tikkataulu.poistaHarjoituksenTiedot();
			}
		});
		btnPoista.setBounds(139, 90, 89, 23);
		contentPane.add(btnPoista);
		
		JButton btnPeruuta = new JButton("Peruuta");
		btnPeruuta.setBounds(10, 90, 89, 23);
		contentPane.add(btnPeruuta);
	}
}
