package ru.javacourse.extend;

import javax.swing.JFrame;
import java.awt.*;

public class MyFrame extends JFrame
{
    public void initOvals() {
        GridLayout gl = new GridLayout(2, 3);
        setLayout(gl);
        for(int i=0; i<6; i++){
            RectComponent oc = new RectComponent();
            oc.setGap(10);
            add(oc);
        }
    }
}
