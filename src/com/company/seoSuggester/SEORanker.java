package com.company.seoSuggester;

import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.seoSuggester.SEOAspects.SEOAspect;
import com.company.utils.htmlParser.Document;
import com.company.utils.htmlParser.Elements;
import com.company.utils.htmlParser.HTMLParser;

public class SEORanker {
    /**
     * Calculates SEO rank of the document
     */

    public SEOAspect seoConfig;

    public int calculateDocumentRank(DocumentIndex index) {
        Document doc = HTMLParser.parse(index.getPlainDoc());
        Elements elements = doc.selectAll();
        int problemsImpact = seoConfig.calculateSEOImpact(elements);
        return seoConfig.fullSEOScore - problemsImpact;
    }
}
