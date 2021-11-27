package com.company.searchEngine.Lexicon;

import com.company.searchEngine.Models.Index.WordIndex;
import com.company.serverManager.ServerManager;

import java.util.ArrayList;
import java.util.HashMap;

public class Lexicon {
    /**
     * List of words together
     * with their IDS. Used for searching.
     */
    private static HashMap<String, Integer> instance;
    private static ServerManager serverConnection;

    private Lexicon() {};

    public static HashMap<String, Integer> getInstance() {
        if (instance == null) {
            if (serverConnection == null) {
                serverConnection = new ServerManager();
            }
            instance = serverConnection.getLexicon();
        }
        return instance;
    }

    public static Integer getWordId(String word) {
        HashMap<String, Integer> lexiconInstance = getInstance();
        Integer wordId = -1;
        if (lexiconInstance.containsKey(word)) {
            wordId = lexiconInstance.get(word);
        }
        return wordId;
    }

    public void updateLexicon(ArrayList<WordIndex> lexicon) {
        if (serverConnection == null) {
            serverConnection = new ServerManager();
        }
        serverConnection.updateLexicon(lexicon);
    }
}
