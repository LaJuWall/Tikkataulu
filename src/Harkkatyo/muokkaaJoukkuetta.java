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

public class muokkaaJoukkuetta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					muokkaaJoukkuetta frame = new muokkaaJoukkuetta();
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
	public muokkaaJoukkuetta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 336, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Muokkaa joukkuetta");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 327, 45);
		contentPane.add(lblNewLabel);
		
		EditPaneeli editPaneeli = new EditPaneeli();
		editPaneeli.setBounds(39, 42, 237, 20);
		contentPane.add(editPaneeli);
		
		JButton btnTalleta = new JButton("Talleta");
		btnTalleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tikkataulu.vaihdaJoukkeenNimi();
			}
		});
		btnTalleta.setBounds(187, 83, 89, 23);
		contentPane.add(btnTalleta);
		
		JButton btnPeruuta = new JButton("Peruuta");
		btnPeruuta.setBounds(39, 83, 89, 23);
		contentPane.add(btnPeruuta);
	}
}
