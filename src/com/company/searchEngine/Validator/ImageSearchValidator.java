package com.company.searchEngine.Validator;

import com.company.httpMessages.SearchRequest.ImageSearchRequest;
import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.ImageSearchResponse;
import com.company.httpMessages.SearchResponse.SearchResponse;

public class ImageSearchValidator extends Validator {
    @Override
    protected boolean isValid(SearchRequest request) {
        return false;
    }

    @Override
    public boolean handle(SearchRequest request, SearchResponse response) {
        return false;
    }
}
