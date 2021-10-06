package com.company.searchEngine.Validator;

import com.company.httpMessages.SearchRequest.ImageSearchRequest;
import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.ImageSearchResponse;

public class ImageSearchValidator extends Validator {
    @Override
    public SearchRequest validate(SearchRequest request) {
        return request;
    }
}
