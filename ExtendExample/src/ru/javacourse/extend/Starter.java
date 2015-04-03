package ru.javacourse.extend;

import javax.swing.JFrame;

public class Starter
{
    public static void main(String[] args) {
        double r = Math.cos(Math.PI/2.0);

        MyFrame frame = new MyFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.initOvals();
        frame.setBounds(200, 200, 300, 300);
        frame.setVisible(true);
    }
}
