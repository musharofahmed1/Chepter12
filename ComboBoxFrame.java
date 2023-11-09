// Fig. 12.21: ComboBoxFrame.java
// Fig. 12.22: ComboBoxTest.java

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ComboBoxFrame extends JFrame
{
    private final JComboBox<String> imagesJComboBox;
    private final JLabel label;

    private static final String[] names = {"bug1.gif", "bug2.gif", "bug3.gif", "bug4.gif"};
    private final Icon[] icons = {
        new ImageIcon(getClass().getResource(names[0])),
        new ImageIcon(getClass().getResource(names[1])),
        new ImageIcon(getClass().getResource(names[2])),
        new ImageIcon(getClass().getResource(names[3]))};
        
   
    public ComboBoxFrame()
    {
        super("Testing JComboBox");
        setLayout(new FlowLayout());

        imagesJComboBox = new JComboBox<String>(names);
        imagesJComboBox.setMaximumRowCount(4);
        imagesJComboBox.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent event)
            {
                if (event.getStateChange() == ItemEvent.SELECTED)
                label.setIcon(icons [imagesJComboBox.getSelectedIndex()]);
            }
        }
    );
    add(imagesJComboBox);
    label = new JLabel(icons[0]);
    add(label);
    }

    public static void main(String[] args)
    {
        ComboBoxFrame comboBoxFrame = new ComboBoxFrame();
        comboBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        comboBoxFrame.setSize(350, 150);
        comboBoxFrame.setVisible(true);
    }
}