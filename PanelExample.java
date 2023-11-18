import javax.swing.*;
import java.awt.*;

public class PanelExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Panel Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Create a panel
            JPanel panel = new JPanel();

            // Set the layout manager for the panel (optional)
            panel.setLayout(new FlowLayout());

            // Create components to add to the panel
            JLabel label = new JLabel("Hello, Panel!");
            JButton button = new JButton("Click Me!");

            // Add components to the panel
            panel.add(label);
            panel.add(button);

            // Add the panel to the frame
            frame.add(panel);

            // Set the frame visible
            frame.setVisible(true);
        });
    }
}

