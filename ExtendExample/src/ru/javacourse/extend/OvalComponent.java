package ru.javacourse.extend;

import java.awt.Graphics;

public class OvalComponent extends GapComponent
{
    public static final int COUNTER = 0;

    public OvalComponent(int gap) {
        super(gap);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(getGap(), getGap(), getWidth() - 2*getGap(), getHeight() - 2*getGap());
    }

}
