/*
 *  Dev Naganoolil 1001832926
 */
package colorguessinggame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Hard extends JFrame
{
    private final JLabel label1;
    private final JTextField textField1;
    private final JButton CancelButton;
    private final JButton OKButton;
    String CCName = "";
    
    public Hard(int num)
    {
        //creating the layout and labels for the hard version
        super("Welcome To My Guesing Game");
        setLayout(new FlowLayout());
        Random rn = new Random();
        label1 = new JLabel();
        textField1 = new JTextField("Type Your Answer Here", 20);
        OKButton = new JButton("OK");
        CancelButton = new JButton("Cancel");
        
        //switch which gets the colors for the game
            switch (num)
            {
                case 1:
                    CCName = "Red";
                    break;
                case 2:
                    CCName = "Orange";
                    break;
                case 3:
                    CCName = "Yellow";
                    break;
                case 4:
                    CCName = "Green";
                    break;
                case 5:
                    CCName = "Blue";
                    break;
                case 6:
                    CCName = "Purple";
                    break;
                case 7:
                    CCName = "Pink";
                    break;
                case 8:
                    CCName = "Silver";
                    break;
                case 9:
                    CCName = "Gold";
                    break;
                case 10:
                    CCName = "Beige";
                    break;
                case 11:
                    CCName = "Brown";
                    break;
                case 12:
                    CCName = "Gray";
                    break;
                case 13:
                    CCName = "Black";
                    break;
                case 14:
                    CCName = "White";
                    break;
            }
            //gets the correct image for the game
            Icon CC = new ImageIcon(getClass().getResource(CCName + ".png"));
            
            //sets the labels
            label1.setText("What Color Is This?");
            label1.setIcon(CC);
            label1.setHorizontalTextPosition(SwingConstants.CENTER);
            label1.setVerticalTextPosition(SwingConstants.BOTTOM);

            label1.setToolTipText("What Color Is This?");
            add(label1);

            //gets what the user inputs
            EventHandler handler = new EventHandler();
           
            textField1.selectAll();
            textField1.addActionListener(handler);
            add(textField1);

           
            OKButton.addActionListener(handler);
            add(OKButton);

            
            CancelButton.addActionListener(handler);
            add(CancelButton);
    }



    private class EventHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent event)
        {
            String s = "";
            
            //if the user typed the answer and pressed the "ok" button
            if ((event.getSource() == OKButton))
            {
                if (CCName.equalsIgnoreCase(textField1.getText()))
                {
                    s = "You Guessed Correctly";

                    JOptionPane.showMessageDialog(null, s);
                    setVisible(false);
                    
                    if(CCName.equalsIgnoreCase("White"))
                    {
                      JOptionPane.showMessageDialog(null,"Thank You For Playing");
                      System.exit(0);
                    }

                }
                else
                {
                    s = "That is incorrect. Please Try Again";
                    JOptionPane.showMessageDialog(null, s);
                }
            }
            //if the user just entered the answer on the text field
            else if ((event.getSource() == textField1))
            {
                if (CCName.equalsIgnoreCase(event.getActionCommand()))
                {
                    s = "You Guessed Correctly";


                    JOptionPane.showMessageDialog(null, s);
                    setVisible(false);
                    
                    if (CCName.equalsIgnoreCase("White"))
                    {
                        JOptionPane.showMessageDialog(null, "Thank You For Playing");
                        System.exit(0);
                    }
                }
                else
                {
                    s = String.format("%s", event.getActionCommand());
                    System.out.println(s);
                    s = "That is incorrect. Please Try Again";
                    JOptionPane.showMessageDialog(null, s);
                }
            }
            //if the user pressed the "cancel" button to stop playing the game
            else if (event.getSource() == CancelButton)
            {
                System.exit(0);
            }
        }

    }
}
