package ru.javacourse.extend;

import java.awt.Graphics;

public class RectComponent extends GapComponent
{

    public RectComponent() {
        super(10);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(getGap(), getGap(), getWidth() - 2*getGap(), getHeight() - 2*getGap());
    }

}
