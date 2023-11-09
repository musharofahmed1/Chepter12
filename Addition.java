import javax.swing.JOptionPane;
public class Addition {
    public static void main(String[] args) {
        String firstNumber = JOptionPane.showInputDialog("Enter First Integer: ");
        String secondNumber = JOptionPane.showInputDialog("Enter First Integer: ");

        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);

        int sum = num1 + num2;
        JOptionPane.showMessageDialog(null,"Sum is "+ sum, "Sum Of Two Integer",JOptionPane.PLAIN_MESSAGE);
    }
    
}