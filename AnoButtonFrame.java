import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AnoButtonFrame extends JFrame {
    private final JButton plainJButton;
    private final JButton fancyJButton;

    public AnoButtonFrame() {
        super("Testing Buttons");
        setLayout(new FlowLayout());
        plainJButton = new JButton("Plain Button");
        add(plainJButton);

        Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif"));
        Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));
        fancyJButton = new JButton("Fancy Button", bug1);
        fancyJButton.setRolloverIcon(bug2);
        add(fancyJButton);

        //ButtonHandler handler = new ButtonHandler();
        //fancyJButton.addActionListener(handler);
       //plainJButton.addActionListener(handler);

        // Using anonymous inner class for ActionListener
        fancyJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(AnoButtonFrame.this,
                        String.format("You pressed: %s", event.getActionCommand()));
            }
        });

        // Using anonymous inner class for ActionListener
        plainJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(AnoButtonFrame.this,
                        String.format("You pressed: %s", event.getActionCommand()));
            }
        });
    }

    public static void main(String[] args) {
        AnoButtonFrame frame = new AnoButtonFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
