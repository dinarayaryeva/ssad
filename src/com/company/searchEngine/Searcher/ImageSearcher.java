package com.company.searchEngine.Searcher;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.ImageSearchResponse;
import com.company.httpMessages.SearchResponse.SearchResponse;

public class ImageSearcher extends Searcher {

    @Override
    public boolean handle(SearchRequest request, SearchResponse response) {
        return false;
    }
}
