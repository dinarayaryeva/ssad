package com.company.searchEngine.Validator;

import com.company.httpMessages.SearchRequest.SearchRequest;

public class VoiceSearchValidator extends Validator {
    @Override
    protected boolean isValid(SearchRequest request) {
        //there should be some voice validation algorithm
        return false;
    }
}
