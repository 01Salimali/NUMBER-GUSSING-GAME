package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class numberguess {
    private JButton guess;
    private JTextField message;
    private JTextField Mynumber;
    private JTextField computerno;
    private JPanel guesssinggame;
    private JLabel text;
    private JLabel correctno;

    public numberguess() {
        guess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    int myno = Integer.parseInt(Mynumber.getText());
                    int no2 = (int) (Math.random() * 20);
                    if (myno == no2) {
                        message.setText("you guessed correctly");
                    } else if (myno + 1 == no2 || myno - 1 == no2) {
                        message.setText("so close!");
                    } else {
                        message.setText("you lose!");
                    }
                    computerno.setText(Integer.toString(no2));

            }
        })
    ;}

    public static void main(String[] args) {

        JFrame frame = new JFrame("guessinggame");
        frame.setContentPane(new numberguess().guesssinggame);
        frame.setSize(450,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

