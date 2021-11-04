package com.company.seoSuggester.SEOProblems;

import com.company.seoSuggester.Component;
import com.company.utils.htmlParser.Elements.Element;
import com.company.utils.htmlParser.Elements.Title;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class TitleLengthProblem extends SEOProblem {


    @Override
    public Integer getSeoWeight() {
        return 10;
    }

    public TitleLengthProblem() {
        description = "Page has incorrect title length";
        tags = new ArrayList<>();
        tags.add(new Title());
    }

    @Override
    public Boolean problemIsPresent(ArrayList<Element> eles) {
        if (eles.stream()
                .filter(e -> (e).value.length()>20||(e).value.length()<3)
                .collect(Collectors.toCollection(ArrayList::new))
                .size()!=0) return Boolean.TRUE;
        return Boolean.FALSE;
    }

}
