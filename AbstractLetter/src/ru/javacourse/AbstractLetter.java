package ru.javacourse;

public abstract class AbstractLetter
{
    private String name;
    private String event;

    public AbstractLetter(String name, String event) {
        this.event = event;
        this.name = name;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String prefix();

    public String createLetter() {
        return prefix() + " " + name + "," + " Поздравляю " + event;
    }
}
