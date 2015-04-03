package ru.javacourse.relation;

import javax.swing.*;

public class Starter
{
    public static void main(String[] args) {
        ManagerFrame mf = new ManagerFrame();
        mf.setVisible(true);

        JFrame frame = new JFrame();
        frame.setBounds(500, 200, 200, 200);
        frame.setVisible(true);

        mf.setFrame(frame);
    }
}
