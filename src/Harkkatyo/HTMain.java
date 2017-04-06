package Harkkatyo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Ohjelman p‰‰ikkuna
 * 
 * @author Lasse Wallden
 * @version 7.2.2012
 *
 */
public class HTMain extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTable table_1;
    private JTable table;
    
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HTMain frame = new HTMain();
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
    public  HTMain() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 981, 509);
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.setToolTipText("Kilpailut");
        setJMenuBar(menuBar);
        
        JMenu mnTiedosto = new JMenu("Tiedosto");
        menuBar.add(mnTiedosto);
        
        JMenuItem mntmNewMenuItem_2 = new JMenuItem("Talleta");
        mntmNewMenuItem_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tikkataulu.talleta();
        	}
        });
        mnTiedosto.add(mntmNewMenuItem_2);
        
        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Avaa");
        mntmNewMenuItem_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tikkataulu.avaaJoukkue();
        	}
        });
        mnTiedosto.add(mntmNewMenuItem_1);
        
        JMenuItem mntmLopeta = new JMenuItem("Lopeta");
        mntmLopeta.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tikkataulu.lopeta();
        	}
        });
        mnTiedosto.add(mntmLopeta);
        
        JLabel label_1 = new JLabel(" ");
        label_1.setMaximumSize(new Dimension(10, 14));
        label_1.setMinimumSize(new Dimension(10, 14));
        label_1.setPreferredSize(new Dimension(10, 14));
        menuBar.add(label_1);
        
        JMenu mnJoukkue = new JMenu("Joukkue");
        menuBar.add(mnJoukkue);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Luo uusi Joukkue");
        mntmNewMenuItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tikkataulu.luoJoukkue();
        	}
        });
        mnJoukkue.add(mntmNewMenuItem);
        
        JMenuItem mntmNewMenuItem_3 = new JMenuItem("Poista Joukkue");
        mntmNewMenuItem_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tikkataulu.poistaJoukkue();
        	}
        });
        mnJoukkue.add(mntmNewMenuItem_3);
        
        JMenuItem mntmNewMenuItem_4 = new JMenuItem("Muokkaa Joukkuetta");
        mntmNewMenuItem_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tikkataulu.muokkaaJoukkuetta();
        	}
        });
        mnJoukkue.add(mntmNewMenuItem_4);
        
        JLabel label_5 = new JLabel(" ");
        label_5.setPreferredSize(new Dimension(10, 14));
        label_5.setMinimumSize(new Dimension(10, 14));
        label_5.setMaximumSize(new Dimension(10, 14));
        menuBar.add(label_5);
        
        JMenu mnNewMenu = new JMenu("J\u00E4senet");
        menuBar.add(mnNewMenu);
        
        JMenuItem mntmLisUusiJsen = new JMenuItem("Lis\u00E4\u00E4 uusi j\u00E4sen");
        mntmLisUusiJsen.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tikkataulu.luoJasen();
        	}
        });
        mnNewMenu.add(mntmLisUusiJsen);
        
        JMenuItem mntmPoistaJsen = new JMenuItem("Poista j\u00E4sen");
        mntmPoistaJsen.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tikkataulu.poistaJasen();
        	}
        });
        mnNewMenu.add(mntmPoistaJsen);
        
        JLabel label_2 = new JLabel(" ");
        label_2.setPreferredSize(new Dimension(10, 14));
        label_2.setMinimumSize(new Dimension(10, 14));
        label_2.setMaximumSize(new Dimension(10, 14));
        menuBar.add(label_2);
        
        JMenu mnNewMenu_1 = new JMenu("Kilpailut");
        menuBar.add(mnNewMenu_1);
        
        JMenuItem mntmLisUusiKilpailu = new JMenuItem("Lis\u00E4\u00E4 uusi kilpailu");
        mntmLisUusiKilpailu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tikkataulu.lisaaKilpailu();
        	}
        });
        mnNewMenu_1.add(mntmLisUusiKilpailu);
        
        JMenuItem mntmMuokkaaKilpailua = new JMenuItem("Muokkaa kilpailua");
        mntmMuokkaaKilpailua.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tikkataulu.muokkaaKisaa();
        	}
        });
        mnNewMenu_1.add(mntmMuokkaaKilpailua);
        
        JMenuItem mntmPoistaKilpailu = new JMenuItem("Poista kilpailu");
        mntmPoistaKilpailu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tikkataulu.poistaKisa();
        	}
        });
        mnNewMenu_1.add(mntmPoistaKilpailu);
        
        JMenuItem mntmLismuokkaaKilpailunTulosta = new JMenuItem("Lis\u00E4\u00E4/Muokkaa kilpailun tulosta");
        mntmLismuokkaaKilpailunTulosta.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tikkataulu.muokkaaKisanTuloksia();
        	}
        });
        mnNewMenu_1.add(mntmLismuokkaaKilpailunTulosta);
        
        JLabel label_3 = new JLabel(" ");
        label_3.setPreferredSize(new Dimension(10, 14));
        label_3.setMinimumSize(new Dimension(10, 14));
        label_3.setMaximumSize(new Dimension(10, 14));
        menuBar.add(label_3);
        
        JMenu mnNewMenu_2 = new JMenu("Harjoitukset");
        menuBar.add(mnNewMenu_2);
        
        JMenuItem mntmLisUusiHarjoitus = new JMenuItem("Lis\u00E4\u00E4 uusi harjoitus");
        mntmLisUusiHarjoitus.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tikkataulu.lisaaHarjoitus();
        	}
        });
        mnNewMenu_2.add(mntmLisUusiHarjoitus);
        
        JMenuItem mntmPoistaHarjoitus = new JMenuItem("Poista harjoitus");
        mntmPoistaHarjoitus.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tikkataulu.poistaHarjoitus();
        	}
        });
        mnNewMenu_2.add(mntmPoistaHarjoitus);
        
        JMenuItem mntmLisHarjoituksenTulokset = new JMenuItem("Lis\u00E4\u00E4/Muokkaa harjoituksen tuloksia");
        mntmLisHarjoituksenTulokset.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tikkataulu.muokkaaHarkkaa();
        	}
        });
        mnNewMenu_2.add(mntmLisHarjoituksenTulokset);
        
        JLabel label_4 = new JLabel(" ");
        label_4.setPreferredSize(new Dimension(10, 14));
        label_4.setMinimumSize(new Dimension(10, 14));
        label_4.setMaximumSize(new Dimension(10, 14));
        menuBar.add(label_4);
        
        JMenu mnTiedot = new JMenu("Tiedot");
        menuBar.add(mnTiedot);
        
        JMenuItem mntmOhjelmasta = new JMenuItem("Ohjelmasta");
        mntmOhjelmasta.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tikkataulu.infoIkkuna();
        	}
        });
        mnTiedot.add(mntmOhjelmasta);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));
        
        JPanel panelNappulat = new JPanel();
        contentPane.add(panelNappulat, BorderLayout.SOUTH);
        panelNappulat.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        JButton btnUusiJsen = new JButton("Uusi J\u00E4sen");
        btnUusiJsen.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	    tikkataulu.luoJasen();
        	}
        });
        panelNappulat.add(btnUusiJsen);
        
        JButton btnPoistaJsen = new JButton("Poista J\u00E4sen");
        btnPoistaJsen.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tikkataulu.poistaJasen();
        	}
        });
        panelNappulat.add(btnPoistaJsen);
        
        JButton btnTalletaTiedot = new JButton("Talleta tiedot");
        btnTalletaTiedot.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tikkataulu.talleta();
        	}
        });
        panelNappulat.add(btnTalletaTiedot);
        
        JLabel label = new JLabel(" ");
        label.setPreferredSize(new Dimension(190, 14));
        label.setMinimumSize(new Dimension(20, 14));
        label.setMaximumSize(new Dimension(20, 14));
        panelNappulat.add(label);
        
        JButton btnLisHarjoitus = new JButton("Muokkaa harjoituksen tuloksia");
        btnLisHarjoitus.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tikkataulu.muokkaaHarkkaa();
        	}
        });
        panelNappulat.add(btnLisHarjoitus);
        
        JButton btnPoistaHarjoitus = new JButton("Muokkaa kilpailun tuloksia");
        btnPoistaHarjoitus.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tikkataulu.muokkaaKisanTuloksia();
        	}
        });
        panelNappulat.add(btnPoistaHarjoitus);
        
        JSplitPane splitPaneJasenLista = new JSplitPane();
        contentPane.add(splitPaneJasenLista, BorderLayout.CENTER);
        
        JSplitPane splitPane_1JasenTiedot = new JSplitPane();
        splitPaneJasenLista.setRightComponent(splitPane_1JasenTiedot);
        
        JPanel panelTiedot = new JPanel();
        splitPane_1JasenTiedot.setLeftComponent(panelTiedot);
        panelTiedot.setLayout(new BorderLayout(0, 0));
        
        JSplitPane splitPane = new JSplitPane();
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        panelTiedot.add(splitPane, BorderLayout.CENTER);
        
        JPanel panel_3 = new JPanel();
        splitPane.setRightComponent(panel_3);
        panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
        
        JLabel lblNewLabel_2 = new JLabel("Kisojen tiedot");
        lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel_3.add(lblNewLabel_2);
        
        table_1 = new JTable();
        panel_3.add(table_1);
        table_1.setModel(new DefaultTableModel(
        	new Object[][] {
        		{"Kisa", "Tulos"},
        		{"SM2008", "10"},
        		{"KKK2008", "5"},
        		{null, null},
        		{null, null},
        	},
        	new String[] {
        		"Kisa", "Tulos"
        	}
        ));
        
        JPanel panel_4 = new JPanel();
        splitPane.setLeftComponent(panel_4);
        panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
        
        JLabel lblJsenenTiedot = new JLabel("J\u00E4senen tiedot");
        panel_4.add(lblJsenenTiedot);
        lblJsenenTiedot.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblJsenenTiedot.setHorizontalAlignment(SwingConstants.CENTER);
        
        EditPaneeli EditPaneeli = new EditPaneeli();
        panel_4.add(EditPaneeli);
        
        EditPaneeli EditPaneeli_1 = new EditPaneeli();
        panel_4.add(EditPaneeli_1);
        EditPaneeli_1.setCaption("L\u00E4hiosoite");
        
        EditPaneeli editPaneeli_2 = new EditPaneeli();
        editPaneeli_2.setCaption("Postinum");
        panel_4.add(editPaneeli_2);
        
        EditPaneeli editPaneeli_3 = new EditPaneeli();
        editPaneeli_3.setCaption("Postitoim");
        panel_4.add(editPaneeli_3);
        
        EditPaneeli EditPaneeli_2 = new EditPaneeli();
        panel_4.add(EditPaneeli_2);
        EditPaneeli_2.setCaption("Puhnum");
        
        EditPaneeli EditPaneeli_3 = new EditPaneeli();
        panel_4.add(EditPaneeli_3);
        EditPaneeli_3.setCaption("Liittynyt");
        
        EditPaneeli EditPaneeli_4 = new EditPaneeli();
        panel_4.add(EditPaneeli_4);
        EditPaneeli_4.setCaption("K\u00E4tisyys");
        
        EditPaneeli editPaneeli = new EditPaneeli();
        panel_4.add(editPaneeli);
        editPaneeli.setCaption("Heittoja");
        
        EditPaneeli editPaneeli_1 = new EditPaneeli();
        panel_4.add(editPaneeli_1);
        editPaneeli_1.setCaption("Keskiarvo");
        
        JPanel panel = new JPanel();
        splitPane_1JasenTiedot.setRightComponent(panel);
        panel.setLayout(new BorderLayout(0, 0));
        
        table = new JTable();
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        			{"P\u00E4iv\u00E4m\u00E4\u00E4r\u00E4", "Heitto tilanne", "Heittojen pisteet"},
            		{"14.6.2008", "SM2008", "5,4,7,8,9"},
            		{"14.6.2008", "SM2008", "5,7,8,9,6"},
            		{"14.6.2008", "SM2008", "8,7,8,7,9"},
            		{"14.6.2008", "SM2008", "7,9,8,10,8"},
            		{"14.6.2008", "SM2008", "9,7,6,8,9"},
            		{"10.6.2008", "Harjoitus", "8,4,7,5,9"},
            		{"10.6.2008", "Harjoitus", "10,9,8,10,7"},
            		{"10.6.2008", "Harjoitus", "9,8,10,7,8"},
            		{"10.6.2008", "Harjoitus", "5,4,9,7,8"},
            		{"15.5.2008", "KerhonKes\u00E4Kisa 2008", "7,5,6,8,9"},
            		{"15.5.2008", "KerhonKes\u00E4Kisa 2008", "10,5,8,7,9"},
            		{"15.5.2008", "KerhonKes\u00E4Kisa 2008", "9,8,7,6,8"},
            		{"15.5.2008", "KerhonKes\u00E4Kisa 2008", "5,8,6,5,8"},
            		{"2.5.2008", "Harjoitus", "8,7,5,9,4"},
            		{"2.5.2008", "Harjoitus", "9,8,5,7,4"},
            		{"2.5.2008", "Harjoitus", "10,5,7,4,7"},
            	},
            	new String[] {
            		"P\u00E4iv\u00E4m\u00E4\u00E4r\u00E4", "Heitto tilanne", "Heittojen pisteet" 
        	}
        ));
        panel.add(table);
        
        JLabel lblHeittojenTiedot = new JLabel("Heittojen tiedot");
        lblHeittojenTiedot.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblHeittojenTiedot, BorderLayout.NORTH);
        
        JPanel panelLista = new JPanel();
        splitPaneJasenLista.setLeftComponent(panelLista);
        panelLista.setLayout(new BorderLayout(0, 0));
        
        JPanel panelHaku = new JPanel();
        panelLista.add(panelHaku, BorderLayout.NORTH);
        panelHaku.setLayout(new BoxLayout(panelHaku, BoxLayout.Y_AXIS));
        
        JLabel lblHenkil = new JLabel("Hakuehto");
        lblHenkil.setHorizontalAlignment(SwingConstants.CENTER);
        lblHenkil.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelHaku.add(lblHenkil);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"nimi", "puhnum", "osoite"}));
        panelHaku.add(comboBox);
        
        textField = new JTextField();
        textField.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyReleased(KeyEvent e) {
        		tikkataulu.haeJasenia();
        	}
        });
        panelHaku.add(textField);
        textField.setColumns(10);
        
        JLabel lblJsenet = new JLabel("J\u00E4senet");
        lblJsenet.setHorizontalAlignment(SwingConstants.CENTER);
        lblJsenet.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelHaku.add(lblJsenet);
        
        JList list = new JList();
        list.addListSelectionListener(new ListSelectionListener() {
        	public void valueChanged(ListSelectionEvent arg0) {
        		tikkataulu.vaihdaJasen();
        	}
        });
        list.setModel(new AbstractListModel() {
            String[] values = new String[] {"Timo Tikka", "Jesse Tarkka", "Kimmo Kymppi", "Simo K\u00E4ki", "Heikki Huti"};
            public int getSize() {
                return values.length;
            }
            public Object getElementAt(int index) {
                return values[index];
            }
        });
        panelLista.add(list, BorderLayout.CENTER);
    }

}