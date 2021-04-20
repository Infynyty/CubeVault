package com.github.infynyty.codevault.validation;


public interface Validatable {
    Validity isValid(Validator... validators);
}
