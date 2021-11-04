package com.company.seoSuggester.SEOProblems;

import com.company.seoSuggester.Component;
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
