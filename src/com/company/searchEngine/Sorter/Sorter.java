package com.company.searchEngine.Sorter;

import com.company.searchEngine.Lexicon.Lexicon;
import com.company.serverManager.ServerManager;

public abstract class Sorter {
    /**
     * Runs continuously. Obtains forward
     * indices from store server, prepares reverse indices -
     * lists of specific words / images and associated documents
     * which will be used by searcher,
     * stores them in server
     */
    ServerManager dataServerConnection;
    Lexicon lexicon;

    public abstract void makeInverterIndex();
    public abstract void updateInverterIndex();
}
