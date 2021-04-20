package com.github.infynyty.codevault.password;

import com.github.infynyty.codevault.Hideable;
import com.github.infynyty.codevault.validation.LengthValidator;
import com.github.infynyty.codevault.validation.Validator;

public class Password implements PassItem, Hideable {
    private final String password;

    protected Password(final String password) {
        this.password = password;
    }

    @Override
    public int getLength() {
        return password.length();
    }

    @Override
    public boolean isAtLeastSufficient() {
        return Validator.isValid(new LengthValidator(password));
    }

    @Override
    public boolean isHidden() {
        return false;
    }

    @Override
    public void hide() {

    }

    @Override
    public void show() {

    }
}
