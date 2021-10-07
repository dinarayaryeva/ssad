package com.company.searchEngine;

import com.company.serverManager.ServerManager;
import com.company.utils.PlainDocument;

import java.util.ArrayList;
import java.util.Iterator;

public class Crawler {
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
