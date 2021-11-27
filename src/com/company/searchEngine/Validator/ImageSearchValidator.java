package com.company.searchEngine.Validator;

import com.company.httpMessages.SearchRequest.SearchRequest;

public class ImageSearchValidator extends Validator {
    @Override
    protected boolean isValid(SearchRequest request) {
        //there should be some image validation algorithm
        return false;
    }

}
