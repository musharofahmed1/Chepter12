import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Simple Calculator");

        // Create a JButton (button)
        JButton addButton = new JButton("Add");

        // Use an anonymous inner class for the ActionListener
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the button is clicked
                String firstNumber = JOptionPane.showInputDialog("Enter First Integer:");
                String secondNumber = JOptionPane.showInputDialog("Enter Second Integer:");

                try {
                    int num1 = Integer.parseInt(firstNumber);
                    int num2 = Integer.parseInt(secondNumber);

                    int sum = num1 + num2;
                    JOptionPane.showMessageDialog(null, "Sum is " + sum, "Result", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid integers.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add the button to the frame
        frame.add(addButton);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
