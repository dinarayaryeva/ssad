package com.company.searchEngine.Validator;

import com.company.httpMessages.SearchRequest.SearchRequest;

public class StringSearchValidator extends Validator {

    @Override
    protected boolean isValid(SearchRequest request) {
        return lengthIsValid(request.value);
    }

    private boolean lengthIsValid(String searchString) {

        if (searchString == null) {
            return false;
        }

        int length = searchString.length();
        return length > 0 && length < 30;
    }

}
