package com.company.searchEngine.Validator;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.searchEngine.Lexicon.LexiconManager;
import com.company.serverManager.ServerManager;

public abstract class Validator {
    LexiconManager lexiconManager;
    ServerManager dataServerConnection;
    public abstract SearchRequest validate(SearchRequest request);
}
