package com.company.searchEngine.Validator;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;

public class VoiceSearchValidator extends Validator {
    @Override
    protected boolean isValid(SearchRequest request) {
        return false;
    }

    @Override
    public boolean handle(SearchRequest request, SearchResponse response) {
        return false;
    }
}
