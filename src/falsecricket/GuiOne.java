/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falsecricket;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Abuhanife
 */

//it is the secon window 
//here the user will choose the length of the match
public class GuiOne extends JFrame {

    JFrame dpage = new JFrame();

    JLabel l = new JLabel("Select Match Length");
    JLabel l2 = new JLabel();

    JButton b1 = new JButton("5 over ");
    JButton b2 = new JButton("10 over");
    JButton b3 = new JButton("15 over");

    public GuiOne() {

        setLayout(new GridBagLayout());

        setLocation(500, 100);
        setSize(350, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(Color.red);

        GridBagConstraints b = new GridBagConstraints();

        b.gridx = 10;
        b.gridy = 30;
        b.weighty = 20;
        add(l, b);

        b.weighty = 10;
        b.gridx = 10;
        b.gridy = 50;
        add(b1, b);

        b.gridx = 10;
        b.gridy = 55;
        add(b2, b);

        b.gridx = 10;
        b.gridy = 65;
        add(b3, b);

        b.gridx = 10;
        b.gridy = 85;
        add(l2, b);

        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame dpage = new JFrame();
                dpage.setSize(1200, 700);
                dpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dpage.setVisible(true);
                dpage.setLocation(70, 3);

                Random r = new Random();
                int target = r.nextInt(30);
                target = target + 30;
                System.out.println(target);

                dpage.add(new MyCircle(0, target, 5));
                dispose();
            }
        });
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame dpage = new JFrame();
                dpage.setSize(1200, 700);
                dpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dpage.setVisible(true);
                dpage.setLocation(70, 3);

                Random r = new Random();
                int target = r.nextInt(30);
                target = target + 45;

                dpage.add(new MyCircle(0, target, 10));
                dispose();
            }
        });
        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                dpage.setSize(1200, 700);
                dpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dpage.setVisible(true);
                dpage.setLocation(70, 3);

                Random r = new Random();
                int i = r.nextInt(30);
                int target = i + 60;

                dpage.add(new MyCircle(0, target, 15));
                dispose();
            }
        });

    }

    //That is the main method only for check
    public static void main(String[] args) {

        GuiOne o = new GuiOne();

    }
}
