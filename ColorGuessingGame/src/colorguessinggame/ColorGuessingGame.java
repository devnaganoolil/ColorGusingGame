/*
 *  Dev Naganoolil 
 */
package colorguessinggame;

import javax.swing.JFrame;

public class ColorGuessingGame
{
    public static void main(String[] args)
    {
        //instantiate the input class and set the parameters for its JFrame
        Input i = new Input();
        i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        i.setSize(460,380);
        i.setVisible(true);
        i.setLocationRelativeTo(null);
        
        
    }
    
}
