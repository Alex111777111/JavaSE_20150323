package com.peter.password;

import ru.javacourse.password.PasswordGenerator;

public class PeterPasswordGenerator implements PasswordGenerator
{
    @Override
    public String generatePassword() {
        return "Peter password";
    }
}
