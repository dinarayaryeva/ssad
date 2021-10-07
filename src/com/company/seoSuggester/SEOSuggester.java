package com.company.seoSuggester;

import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.seoSuggester.SEOAspects.SEOAspect;
import com.company.seoSuggester.SEOAspects.SEOConfigProxy;
import com.company.serverManager.ServerManager;
import com.company.utils.htmlParser.Document;
import com.company.utils.htmlParser.Elements;
import com.company.utils.htmlParser.HTMLParser;

public class SEOSuggester {
    ServerManager dataServerConnection;
    SEOConfigProxy seoConfigProxy;
    public SEOAspect getSEOSuggestions(DocumentIndex index) {

        Document doc = HTMLParser.parse(index.getPlainDoc());
        Elements elements = doc.selectAll();

        return seoConfigProxy.getSuggestions(elements);

    }
}
