package com.company.seoSuggester.SEOProblems;

import com.company.seoSuggester.Component;
import com.company.seoSuggester.SEOSuggestions.SEOSuggestion;
import com.company.utils.htmlParser.Elements.Element;
import com.company.utils.htmlParser.Elements.PageDescription;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class DescriptionNotFoundProblem extends SEOProblem {

    @Override
    public Integer getSeoWeight() {
        return 40;
    }

    public DescriptionNotFoundProblem() {
        description =
                "Page description was not found on the page.\n"                     +
                        "The meta description is an HTML attribute that provides\n" +
                        "a brief summary of a web page. Search engines \n"          +
                        "often display the meta description in search results,\n"   +
                        "which can influence click-through rates.";
        tags = new ArrayList<>();
        tags.add(new PageDescription());
    }

    @Override
    public Boolean problemIsPresent(ArrayList<Element> eles) {
        if (eles.stream()
                .filter(e -> e.value.isEmpty())
                .collect(Collectors.toCollection(ArrayList::new))
                .size() != 0) return Boolean.TRUE;
        return Boolean.FALSE;
    }

}
