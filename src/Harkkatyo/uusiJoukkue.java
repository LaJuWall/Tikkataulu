package Harkkatyo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Ikkuna, joka avautuu, kun käyttäjä aikoo luoda uuden joukkueen
 * 
 * @author Lasse Wallden
 * @version 7.2.2012
 *
 */
public class uusiJoukkue extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					uusiJoukkue frame = new uusiJoukkue();
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
	public uusiJoukkue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 267, 168);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		EditPaneeli editPaneeli = new EditPaneeli();
		editPaneeli.setBounds(10, 41, 232, 20);
		contentPane.add(editPaneeli);
		
		JLabel lblLuoUusiJoukkue = new JLabel("Luo uusi joukkue");
		lblLuoUusiJoukkue.setBounds(46, 11, 167, 20);
		contentPane.add(lblLuoUusiJoukkue);
		lblLuoUusiJoukkue.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblLuoUusiJoukkue.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton = new JButton("Tallenna");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tikkataulu.talletaUusiJoukkue();
			}
		});
		btnNewButton.setBounds(142, 84, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnPeruuta = new JButton("Peruuta");
		btnPeruuta.setBounds(23, 84, 89, 23);
		contentPane.add(btnPeruuta);
	}
}
