package com.company.searchEngine.Validator;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Handler;
import com.company.searchEngine.Lexicon.LexiconManager;
import com.company.serverManager.ServerManager;

public abstract class Validator extends Handler {
    /**
     * Checks for spelling mistakes and also if the
     * word used in query is unknown then gives suggestion
     * regarding related words. In simplified implementation
     * only first step is performed.
     */
    LexiconManager lexiconManager;
    ServerManager dataServerConnection;

    protected abstract boolean isValid(SearchRequest request);
    public abstract boolean handle(SearchRequest request, SearchResponse response);


}
