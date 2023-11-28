import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class InnMultipleSelectionFrame extends JFrame {
    private final JList<String> colorJList;
    private final JList<String> copyJList;
    private JButton copyJButton;
    private static final String[] colorNames = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};

    public InnMultipleSelectionFrame() {
        super("Multiple Selection Lists");
        setLayout(new FlowLayout());

        colorJList = new JList<String>(colorNames);
        colorJList.setVisibleRowCount(5);

        colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(colorJList));

        copyJButton = new JButton("Copy >>>");

        // Using Inner class for ActionListener
        copyJButton.addActionListener(new CopyButtonHandler());
        add(copyJButton);

        copyJList = new JList<String>();
        copyJList.setVisibleRowCount(5);
        copyJList.setFixedCellWidth(100); // set width
        copyJList.setFixedCellHeight(15); // set height
        copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(copyJList));
    }

    // Inner class for ActionListener of Copy Button
    private class CopyButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            copyJList.setListData(colorJList.getSelectedValuesList().toArray(new String[0]));
        }
    }

    public static void main(String[] args) {
        InnMultipleSelectionFrame multipleSelectionFrame = new InnMultipleSelectionFrame();
        multipleSelectionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        multipleSelectionFrame.setSize(350, 150);
        multipleSelectionFrame.setVisible(true);
    }
}
