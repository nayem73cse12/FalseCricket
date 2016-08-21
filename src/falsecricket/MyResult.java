/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falsecricket;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Abuhanife
 */
//It is to show the result

public class MyResult extends JFrame {

    int result;

    
    JLabel l1 = new JLabel("Congratulation!  You win");
    JLabel l2 = new JLabel("You lose!");

    public MyResult(int i) {

        setLayout(new GridBagLayout());
        result = i;
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(500, 150);
        getContentPane().setBackground(Color.yellow);
        setFont(new Font("Serif", Font.BOLD, 250));

        if (i == 1) {
            add(l1);
        } else {
            add(l2);
        }

    }

    public static void main(String[] args) {
        MyResult r = new MyResult(0);
    }

}
