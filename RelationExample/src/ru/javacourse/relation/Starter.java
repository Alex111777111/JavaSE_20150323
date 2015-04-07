package ru.javacourse.relation;

import javax.swing.*;

public class Starter
{
    public static void main(String[] args) {
        ManagerFrame mf = new ManagerFrame();
        mf.setVisible(true);

        OvalForm frame = new OvalForm();
        frame.setVisible(true);

        mf.setOvalForm(frame);
    }
}
