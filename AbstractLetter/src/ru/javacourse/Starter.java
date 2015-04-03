package ru.javacourse;

public class Starter
{
    public static void main(String[] args) {
        AbstractLetter al1 = new RespectLetter("Антон", "с рождением сына");
        AbstractLetter al11 = new RespectLetter("Антон", "с рождением сына");
        AbstractLetter al12 = new RespectLetter("Антон", "с рождением сына");
        AbstractLetter al13 = new RespectLetter("Антон", "с рождением сына");
        AbstractLetter al2 = new RespectLady("Елена", "с рождением сына");
        System.out.println(al1.createLetter());
        System.out.println(al2.createLetter());
    }
}
