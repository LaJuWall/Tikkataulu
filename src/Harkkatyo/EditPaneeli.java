package Harkkatyo;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.SwingConstants;

public class EditPaneeli extends JPanel {
    private JTextField text;
    private JLabel lblNimi;

    /**
     * Create the panel.
     */
    public EditPaneeli() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        
        lblNimi = new JLabel("Nimi");
        lblNimi.setHorizontalAlignment(SwingConstants.CENTER);
        lblNimi.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblNimi.setPreferredSize(new Dimension(75, 14));
        lblNimi.setMinimumSize(new Dimension(75, 14));
        lblNimi.setMaximumSize(new Dimension(75, 14));
        add(lblNimi);
        
        text = new JTextField();
        add(text);
        text.setColumns(10);

    }

    public String getCaption() {
        return lblNimi.getText();
    }
    public void setCaption(String text_1) {
        lblNimi.setText(text_1);
    }
}
