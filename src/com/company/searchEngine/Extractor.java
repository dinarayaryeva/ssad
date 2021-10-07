package com.company.searchEngine;

import com.company.serverManager.ServerManager;

import java.io.InputStream;

public class Extractor {
    ServerManager serversConnection;
    public void loadUrlsToServer(InputStream is) {
        serversConnection.storeUrlsOnUrlServer(is);
    }
}
