/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falsecricket;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Abuhanife
 */

//It is the main window of this game it has three button and a label
//the label will show a masseg and this three button has action listeners
public class FalseCricket extends JFrame {

    /**
     * @param args the command line arguments
     */
    
    JLabel l = new JLabel("Welcome to False Clicket");
    JButton b1 = new JButton("Start game");
    JButton b3 = new JButton("About");
    JButton b2 = new JButton("Rules");

    public FalseCricket() {

        setLayout(new GridBagLayout());

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(500, 100);
        getContentPane().setBackground(Color.red);

        
        //Gridbagconstrains taken to positionate the button in the perfact place
        GridBagConstraints b = new GridBagConstraints();

        b.gridx = 10;
        b.gridy = 30;
        b.weightx = 5;
        b.weighty = 5;
        add(l, b);
        b.weightx = 2;
        b.weighty = 2;
        b.gridx = 10;
        b.gridy = 50;
        add(b1, b);

        b.gridx = 10;
        b.gridy = 60;
        add(b2, b);

        b.gridx = 10;
        b.gridy = 70;
        b.weighty = 20;
        add(b3, b);

        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                GuiOne g = new GuiOne();
            }
        });

        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame rulesFrame = new JFrame();

                rulesFrame.setSize(300, 300);
                //rulesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                rulesFrame.setVisible(true);
                rulesFrame.setLocation(500, 100);
                rulesFrame.setResizable(false);
                
                 FcRules rp=new FcRules();
                 rulesFrame.add(rp);

            }
        });

    }
    
   

    public static void main(String[] args) {
        // TODO code application logic here

        FalseCricket f = new FalseCricket();

    }

}
