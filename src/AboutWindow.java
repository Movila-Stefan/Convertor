

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.net.URI;
import java.util.ResourceBundle;

public class AboutWindow extends JFrame {
    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle("localization.translation"); //$NON-NLS-1$
    private JPanel contentPane;
    private static AboutWindow windowInstance = null;

    /**
     * Create the aboutWindow frame
     */
    private AboutWindow() {
        setTitle(BUNDLE.getString("AboutWindow.this.title")); //$NON-NLS-1$
        setBounds(100, 100, 347, 260);
        setLocationRelativeTo(null);
        setResizable( false );

        // Window components
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        // label "title"
        JLabel lblTitle = new JLabel("Currency Converter");
        lblTitle.setBounds(65, 12, 219, 33);
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setFont(new Font("Noto Sans", Font.BOLD, 15));
        contentPane.add(lblTitle);

    }

    // Check if the window is already created to launch only one instance of the window.
    public static AboutWindow getInstance() {
        if (windowInstance == null) {
            windowInstance = new AboutWindow();
        }
        return windowInstance;
    }
}