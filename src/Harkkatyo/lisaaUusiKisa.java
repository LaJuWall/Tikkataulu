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
 * Ikkuna, joka avautuu käyttäjän lisätessä kilpailua
 * 
 * @author Lasse Wallden
 * @version 7.2.2012
 *
 */
public class lisaaUusiKisa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lisaaUusiKisa frame = new lisaaUusiKisa();
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
	public lisaaUusiKisa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 219);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLisUusiKilpailu = new JLabel("Lis\u00E4\u00E4 uusi kilpailu");
		lblLisUusiKilpailu.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblLisUusiKilpailu.setHorizontalAlignment(SwingConstants.CENTER);
		lblLisUusiKilpailu.setBounds(0, 0, 294, 41);
		contentPane.add(lblLisUusiKilpailu);
		
		EditPaneeli editPaneeli = new EditPaneeli();
		editPaneeli.setBounds(10, 52, 274, 20);
		contentPane.add(editPaneeli);
		
		EditPaneeli editPaneeli_1 = new EditPaneeli();
		editPaneeli_1.setCaption("P\u00E4iv\u00E4m\u00E4\u00E4r\u00E4");
		editPaneeli_1.setBounds(10, 114, 274, 20);
		contentPane.add(editPaneeli_1);
		
		JButton btnTalleta = new JButton("Talleta");
		btnTalleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tikkataulu.talletaKisa();
			}
		});
		btnTalleta.setBounds(197, 144, 89, 23);
		contentPane.add(btnTalleta);
		
		JButton btnPeruuta = new JButton("Peruuta");
		btnPeruuta.setBounds(10, 146, 89, 23);
		contentPane.add(btnPeruuta);
		
		EditPaneeli editPaneeli_2 = new EditPaneeli();
		editPaneeli_2.setCaption("Koodi");
		editPaneeli_2.setBounds(10, 83, 179, 20);
		contentPane.add(editPaneeli_2);
	}
}
