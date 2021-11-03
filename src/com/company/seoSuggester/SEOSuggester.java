package com.company.seoSuggester;

import com.company.seoSuggester.SEOProblemCollection.SEOProblemCollection;
import com.company.serverManager.ServerManager;
import com.company.utils.htmlParser.Document;
import com.company.utils.htmlParser.Elements.Element;

import java.util.ArrayList;

public class SEOSuggester {

    ServerManager serverConnection;
    SEOProblemCollection seoConfig;

    public SEOSuggester() {
        seoConfig = serverConnection.getSEOConfig();
    }

    public Component getSEOSuggestions(Document document) {

        ArrayList<Element> elements = document.selectAll();

        return seoConfig.getProblems(elements);

    }
}
