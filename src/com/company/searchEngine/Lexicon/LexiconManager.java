package com.company.searchEngine.Lexicon;

import com.company.serverManager.ServerManager;

public class LexiconManager {
    /**
     * Proxy responsible for
     * managing access to lexicon
     */

    private ServerManager serverConnection;
    private Lexicon lexicon;

    public LexiconManager() {
        lexicon = serverConnection.getLexicon();
    }

    public Lexicon getLexicon() {
        return lexicon;
    }

    public void updateLexicon(Lexicon lexicon) {
        serverConnection.updateLexicon();
    }
}
