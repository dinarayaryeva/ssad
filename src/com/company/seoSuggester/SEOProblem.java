package com.company.seoSuggester;

import com.company.seoSuggester.SEOAspect.SEOAspect;
import com.company.seoSuggester.SEOImpactCalculatable;
import com.company.seoSuggester.SEOSuggestion;
import com.company.utils.htmlParser.Element;
import com.company.utils.htmlParser.Elements;
import com.company.utils.htmlParser.Tag;
import java.util.ArrayList;
import java.util.Optional;

public abstract class SEOProblem implements SEOImpactCalculatable {
    public static String name;
    public static String description;
    public ArrayList<SEOSuggestion> suggestions;
    public static ArrayList<Tag> tags;


    public int calculateSEOImpact(Elements elements, SEOAspect configAspect) {
        return 0;
    };
}
