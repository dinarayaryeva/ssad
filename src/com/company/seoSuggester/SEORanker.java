package com.company.seoSuggester;

import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.seoSuggester.SEOAspects.SEOConfigProxy;
import com.company.utils.htmlParser.Document;
import com.company.utils.htmlParser.Elements;
import com.company.utils.htmlParser.HTMLParser;

public class SEORanker {

    public SEOConfigProxy seoConfigProxy;

    public int calculateDocumentRank(DocumentIndex index) {
        Document doc = HTMLParser.parse(index.getPlainDoc());
        Elements elements = doc.selectAll();
        int problemsImpact = seoConfigProxy.calculateSEOImpact(elements, null);
        return seoConfigProxy.getFullSEOScore() - problemsImpact;
    }
}
