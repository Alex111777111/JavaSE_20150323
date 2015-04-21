package com.chess.password;

import ru.javacourse.password.PasswordGenerator;

public class ChessPasswordGenerator implements PasswordGenerator
{
    @Override
    public String generatePassword() {
        return "Chess password";
    }
}
