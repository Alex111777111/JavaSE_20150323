package com.mti.password;

import ru.javacourse.password.PasswordGenerator;

public class MtiPasswordGenerator implements PasswordGenerator
{
    @Override
    public String generatePassword() {
        return "MTI password";
    }
}
