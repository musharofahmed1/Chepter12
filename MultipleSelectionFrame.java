// Fig. 12.25: MultipleSelectionFrame.java
// Fig. 12.26: MultipleSelectionTest.java

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame
{
    private final JList<String> colorJList;
    private final JList<String> copyJList;
    private JButton copyJButton;
    private static final String[] colorNames = {"Black", "Blue", "Cyan","Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange","Pink", "Red", "White", "Yellow"};
    
    public MultipleSelectionFrame()
    {
        super("Multiple Selection Lists");
        setLayout(new FlowLayout());
        
        colorJList = new JList<String>(colorNames);
        colorJList.setVisibleRowCount(5);

        colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(colorJList));

        copyJButton = new JButton("Copy >>>");
        
        //kam suru okan taki
        copyJButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                copyJList.setListData(colorJList.getSelectedValuesList().toArray(new String[0]));
            }
        }
      );
      add(copyJButton);

      copyJList = new JList<String>();
      copyJList.setVisibleRowCount(5);
      copyJList.setFixedCellWidth(100); // set width
      copyJList.setFixedCellHeight(15); // set height
      copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      add(new JScrollPane(copyJList));
    }

    public static void main(String[] args)
    {
        MultipleSelectionFrame multipleSelectionFrame = 
        new MultipleSelectionFrame();
        multipleSelectionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);multipleSelectionFrame.setSize(350, 150);multipleSelectionFrame.setVisible(true);
    }
}
