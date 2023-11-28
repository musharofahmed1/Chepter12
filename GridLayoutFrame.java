import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GridLayoutFrame extends JFrame {

    public GridLayoutFrame() {
        super("GridLayout Example");
        setLayout(new GridLayout(3, 3, 5, 5)); // 3 rows, 3 columns, 5-pixel horizontal and vertical gaps

        // Create and add buttons to the frame
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton("Button " + i);
            add(button);
        }
    }

    public static void main(String[] args) {
        GridLayoutFrame gridLayoutFrame = new GridLayoutFrame();
        gridLayoutFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gridLayoutFrame.setSize(300, 300);
        gridLayoutFrame.setVisible(true);
    }
}

