package com.company.searchEngine.Indexer;

import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.seoSuggester.SEORanker;
import com.company.serverManager.ServerManager;
import com.company.utils.PlainDocument;
import com.company.utils.htmlParser.Document;
import com.company.utils.htmlParser.HTMLParser;

public class Indexer {
    /**
     The indexer is continuously running program which has the
     functionality after the crawler. Its main task is to index the crawled webpages.
     The indexer requests pages from the store server, scans them and prepares
     forward indexes.These forward indexes are then stored in the store server and the
     links found in a particular URL are also stored in the URL server for crawling.
     It also updates lexicon if some words found in the document were new
     */
    ServerManager dataServerConnection;
    SEORanker seoRanker;
    HTMLParser htmlParser;

    public Indexer() {
        dataServerConnection = new ServerManager();
        seoRanker = new SEORanker();
        htmlParser = new HTMLParser();
    }

    public DocumentIndex makeDocumentIndex(PlainDocument plainDoc) {

        Document doc = htmlParser.parse(plainDoc);
        DocumentIndex index = new DocumentIndex(doc);

        int seoRank = seoRanker.calculateDocumentRank(index.getDocData());
        index.setSeoRank(seoRank);

        dataServerConnection.storeIndex(index);
        return index;


    }
//    public DocumentIndex updateDocumentIndex(DocumentIndex doc) {
//
//    }
}
