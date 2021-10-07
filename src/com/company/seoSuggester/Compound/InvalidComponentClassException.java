package com.company.seoSuggester.Compound;

public class InvalidComponentClassException extends CompoundException {

    public InvalidComponentClassException (String errorMessage, Throwable err) {
        super(errorMessage);
    }
}
