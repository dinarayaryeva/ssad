package com.company.seoSuggester.SEOProblemCollection.MetaTagsUsage;

import com.company.utils.htmlParser.Elements.PageDescription;
import java.util.ArrayList;

public class PageDescriptionUsage extends MetaTagsUsage {
    public class TitleUsage extends MetaTagsUsage {
        public TitleUsage() {
            tags = new ArrayList<>();
            tags.add(new PageDescription());
        }
    }
}
