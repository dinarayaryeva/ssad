package com.company.searchEngine.Validator;

import com.company.httpMessages.SearchRequest.SearchRequest;
import com.company.searchEngine.Lexicon.LexiconManager;
import com.company.serverManager.ServerManager;

public abstract class Validator {
    /**
     * Checks for spelling mistakes and also if the
     * word used in query is unknown then gives suggestion
     * regarding related words. In simplified implementation
     * only first step is performed.
     */
    LexiconManager lexiconManager;
    ServerManager dataServerConnection;
    public abstract SearchRequest validate(SearchRequest request);
}
