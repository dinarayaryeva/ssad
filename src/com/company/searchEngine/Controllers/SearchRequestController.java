package com.company.searchEngine.Controllers;

import com.company.httpMessages.SearchRequest.ImageSearchRequest;
import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchRequest.StringSearchRequest;
import com.company.httpMessages.SearchRequest.VoiceSearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.ImageSearchEngine;
import com.company.searchEngine.StringSearchEngine;
import com.company.searchEngine.VoiceSearchEngine;

public class SearchRequestController {
    public StringSearchEngine stringSearchEngine;
    public VoiceSearchEngine voiceSearchEngine;
    public ImageSearchEngine imageSearchEngine;
    public SearchRequestController() {
        this.imageSearchEngine = new ImageSearchEngine();
        this.voiceSearchEngine = new VoiceSearchEngine();
        this.stringSearchEngine = new StringSearchEngine();
    }
    public SearchResponse handleSearchRequest(SearchRequest request) {
        SearchResponse response = null;
        if (request instanceof ImageSearchRequest) {
            response = imageSearchEngine.processSearchRequest(request);
        }
        else if (request instanceof StringSearchRequest) {
            response = stringSearchEngine.processSearchRequest(request);
        }
        else if (request instanceof VoiceSearchRequest) {
            response = voiceSearchEngine.processSearchRequest(request);
        }
        return response;
    }
}
