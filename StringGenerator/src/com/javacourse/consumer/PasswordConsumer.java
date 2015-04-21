package com.javacourse.consumer;

import ru.javacourse.password.PasswordGenerator;

public class PasswordConsumer
{
    public static void main(String[] args) {
        PasswordGenerator pg = createPasswordGeneerator("com.chess.password.ChessPasswordGenerator");
        System.out.println(pg.generatePassword());
    }

    private static PasswordGenerator createPasswordGeneerator(String name) {
        try {
            Class clazz = Class.forName(name);
            return (PasswordGenerator)clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
