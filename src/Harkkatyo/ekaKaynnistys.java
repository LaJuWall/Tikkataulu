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
 * Ikkuna, joka avautuu, jos ohjelma ei löydä käytettävää dataa
 * 
 * @author Lasse Wallden
 * @version 7.2.2012
 *
 */
public class ekaKaynnistys extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ekaKaynnistys frame = new ekaKaynnistys();
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
	public ekaKaynnistys() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 152);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEiLytynytJoukkueita = new JLabel("Ei l\u00F6ytynyt joukkueita!");
		lblEiLytynytJoukkueita.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblEiLytynytJoukkueita.setHorizontalAlignment(SwingConstants.CENTER);
		lblEiLytynytJoukkueita.setBounds(92, 0, 257, 44);
		contentPane.add(lblEiLytynytJoukkueita);
		
		JLabel lblPainajatkaLuodaksesi = new JLabel("Paina \"Jatka\" luodaksesi uuden joukkueen");
		lblPainajatkaLuodaksesi.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblPainajatkaLuodaksesi.setHorizontalAlignment(SwingConstants.CENTER);
		lblPainajatkaLuodaksesi.setBounds(0, 35, 434, 44);
		contentPane.add(lblPainajatkaLuodaksesi);
		
		JButton btnJatka = new JButton("Jatka");
		btnJatka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tikkataulu.avaaMain();
				tikkataulu.luoJoukkue();
			}
		});
		btnJatka.setBounds(170, 85, 89, 23);
		contentPane.add(btnJatka);
	}

}
