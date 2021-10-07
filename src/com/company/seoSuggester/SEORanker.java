package com.company.seoSuggester;

import com.company.searchEngine.Models.DocumentIndex;
import com.company.seoSuggester.SEOAspect.SEOConfigProxy;
import com.company.utils.htmlParser.Document;
import com.company.utils.htmlParser.Element;
import com.company.utils.htmlParser.Elements;
import com.company.utils.htmlParser.HTMLParser;

public class SEORanker {

    public SEOConfigProxy seoConfigProxy;

    public int calculateDocumentRank(DocumentIndex index) {
        Document doc = HTMLParser.parse(index.getPlainDoc());
        Elements elements = HTMLParser.selectAll();
        int problemsImpact = seoConfigProxy.calculateSEOImpact(elements, seoConfigProxy);
        return seoConfigProxy.getFullSEOScore() - problemsImpact;
    }
}
