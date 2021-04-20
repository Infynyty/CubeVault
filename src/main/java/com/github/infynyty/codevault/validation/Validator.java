package com.github.infynyty.codevault.validation;

public abstract class Validator {
    final String password;

    Validator(final String password) {
        this.password = password;
    }

    public abstract Validity validate();
}
