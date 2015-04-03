package ru.javacourse.extend;

import javax.swing.JFrame;
import java.awt.*;

public class MyFrame extends JFrame
{
    public void initOvals() {
        GridLayout gl = new GridLayout(2, 3);
        setLayout(gl);

        for(int i=0; i<2; i++){
            Component rc = new RectComponent();
            add(rc);
            Component oc = new OvalComponent(40);
            add(oc);
            Component tc = new TriangleComponent(40);
            add(tc);
        }
    }
}
