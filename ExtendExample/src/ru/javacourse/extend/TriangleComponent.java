package ru.javacourse.extend;

import java.awt.Graphics;

public class TriangleComponent extends GapComponent
{
    public TriangleComponent(int gap) {
        super(gap);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(getWidth() / 2, getGap(), getGap(), getHeight() - getGap());
        g.drawLine(getGap(), getHeight() - getGap(), getWidth() - getGap(), getHeight() - getGap());
        g.drawLine(getWidth() - getGap(), getHeight() - getGap(), getWidth() / 2, getGap());
    }

}
