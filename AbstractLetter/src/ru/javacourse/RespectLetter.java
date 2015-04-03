package ru.javacourse;

public class RespectLetter extends AbstractLetter
{
    public RespectLetter(String name, String event) {
        super(name, event);
    }

    @Override
    public String prefix() {
        return "Уважаемый";
    }
}
