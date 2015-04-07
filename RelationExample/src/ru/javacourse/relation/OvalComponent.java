package ru.javacourse.relation;

import javax.swing.JComponent;
import java.awt.*;

public class OvalComponent extends JComponent
{
    private int gap = 10;

    public int getGap() {
        return gap;
    }

    public void setGap(int gap) throws OvalSmallException, OvalBigException {
        if(gap > getWidth()/2 || gap > getHeight()/2) {
            OvalSmallException oe = new OvalSmallException("Слишком большой отступ");
            throw oe;
        }
        if(gap<=0) {
            OvalBigException oe = new OvalBigException("Слишком маленький отступ");
            throw oe;
        }
        this.gap = gap;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawOval(gap, gap, getWidth() - 2*gap, getHeight() - 2*gap);
    }
}
