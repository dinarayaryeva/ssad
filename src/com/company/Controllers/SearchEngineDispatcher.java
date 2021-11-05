package com.company.Controllers;

import com.company.httpMessages.SearchRequest.ImageSearchRequest;
import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchRequest.StringSearchRequest;
import com.company.httpMessages.SearchRequest.VoiceSearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.ImageSearchEngine;
import com.company.searchEngine.StringSearchEngine;
import com.company.searchEngine.VoiceSearchEngine;

import java.util.ArrayList;

public class SearchEngineDispatcher {
    /**
     * Class responsible for reading search
     * requests and providing corresponding
     * search engine implementation worker to
     * handle them.
     * Web-server works in multithreading
     * environment and according to the assignment
     * Q&A document we are allowed to simplify that part,
     * so management
     * of search engine instances engines is omitted.
     * In complete implementation creation of search engine
     * worker can be combined with processing
     * it's first request according to resource
     * acquisition is initialization principle.
     * Later that worker can be reused to handle another requests.
     */
    public ArrayList<StringSearchEngine> stringSearchEngines;
    public ArrayList<VoiceSearchEngine> voiceSearchEngines;
    public ArrayList<ImageSearchEngine> imageSearchEngines;

    public SearchEngineDispatcher() {
        imageSearchEngines.add(createImagineSearchEngine());
        voiceSearchEngines.add(createVoiceSearchEngine());
        stringSearchEngines.add(createStringSearchEngine());
    }

    public StringSearchEngine createStringSearchEngine() {
        return new StringSearchEngine();
    }
    public VoiceSearchEngine createVoiceSearchEngine() {
        return new VoiceSearchEngine();
    }
    public ImageSearchEngine createImagineSearchEngine() {
        return new ImageSearchEngine();
    }

    public StringSearchEngine createStringSearchEngine(StringSearchRequest r) {
        return new StringSearchEngine(r);
    }
    public VoiceSearchEngine createVoiceSearchEngine(VoiceSearchRequest r) {
        return new VoiceSearchEngine(r);
    }
    public ImageSearchEngine createImagineSearchEngine(ImageSearchRequest r) {
        return new ImageSearchEngine(r);
    }

    public SearchResponse dispatchSearchRequest(SearchRequest request) {
        SearchResponse response = null;
        if (request instanceof ImageSearchRequest) {
            response = imageSearchEngines.get(0).processSearchRequest(request);
        }
        else if (request instanceof StringSearchRequest) {
            response = stringSearchEngines.get(0).processSearchRequest(request);
        }
        else if (request instanceof VoiceSearchRequest) {
            response = voiceSearchEngines.get(0).processSearchRequest(request);
        }
        return response;
    }
}
