package Harkkatyo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Ikkuna, joka avautuu kun käyttäjä aikoo poistaa jäsenen
 * 
 * @author Lasse Wallden
 * @version 7.2.2012
 *
 */
public class poistaJasen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					poistaJasen frame = new poistaJasen();
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
	public poistaJasen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 290, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnKyll = new JButton("Kyll\u00E4");
		btnKyll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tikkataulu.deletoiJasen();
			}
		});
		btnKyll.setBounds(36, 62, 89, 23);
		contentPane.add(btnKyll);
		
		JButton btnEi = new JButton("Ei");
		btnEi.setBounds(159, 62, 89, 23);
		contentPane.add(btnEi);
		
		JLabel lblTahdotkoVarmastiPoitaa = new JLabel("Tahdotko varmasti poistaa t\u00E4m\u00E4n j\u00E4senen?");
		lblTahdotkoVarmastiPoitaa.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblTahdotkoVarmastiPoitaa.setBounds(10, 25, 274, 14);
		contentPane.add(lblTahdotkoVarmastiPoitaa);
	}
}
