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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Easy extends JFrame
{
    private final JLabel label1;
    private final JTextField textField1;
    private final JButton CancelButton;
    final JButton Button1;
    final JButton Button2;
    final JButton Button3;
    final JButton Button4;
    String b1;
    String b2;
    String b3;
    String b4;
    String a;
    public Easy(int num)
    {
        //creating the layout needed for the game
        super("Welcome To My Guesing Game");
        setLayout(new FlowLayout());
        label1 = new JLabel();
        textField1 = new JTextField("Type Your Answer Here", 20);
        CancelButton = new JButton("Cancel");
        JPanel p = new JPanel();
        JPanel l = new JPanel();
       
        //this switch creates all of the choices for the buttons
        switch (num)
        {
            case 1:
                b1 = "Red";
                b2 = "Black";
                b3 = "Blue";
                b4 = "Yellow";
                a = "Red";
                break;
            case 2:
                b1 = "Orange";
                b2 = "Red";
                b3 = "Green";
                b4 = "Black";
                a = "Orange";
                break;
            case 3:
                a = "Yellow";
                b1 = "White";
                b2 = "Blue";
                b3 = "Yellow";
                b4 = "Red";
                break;
            case 4:
                a = "Green";
                b1 = "Red";
                b2 = "Green";
                b3 = "Gray";
                b4 = "Gold";
                break;
            case 5:
                a = "Blue";
                b1 = "Silver";
                b2 = "Gold";
                b3 = "Blue";
                b4 = "Red";
                break;
            case 6:
                a = "Purple";
                b1 = "Purple";
                b2 = "Pink";
                b3 = "Gold";
                b4 = "Silver";
                break;
            case 7:
                a = "Pink";
                b1 = "Red";
                b2 = "Black";
                b3 = "Purple";
                b4 = "Pink";
                break;
            case 8:
                a = "Silver";
                b1 = "Blue";
                b2 = "Gold";
                b3 = "Silver";
                b4 = "Beige";
                break;
            case 9:
                a = "Gold";
                b1 = "Gold";
                b2 = "Red";
                b3 = "Siver";
                b4 = "Yellow";
                break;
            case 10:
                a = "Beige";
                b1 = "Blue";
                b2 = "Brown";
                b3 = "Black";
                b4 = "Beige";
                break;
            case 11:
                a = "Brown";
                b1 = "Gray";
                b2 = "Gold";
                b3 = "Brown";
                b4 = "Beige";
                break;
            case 12:
                a = "Gray";
                b1 = "Gray";
                b2 = "Gold";
                b3 = "Red";
                b4 = "Beige";
                break;
            case 13:
                a = "Black";
                b1 = "Blue";
                b2 = "Red";
                b3 = "Gray";
                b4 = "Black";
                break;
            case 14:
                a = "White";
                b1 = "Blue";
                b2 = "White";
                b3 = "Gold";
                b4 = "Silver";
                break;
        }
        //creates the image and sets the label
        Icon CC = new ImageIcon(getClass().getResource(a + ".png"));
        label1.setText("What Color Is This?");
        label1.setIcon(CC);
        label1.setHorizontalTextPosition(SwingConstants.CENTER);
        label1.setVerticalTextPosition(SwingConstants.BOTTOM);
        label1.setToolTipText("What Color Is This?");
        add(label1);
        
        //gives the button its names/choices
        Button1 = new JButton(b1);
        Button2 = new JButton(b2);
        Button3 = new JButton(b3);
        Button4 = new JButton(b4);
        
        //event handler to get the choices of the user
        EventHandler handler = new EventHandler();
        Button1.addActionListener(handler);
        Button2.addActionListener(handler);
        Button3.addActionListener(handler);
        Button4.addActionListener(handler);
        CancelButton.addActionListener(handler);
        add(Button1);
        add(Button2);
        add(Button3);
        add(Button4);
        add(CancelButton);
        p.add(Button1);
        p.add(Button2);
        p.add(Button3);
        p.add(Button4);
        l.add(CancelButton);
        add(p);
        add(l);
        p.setLocation(0,0);
        l.setLocation(1,2);
    }
    private class EventHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent event)
        {
            String s = "";
            
            //if the user picks the first button
            if ((event.getSource() == Button1))
            {
                if (a.equalsIgnoreCase(Button1.getActionCommand()))
                {
                    s = "You Guessed Correctly";

                    JOptionPane.showMessageDialog(null, s);
                    setVisible(false);
                    
                    if (a.equalsIgnoreCase("Red"))
                    {
                        JOptionPane.showMessageDialog(null, "Thank You For Playing");
                        System.exit(0);
                    }
                }
                else
                {
                    s = "That is incorrect. Please Try Again";
                    JOptionPane.showMessageDialog(null, s);
                }
            }
            //if the user picks the second button
            else if ((event.getSource() == Button2))
            {
                if (a.equalsIgnoreCase(Button2.getActionCommand()))
                {
                    s = "You Guessed Correctly";

                    JOptionPane.showMessageDialog(null, s);
                    setVisible(false);
                    
                    if (a.equalsIgnoreCase("Red"))
                    {
                        JOptionPane.showMessageDialog(null, "Thank You For Playing");
                        System.exit(0);
                    }
                }
                else
                {
                    s = "That is incorrect. Please Try Again";
                    JOptionPane.showMessageDialog(null, s);
                }
            }
            //if the user picks the third button
             else if ((event.getSource() == Button3))
            {
                if (a.equalsIgnoreCase(Button3.getActionCommand()))
                {
                    s = "You Guessed Correctly";

                    JOptionPane.showMessageDialog(null, s);
                    setVisible(false);
                    
                    if (a.equalsIgnoreCase("Red"))
                    {
                        JOptionPane.showMessageDialog(null, "Thank You For Playing");
                        System.exit(0);
                    }
                }
                else
                {
                    s = "That is incorrect. Please Try Again";
                    JOptionPane.showMessageDialog(null, s);
                }
             }
             //if the user picks the fourth button
             else if ((event.getSource() == Button4))
            {
                if (a.equalsIgnoreCase(Button4.getActionCommand()))
                {
                    s = "You Guessed Correctly";

                    JOptionPane.showMessageDialog(null, s);
                    setVisible(false);
                    
                    if (a.equalsIgnoreCase("Red"))
                    {
                        JOptionPane.showMessageDialog(null, "Thank You For Playing");
                        System.exit(0);
                    }
                }
                else
                {
                    s = "That is incorrect. Please Try Again";
                    JOptionPane.showMessageDialog(null, s);
                }
            }
             //if the user picks the "cancel" button;K
             else if (event.getSource() == CancelButton)
             {
                 System.exit(0);
             }
        }

    }
}
