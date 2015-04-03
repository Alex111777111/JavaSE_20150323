package ru.javacourse.extend;

import javax.swing.JComponent;

public abstract class GapComponent extends JComponent
{
    private int gap;

    public GapComponent(int gap) {
        this.gap = gap;
    }

    public int getGap() {
        return gap;
    }

    public void setGap(int gap) {
        this.gap = gap;
    }
}
