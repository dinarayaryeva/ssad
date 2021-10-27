package com.company.searchEngine;

import com.company.serverManager.ServerManager;
import com.company.utils.PlainDocument;

import java.util.ArrayList;
import java.util.Iterator;

public class Crawler {
    /**
     * Running continuously, requests the URL server
     * to provide URL to be crawled and then depending
     * on access permissions requests webpages and loads
     * them to store server
     */
    ServerManager serversConnection;

    PlainDocument downloadDoc(String url) {
        return new PlainDocument();
    }

    void scanUrls() {
        ArrayList<String> fetchedUrls = serversConnection.fetchUrlsList();
        Iterator<String> iter = fetchedUrls.iterator();
        String currentUrl;
        while (iter.hasNext()) {
            currentUrl = iter.next();
            PlainDocument doc = downloadDoc(currentUrl);
            serversConnection.storePlainDocument(doc);
        }
    }

}
