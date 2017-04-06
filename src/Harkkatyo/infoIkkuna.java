package Harkkatyo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 * Ikkuna, jossa näkyy ohjelman perustiedot
 * 
 * @author Lasse Wallden
 * @version 7.2.2012
 *
 */
public class infoIkkuna extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					infoIkkuna frame = new infoIkkuna();
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
	public infoIkkuna() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 219);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 414, 161);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTikkataulu = new JLabel("TIKKATAULU");
		lblTikkataulu.setHorizontalAlignment(SwingConstants.CENTER);
		lblTikkataulu.setFont(new Font("Arial Black", Font.PLAIN, 27));
		lblTikkataulu.setEnabled(true);
		lblTikkataulu.setBounds(40, 17, 328, 47);
		panel.add(lblTikkataulu);
		
		JLabel lblV = new JLabel("v. 31.01.2012");
		lblV.setHorizontalAlignment(SwingConstants.CENTER);
		lblV.setBounds(156, 61, 93, 22);
		panel.add(lblV);
		
		JLabel lblTekijLasseWallden = new JLabel("Tekij\u00E4: Lasse Wallden");
		lblTekijLasseWallden.setHorizontalAlignment(SwingConstants.CENTER);
		lblTekijLasseWallden.setBounds(143, 82, 128, 22);
		panel.add(lblTekijLasseWallden);
		
		JButton btnTakaisin = new JButton("Takaisin");
		btnTakaisin.setBounds(160, 115, 89, 23);
		panel.add(btnTakaisin);
	}
}
