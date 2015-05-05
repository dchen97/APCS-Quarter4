import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class GUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GUI extends JFrame
{
    // instance variables - replace the example below with your own
    private JLabel user;
    private JButton send;
    private JButton reset;
    private JTextField userTextField;
    /**
     * Constructor for objects of class GUI
     */
    public GUI()
    {
        JPanel talk = new JPanel(new GridLayout(5,1));
        userTextField = new JTextField(15);
        user = new JLabel();
        user.setText("Enter what you want to say:");
        user.setHorizontalAlignment(JLabel.CENTER);
        send = new JButton();
        send.setText("Send");
        send.setHorizontalAlignment(JLabel.CENTER);
        reset = new JButton();
        reset.setText("Reset");
        reset.setHorizontalAlignment(JLabel.CENTER);
        JPanel p = new JPanel(new FlowLayout());
        talk.add(user);
        talk.add(userTextField);
        
        JPanel manyButtons = new JPanel(new FlowLayout());
        manyButtons.add(send);
        manyButtons.add(reset);
        talk.add(manyButtons);
        //p.add(talk, BorderLayout.EAST);
       
        
        ImageIcon icon = new ImageIcon("magpie.jpg");
        JLabel pic = new JLabel(icon);
        pic.setPreferredSize(new Dimension(370,270));
        //p.add(pic, BorderLayout.CENTER);
        
        
        
        JPanel past = new JPanel(new BorderLayout());
        JTextArea history = new JTextArea(10,15);
        history.setPreferredSize(new Dimension(10,15));
        JScrollPane scrollPane = new JScrollPane(history); 
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(180,100));
        history.setEditable(false);
        history.setLineWrap(true);
        history.setWrapStyleWord(true);
        //past.add(history, BorderLayout.CENTER);
        past.add(scrollPane, BorderLayout.EAST);
        
        
       
        p.add(talk);
        p.add(past);
        p.add(pic,BorderLayout.WEST);
         
        setTitle("Magpie");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(p);
        pack();
        
        ChatBot c = new ChatBot();
        history.append(c.getGreeting() + "\n");
        
        send.addActionListener(new ActionListener()
        {
            public void actionPerformed (ActionEvent evt)
            {
                String F = c.getResponse(userTextField.getText());
                history.append("You:" + userTextField.getText()+ "\n");
                history.append("Magpie: " + F + "\n");
                userTextField.setText("");
            }
        }
        );
        reset.addActionListener(new ActionListener()
        {
            public void actionPerformed (ActionEvent evt)
            {
                history.setText("");
            }
        }
        );
    }
    
    public static void main(String [] args)
    {
        new GUI().setVisible(true);
    }
}