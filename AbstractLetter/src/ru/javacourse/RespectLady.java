package ru.javacourse;

public class RespectLady extends AbstractLetter
{
    public RespectLady(String name, String event) {
        super(name, event);
    }

    @Override
    public String prefix() {
        return "Уважаемая";
    }
}
