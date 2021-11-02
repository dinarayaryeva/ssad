package com.company.seoSuggester;

import com.company.searchEngine.Models.Index.DocumentIndex;
import com.company.seoSuggester.SEOProblemCollection.SEOProblemCollection;
import com.company.utils.htmlParser.Document;
import com.company.utils.htmlParser.Element;
import com.company.utils.htmlParser.HTMLParser;

import java.util.ArrayList;

public class SEORanker {
    /**
     * Calculates SEO rank of the document
     */

    public SEOProblemCollection seoConfig;

    public int calculateDocumentRank(DocumentIndex index) {

        /**
         * Parsing HTML document.
         */
        Document doc = HTMLParser.parse(index.getPlainDoc());
        ArrayList<Element> elements = doc.selectAll();

        int problemsImpact = seoConfig.calculateSEOImpact(elements);
        return seoConfig.getFullSEOScore() - problemsImpact;
    }
}
