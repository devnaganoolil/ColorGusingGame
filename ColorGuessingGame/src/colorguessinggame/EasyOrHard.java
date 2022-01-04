/*
 *  Dev Naganoolil 1001832926
 */
package colorguessinggame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EasyOrHard extends JFrame 
{
    final private JLabel label2;
    final private JButton EasyButton;
    final private JButton HardButton;
    ArrayList<Hard> Har = new ArrayList<>();
    public EasyOrHard()
    {
        super("Easy Or Hard");
        
        //create the label needed for the user input
        setLayout(new FlowLayout());
        label2 = new JLabel();
        label2.setText("What Mode Would You Like To Play In?");
        add(label2);
        
        //event hanlder to get the user's input
        EventHandler handler = new EventHandler();
        
        EasyButton = new JButton("Easy");
        EasyButton.addActionListener(handler);
        add(EasyButton);
        
        HardButton = new JButton("Hard");  
        HardButton.addActionListener(handler);
        add(HardButton);
   

    }
    private class EventHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent event)
        {
            //result if the user picked easy
            if ((event.getSource() == EasyButton))
            {
                setVisible(false);
                for(int i=1;i<15;i++)
                {
                    Easy E = new Easy(i);
                    E.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    E.setSize(500, 500);
                    E.setLocationRelativeTo(null);
                    E.setVisible(true);
                }
            }
            //result if the user picked hard
            else if (event.getSource() == HardButton)
            {
                 setVisible(false);
                 
                 for(int i=14;i>0;i--)
                 {
                     Hard H = new Hard(i);
                     H.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                     H.setSize(500, 500);
                     H.setLocationRelativeTo(null);
                     H.setVisible(true);
                 }

            }
        }
    }
}
