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

/**
 * Ikkuna, joka avautuu käyttäjän antaessa virheellisen syötteen
 * 
 * @author Lasse Wallden
 * @version 7.2.2012
 *
 */
public class virhe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					virhe frame = new virhe();
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
	public virhe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 124);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVirheellinenSyte = new JLabel("Virheellinen sy\u00F6te!");
		lblVirheellinenSyte.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblVirheellinenSyte.setHorizontalAlignment(SwingConstants.CENTER);
		lblVirheellinenSyte.setBounds(2, 2, 336, 31);
		contentPane.add(lblVirheellinenSyte);
		
		JLabel lblTarkistaTiedot = new JLabel("Yhdest\u00E4 heitosta ei voi saada yli kymment\u00E4 pistett\u00E4!");
		lblTarkistaTiedot.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblTarkistaTiedot.setHorizontalAlignment(SwingConstants.CENTER);
		lblTarkistaTiedot.setBounds(1, 26, 337, 31);
		contentPane.add(lblTarkistaTiedot);
		
		JButton btnTakaisin = new JButton("Takaisin");
		btnTakaisin.setBounds(125, 58, 89, 23);
		contentPane.add(btnTakaisin);
	}

}
