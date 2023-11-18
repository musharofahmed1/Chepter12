import javax.swing.*;
import java.awt.*;

public class TextAreaExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("TextArea Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Create a JTextArea
            JTextArea textArea = new JTextArea();

            // Set some initial text (optional)
            textArea.setText("This is a JTextArea.");

            // Create a JScrollPane to wrap the JTextArea
            JScrollPane scrollPane = new JScrollPane(textArea);

            // Add the JScrollPane to the frame
            frame.add(scrollPane);

            // Set the frame visible
            frame.setVisible(true);
        });
    }
}
