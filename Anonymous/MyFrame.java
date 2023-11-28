import java.awt.event.*;
import javax.swing.*;
public class MyFrame extends JFrame{
    JButton button1 = new JButton("button #1");
    JButton button2 = new JButton("button #2");
    JButton button3 = new JButton("button #3");

    MyFrame(){
        button1.setBounds(100,100,100,100);
        button2.setBounds(200,100,100,100);
        button3.setBounds(300,100,100,100);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("You Pressed Button #1");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("You Pressed Button #2");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("You Pressed Button #3");
            }
        });
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}
