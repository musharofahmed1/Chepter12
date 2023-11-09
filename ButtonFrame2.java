// Fig. 12.15: ButtonFrame.java
// Fig. 12.16: ButtonTest.java

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonTest extends JFrame
{
    private final JButton plainJButton;
    private final JButton fancyJButton;

    public ButtonTest()
    {
        super("Testing Buttons");
        setLayout(new FlowLayout());

        plainJButton = new JButton("Plain Button");
        add(plainJButton);

        Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif"));
        Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));
        fancyJButton = new JButton("Fancy Button", bug1);
        fancyJButton.setRolloverIcon(bug2);
        add(fancyJButton);

        ButtonHandler handler = new ButtonHandler();
        fancyJButton.addActionListener(handler);
        plainJButton.addActionListener(handler);
    }

    private class ButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            JOptionPane.showMessageDialog(ButtonTest.this, String.format(
                 "You pressed: %s",event.getActionCommand()));
        }
    }


    public static void main(String[] args)
    {
        ButtonFrame buttonFrame = new ButtonFrame();
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(275, 110);
        buttonFrame.setVisible(true);
    }
}