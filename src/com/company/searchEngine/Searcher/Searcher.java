package com.company.searchEngine.Searcher;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.httpMessages.SearchResponse.SearchResponse;
import com.company.searchEngine.Handler;
import com.company.searchEngine.Lexicon.LexiconManager;
import com.company.serverManager.ServerManager;

public abstract class Searcher extends Handler {
    /**
     * Invoked when a client submits a query. Example of logic for query
     * consists of simple word: the string
     * searcher searches for the word id in the lexicon and then using
     * the word id searches for the list of pages using word
     * reverse index. Real implementations for more complex queries
     * contain more steps such as natural language processing,
     * cache checking, relevance checking and etc.
     */
    LexiconManager lexiconManager;
    ServerManager dataServerConnection;
    public abstract boolean handle(SearchRequest request, SearchResponse response);

}
