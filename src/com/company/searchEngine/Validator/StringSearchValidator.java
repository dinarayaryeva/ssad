package com.company.searchEngine.Validator;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;

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

    @Override
    public boolean handle(SearchRequest request, SearchResponse response) {

        if (!isValid(request)) {
            response.value = "Incorrect search request!";
            return false;
        }

        next.handle(request, response);
        return true;
    }
}
