package com.github.infynyty.codevault.validation;

import java.util.Arrays;

public abstract class Validator {
    final String password;

    Validator(final String password) {
        this.password = password;
    }

    public abstract Validity validate();

    public static boolean isValid(Validator... validators) {
        return Arrays.stream(validators).anyMatch(validator -> validator.validate() == Validity.UNSAFE);
    }
}
