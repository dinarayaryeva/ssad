package com.company.seoSuggester.SEOProblemCollection.MetaTagsUsage;

import com.company.seoSuggester.SEOProblemCollection.SEOProblemCollection;
import com.company.utils.htmlParser.Elements.Element;
import com.company.utils.htmlParser.Elements.PageDescription;
import com.company.utils.htmlParser.Elements.Title;

import java.util.ArrayList;

public class MetaTagsUsage extends SEOProblemCollection {

    public MetaTagsUsage() {
        tags = new ArrayList<>();
        tags.add(new PageDescription());
        tags.add(new Title());
    }
}
