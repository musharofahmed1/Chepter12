import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBox  extends JFrame{
    private final JTextField textField;
    private final JCheckBox boldJCheckBox; 
    private final JCheckBox italicJCheckBox;

    public CheckBox(){
        super("JCheckBox Test");
        setLayout(new FlowLayout());
    }
}
