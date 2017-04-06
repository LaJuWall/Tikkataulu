package Harkkatyo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Ikkuna, joka avautuu käyttäjän muokatessa kilpailu tuloksia
 * 
 * @author Lasse Wallden
 * @version 7.2.2012
 *
 */
public class muokkaaKilpailunTuloksia extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					muokkaaKilpailunTuloksia frame = new muokkaaKilpailunTuloksia();
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
	public muokkaaKilpailunTuloksia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLisKilpailu = new JLabel("Muokkaa kilpailun tuloksia");
		lblLisKilpailu.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblLisKilpailu.setHorizontalAlignment(SwingConstants.CENTER);
		lblLisKilpailu.setBounds(0, 11, 338, 31);
		contentPane.add(lblLisKilpailu);
		
		JLabel lblNewLabel = new JLabel("Kilpailu");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel.setBounds(30, 57, 55, 25);
		contentPane.add(lblNewLabel);
		
		lisaaSarja lisaaSarja__1 = new lisaaSarja();
		lisaaSarja__1.setBounds(10, 135, 318, 41);
		contentPane.add(lisaaSarja__1);
		
		lisaaSarja lisaaSarja_ = new lisaaSarja();
		lisaaSarja_.setCaption("Sarja 2");
		lisaaSarja_.setBounds(10, 190, 318, 41);
		contentPane.add(lisaaSarja_);
		
		lisaaSarja lisaaSarja__2 = new lisaaSarja();
		lisaaSarja__2.setCaption("Sarja 3");
		lisaaSarja__2.setBounds(11, 245, 318, 41);
		contentPane.add(lisaaSarja__2);
		
		lisaaSarja lisaaSarja__3 = new lisaaSarja();
		lisaaSarja__3.setCaption("Sarja 4");
		lisaaSarja__3.setBounds(10, 299, 318, 41);
		contentPane.add(lisaaSarja__3);
		
		lisaaSarja lisaaSarja__4 = new lisaaSarja();
		lisaaSarja__4.setCaption("Sarja 5");
		lisaaSarja__4.setBounds(10, 351, 318, 41);
		contentPane.add(lisaaSarja__4);
		
		JButton btnTalleta = new JButton("Talleta");
		btnTalleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tikkataulu.talletaKisanTulokset();
			}
		});
		btnTalleta.setBounds(213, 403, 89, 23);
		contentPane.add(btnTalleta);
		
		JButton btnPeruuta = new JButton("Peruuta");
		btnPeruuta.setBounds(49, 403, 89, 23);
		contentPane.add(btnPeruuta);
		
		JLabel lblSijoitus = new JLabel("Sijoitus");
		lblSijoitus.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblSijoitus.setBounds(30, 93, 55, 20);
		contentPane.add(lblSijoitus);
		
		textField_2 = new JTextField();
		textField_2.setBounds(105, 94, 25, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"KerhonKes\u00E4Kisa2008", "SM2008"}));
		comboBox.setBounds(105, 60, 223, 20);
		contentPane.add(comboBox);
		
		JButton btnLisUusiKilpailu = new JButton("Lis\u00E4\u00E4 uusi kilpailu");
		btnLisUusiKilpailu.setBounds(170, 93, 158, 23);
		contentPane.add(btnLisUusiKilpailu);
	}
}
