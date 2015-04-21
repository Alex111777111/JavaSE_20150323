package com.simon.password;

import ru.javacourse.password.PasswordGenerator;

public class SimonPasswordgenerator implements PasswordGenerator
{
    @Override
    public String generatePassword() {
        return "Simon password";
    }
}
