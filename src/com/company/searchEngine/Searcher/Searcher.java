package com.company.searchEngine.Searcher;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Lexicon.LexiconManager;
import com.company.serverManager.ServerManager;

public abstract class Searcher {
    /**
     * Invoked when a client submits a query. Example of logic for query
     * consists of simple word: the string
     * searcher searches for the word id in the lexicon and then using
     * the word id searches for the list of document indexes using word
     * reverse index. URLs in the reverse
     * index stored in store server.
     */
    LexiconManager lexiconManager;
    ServerManager dataServerConnection;
    public abstract SearchResponse search(SearchRequest searchRequest);
}
