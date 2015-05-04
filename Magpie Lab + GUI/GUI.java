import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Dimension;
/**
 * Write a description of class GUI here.
 * 
 * @Diana Chen
 * @5/8/15
 */
public class GUI
{
    // instance variables - replace the example below with your own
	private JPanel p;
	private JButton sendButt;
	private JButton restartButt;
	private JLabel userInputLabel;
	private JLabel chatOutputLabel;
    /**
     * Constructor for objects of class GUI
     */
    public GUI()
    {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Chatbox");
		p = new JPanel();
		sendButt = new JButton();
		sendButt.setText("Send");
		restartButt = new JButton();
		restartButt.setText("New Conversation");
		userInputLabel = new JLabel("You:");
		JTextField userInput = new JTextField(200);
		chatOutputLabel = new JLabel("Chatbot: ");
		JTextField chatOutput = new JTextField(200);
		ImageIcon chatPic = new ImageIcon(getClass().getResource(
		JLabel chatPic = new JLabel();
		p.add(sendButt);
		
		
        
    }
    
}
