package ru.javacourse.extend;

import java.awt.*;

public class RectComponent extends OvalComponent
{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
    }

}
