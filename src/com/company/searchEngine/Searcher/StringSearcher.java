package com.company.searchEngine.Searcher;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.ImageSearchResponse;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.httpMessages.SearchResponse.StringSearchResponse;

public class StringSearcher extends Searcher {
    @Override
    public SearchResponse search(SearchRequest searchRequest) {
        return new StringSearchResponse();
    }
}
