package com.company.seoSuggester;

import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.seoSuggester.SEOAspects.SEOAspect;
import com.company.seoSuggester.SEOSuggestions.SEOSuggestion;
import com.company.serverManager.ServerManager;
import com.company.utils.htmlParser.Document;
import com.company.utils.htmlParser.Elements;
import com.company.utils.htmlParser.HTMLParser;

import java.util.ArrayList;

public class SEOSuggester {
    /**
     *
     */

    ServerManager dataServerConnection;
    SEOAspect seoConfig;
    public ArrayList<SEOSuggestion> getSEOSuggestions(DocumentIndex index) {

        Document doc = HTMLParser.parse(index.getPlainDoc());
        Elements elements = doc.selectAll();

        return seoConfig.getSuggestions(elements);

    }
}
