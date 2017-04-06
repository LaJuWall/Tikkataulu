package Harkkatyo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class eiOsata extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eiOsata frame = new eiOsata();
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
	public eiOsata() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 288, 88);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblToimintoaEiOle = new JLabel("Toimintoa ei ole viel\u00E4 toteutettu");
		lblToimintoaEiOle.setHorizontalAlignment(SwingConstants.CENTER);
		lblToimintoaEiOle.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblToimintoaEiOle.setBounds(0, 0, 267, 51);
		contentPane.add(lblToimintoaEiOle);
	}

}
