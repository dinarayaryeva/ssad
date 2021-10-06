package com.company.searchEngine.Validator;

import com.company.httpMessages.SearchRequest.SearchRequest;

public class VoiceSearchValidator extends Validator {
    @Override
    public SearchRequest validate(SearchRequest request) {
        return request;
    }
}
