package com.github.infynyty.codevault.validation;

public class LengthValidator extends Validator{
    private static final int MAX_LENGTH = 256;
    private static final int DEFAULT_MIN_SUFFICIENT_LENGTH = 8;
    private static final int DEFAULT_MIN_SAFE_LENGTH = 16;
    private static final int DEFAULT_MIN_VERY_SAFE_LENGTH = 24;

    protected LengthValidator(final String password) {
        super(password);
    }

    @Override
    public Validity validate() {
        final int length = password.length();
        if (length < DEFAULT_MIN_SUFFICIENT_LENGTH) return Validity.UNSAFE;
        if (length < DEFAULT_MIN_SAFE_LENGTH) return Validity.SUFFICIENT;
        if (length < DEFAULT_MIN_VERY_SAFE_LENGTH) return Validity.SAFE;
        else return Validity.VERY_SAFE;
    }
}
