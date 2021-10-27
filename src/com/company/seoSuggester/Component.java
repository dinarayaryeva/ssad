package com.company.seoSuggester;

import com.company.seoSuggester.SEOAspects.SEOAspect;
import com.company.seoSuggester.SEOSuggestions.SEOSuggestion;
import com.company.utils.htmlParser.Elements;

import java.util.ArrayList;

public abstract class Component {


    public abstract ArrayList<SEOSuggestion> getSuggestions(Elements eles);

    /**
     * @param eles html tags
     * @return impact on page SEO score
     */
    public static Integer calculateSEOImpact(Elements eles) {
        return null;
    }

    public ArrayList<SEOSuggestion> getSEOSuggestions() {
        return new ArrayList<SEOSuggestion>();
    }
}
