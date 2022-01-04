/*
 *  Dev Naganoolil 1001832926
 */
package colorguessinggame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Input extends JFrame
{
    //create the variables needed for the deciding input
    private final JLabel label1;
    private JLabel label2;
    private final JButton YesButton;
    private final JButton NoButton;
    private JButton EasyButton;
    private JButton HardButton;
    
    public Input()
    {
        //send the title to the super class
        super("Welcome To My Color Guesing Game");
        
        //create the layout
        label1 = new JLabel();
        setLayout(new FlowLayout());
        
        //create the Icon for the first input frame
        Icon CC = new ImageIcon(getClass().getResource("GuessTheColor.png"));
        
        //add the parameters needed for the icon frame
        label1.setText("Would You Like To Play The Color Guessing Game?");
        label1.setIcon(CC);
        label1.setHorizontalTextPosition(SwingConstants.CENTER);
        label1.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(label1);
        
        //create a event handler for the buttons that the user chooses from
        EventHandler handler = new EventHandler();
        YesButton = new JButton("Yes");
        YesButton.addActionListener(handler);
        add(YesButton); 
        
        NoButton = new JButton("No");
        NoButton.addActionListener(handler);
        add(NoButton); 
   
    }
    private class EventHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent event)
        {
            if((event.getSource()==YesButton))
            {
                //if the user chooses 'yes' then instantiate another class to to choose the diffculty
                setVisible(false);
                EasyOrHard EOR = new EasyOrHard();
                EOR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                EOR.setSize(300, 300);
                EOR.setLocationRelativeTo(null);
                EOR.setVisible(true);
            }

            else if(event.getSource()==NoButton)
                System.exit(0);
        }
    
    }
}
