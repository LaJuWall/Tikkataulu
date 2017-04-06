package Harkkatyo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class muokkaaKisa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					muokkaaKisa frame = new muokkaaKisa();
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
	public muokkaaKisa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 288, 285);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMuokkaaKisa = new JLabel("Muokkaa kilpailuja");
		lblMuokkaaKisa.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblMuokkaaKisa.setHorizontalAlignment(SwingConstants.CENTER);
		lblMuokkaaKisa.setBounds(32, 11, 203, 36);
		contentPane.add(lblMuokkaaKisa);
		
		EditPaneeli editPaneeli = new EditPaneeli();
		editPaneeli.setBounds(12, 95, 250, 20);
		contentPane.add(editPaneeli);
		
		EditPaneeli editPaneeli_1 = new EditPaneeli();
		editPaneeli_1.setCaption("P\u00E4iv\u00E4m\u00E4\u00E4r\u00E4");
		editPaneeli_1.setBounds(14, 167, 210, 20);
		contentPane.add(editPaneeli_1);
		
		EditPaneeli editPaneeli_3 = new EditPaneeli();
		editPaneeli_3.setCaption("Koodi");
		editPaneeli_3.setBounds(12, 133, 161, 20);
		contentPane.add(editPaneeli_3);
		
		JButton btnTalleta = new JButton("Talleta");
		btnTalleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tikkataulu.tallennaKisanTiedot();
			}
		});
		btnTalleta.setBounds(173, 198, 89, 23);
		contentPane.add(btnTalleta);
		
		JButton btnPeruuta = new JButton("Peruuta");
		btnPeruuta.setBounds(12, 198, 89, 23);
		contentPane.add(btnPeruuta);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SM2008"}));
		comboBox.setBounds(10, 64, 254, 20);
		contentPane.add(comboBox);
	}
}
