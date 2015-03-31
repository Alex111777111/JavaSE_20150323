package ru.javacourse.extend;

import javax.swing.JComponent;
import java.awt.Graphics;

public class OvalComponent extends JComponent
{
    protected int gap = 0;

    public int getGap() {
        return gap;
    }

    public void setGap(int gap) {
        this.gap = gap;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
    }

}
