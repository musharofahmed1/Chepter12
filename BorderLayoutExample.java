import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("BorderLayout Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Create buttons for each region
            JButton northButton = new JButton("North");
            JButton southButton = new JButton("South");
            JButton eastButton = new JButton("East");
            JButton westButton = new JButton("West");
            JButton centerButton = new JButton("Center");

            // Create a panel with BorderLayout
            JPanel panel = new JPanel(new BorderLayout());

            // Add buttons to their respective regions
            panel.add(northButton, BorderLayout.NORTH);
            panel.add(southButton, BorderLayout.SOUTH);
            panel.add(eastButton, BorderLayout.EAST);
            panel.add(westButton, BorderLayout.WEST);
            panel.add(centerButton, BorderLayout.CENTER);

            // Add the panel to the frame
            frame.add(panel);

            // Set the frame visible
            frame.setVisible(true);
        });
    }
}

