package com.company.seoSuggester.SEOProblemCollection.MetaTagsUsage;

import com.company.seoSuggester.SEOProblemCollection.SEOProblemCollection;
import com.company.utils.htmlParser.Element;
import com.company.utils.htmlParser.PageDescription;
import com.company.utils.htmlParser.Tag;
import com.company.utils.htmlParser.Title;

import java.util.ArrayList;

public class MetaTagsUsage extends SEOProblemCollection {

    public MetaTagsUsage() {
        tags = new ArrayList<Element>();
        tags.add(new PageDescription());
        tags.add(new Title());
    }
}
