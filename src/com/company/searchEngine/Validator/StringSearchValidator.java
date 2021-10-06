package com.company.searchEngine.Validator;

import com.company.httpMessages.SearchRequest.SearchRequest;

public class StringSearchValidator extends Validator {
    @Override
    public SearchRequest validate(SearchRequest request) {
        return request;
    }
}
