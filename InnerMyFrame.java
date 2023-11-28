import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerMyFrame extends JFrame {
    private JButton button1 = new JButton("button #1");
    private JButton button2 = new JButton("button #2");
    private JButton button3 = new JButton("button #3");

    InnerMyFrame() {
        button1.setBounds(100, 100, 100, 100);
        button2.setBounds(200, 100, 100, 100);
        button3.setBounds(300, 100, 100, 100);

        button1.addActionListener(new Button1Listener());
        button2.addActionListener(new Button2Listener());
        button3.addActionListener(new Button3Listener());

        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
    }

    // Inner class for ActionListener of button1
    private class Button1Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("You Pressed Button #1");
        }
    }

    // Inner class for ActionListener of button2
    private class Button2Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("You Pressed Button #2");
        }
    }

    // Inner class for ActionListener of button3
    private class Button3Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("You Pressed Button #3");
        }
    }

    public static void main(String[] args) {
        InnerMyFrame myFrame = new InnerMyFrame();
    }
}

