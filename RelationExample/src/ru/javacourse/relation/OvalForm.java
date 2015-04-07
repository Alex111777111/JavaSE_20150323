package ru.javacourse.relation;

import javax.swing.JFrame;

public class OvalForm extends JFrame
{
    private OvalComponent oval;

    public OvalForm() {
        oval = new OvalComponent();
        add(oval);

        setBounds(500, 200, 200, 200);
    }

    public OvalComponent getOval() {
        return oval;
    }
}
