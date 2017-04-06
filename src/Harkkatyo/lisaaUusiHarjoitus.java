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
 * Ikkuna, joka avautuu käyttäjän lisätessä uutta harjoitusta
 * 
 * @author Lasse Wallden
 * @version 7.2.2012
 *
 */
public class lisaaUusiHarjoitus extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lisaaUusiHarjoitus frame = new lisaaUusiHarjoitus();
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
	public lisaaUusiHarjoitus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 156);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLisUusiHarjoitus = new JLabel("Lis\u00E4\u00E4 uusi harjoitus");
		lblLisUusiHarjoitus.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblLisUusiHarjoitus.setHorizontalAlignment(SwingConstants.CENTER);
		lblLisUusiHarjoitus.setBounds(0, 0, 284, 50);
		contentPane.add(lblLisUusiHarjoitus);
		
		EditPaneeli editPaneeli = new EditPaneeli();
		editPaneeli.setCaption("P\u00E4iv\u00E4m\u00E4\u00E4r\u00E4");
		editPaneeli.setBounds(10, 53, 264, 20);
		contentPane.add(editPaneeli);
		
		JButton btnTalleta = new JButton("Talleta");
		btnTalleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tikkataulu.luoUusiHarjoitus();
			}
		});
		btnTalleta.setBounds(185, 84, 89, 23);
		contentPane.add(btnTalleta);
		
		JButton btnPeruuta = new JButton("Peruuta");
		btnPeruuta.setBounds(10, 84, 89, 23);
		contentPane.add(btnPeruuta);
	}
}
