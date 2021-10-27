package com.company.searchEngine.Sorter;

import com.company.searchEngine.Indexer.Indexer;
import com.company.searchEngine.Lexicon.Lexicon;
import com.company.searchEngine.Lexicon.LexiconManager;
import com.company.searchEngine.Models.Index.DocumentIndex;

import com.company.searchEngine.Models.Index.WordIndex;
import com.company.serverManager.ServerManager;

import java.util.ArrayList;

public abstract class Sorter {
    /**
     * Runs continuously. Obtains forward
     * indices from store server, prepares reverse indices -
     * lists of specific words / images and associated documents
     * which will be used by searcher,
     * stores them in server
     */
    ServerManager dataServerConnection;
    LexiconManager lexiconManager;

    public abstract void makeInverterIndex();
    public abstract void updateInverterIndex();
}
