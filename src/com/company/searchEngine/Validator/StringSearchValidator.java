package com.company.searchEngine.Validator;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;

public class StringSearchValidator extends Validator {
    @Override
    public boolean handle(SearchRequest request, SearchResponse response) {
        return false;
    }
}
