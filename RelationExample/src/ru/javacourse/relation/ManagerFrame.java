package ru.javacourse.relation;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerFrame extends JFrame implements ActionListener
{
    private static final String UP = "UP";
    private static final String UP_C = "UP_C";
    private static final String DN = "DN";
    private static final String DN_C = "DN_C";
    private static final int STEP = 10;

    private JFrame frame;

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public ManagerFrame() {
        SimpleClass sc = new SimpleClass();

        JButton up = new JButton(UP);
        up.setActionCommand(UP_C);
//        up.addActionListener(sc);
        up.addActionListener(this);
        add(up, BorderLayout.NORTH);

        JButton dn = new JButton("DOWN");
        dn.setActionCommand(DN_C);
//        dn.addActionListener(sc);
        dn.addActionListener(this);
        add(dn, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 200, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Rectangle r = frame.getBounds();
        if(UP_C.equals(e.getActionCommand())) {
            r.y -= STEP;
        }
        if (DN_C.equals(e.getActionCommand())) {
            r.y += STEP;
        }
        frame.setBounds(r);
    }
}


class SimpleClass implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button is pressed");
    }
}