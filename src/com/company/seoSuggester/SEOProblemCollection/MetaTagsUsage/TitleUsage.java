package com.company.seoSuggester.SEOProblemCollection.MetaTagsUsage;

import com.company.utils.htmlParser.Elements.PageDescription;
import com.company.utils.htmlParser.Elements.Title;

import java.util.ArrayList;

public class TitleUsage extends MetaTagsUsage {
    public TitleUsage() {
        tags = new ArrayList<>();
        tags.add(new Title());
    }
}
