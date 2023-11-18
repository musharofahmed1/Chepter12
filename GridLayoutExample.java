import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("GridLayout Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Create buttons for each cell in the grid
            JButton button1 = new JButton("Button 1");
            JButton button2 = new JButton("Button 2");
            JButton button3 = new JButton("Button 3");
            JButton button4 = new JButton("Button 4");
            JButton button5 = new JButton("Button 5");
            JButton button6 = new JButton("Button 6");

            // Create a panel with a 2x3 GridLayout
            JPanel panel = new JPanel(new GridLayout(2, 3));

            // Add buttons to the panel
            panel.add(button1);
            panel.add(button2);
            panel.add(button3);
            panel.add(button4);
            panel.add(button5);
            panel.add(button6);

            // Add the panel to the frame
            frame.add(panel);

            // Set the frame visible
            frame.setVisible(true);
        });
    }
}
