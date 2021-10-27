package com.company.searchEngine;

import com.company.serverManager.ServerManager;

import java.io.InputStream;

public class Extractor {
    /**
     * Running continuously. Extracts URLs
     * (registered by site developer or found
     * on other sites) and
     * stores them in URL server.
     */
    ServerManager serversConnection;
    public void loadUrlsToServer(InputStream is) {
        serversConnection.storeUrlsOnUrlServer(is);
    }
    public void loadUrlToServer(String url) {
        serversConnection.storeUrlsOnUrlServer(url);
    }
}
