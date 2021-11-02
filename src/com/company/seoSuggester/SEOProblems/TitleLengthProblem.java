package com.company.seoSuggester.SEOProblems;

import com.company.seoSuggester.Component;
import com.company.utils.htmlParser.Element;
import com.company.utils.htmlParser.Title;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class TitleLengthProblem extends SEOProblem {

    public TitleLengthProblem() {
        tags = new ArrayList<Element>();
        tags.add(new Title());
    }

    @Override
    public Component getProblems(ArrayList<Element> eles) {
        if(eles.stream()
                .filter(e -> ((Title)e).value.length()>20||((Title)e).value.length()<3)
                .collect(Collectors.toCollection(ArrayList::new)).size()!=0) return this;
        return null;
    }

    @Override
    public Integer calculateSEOImpact(ArrayList<Element> eles) {
        return eles.size() - eles.stream()
                .filter(e -> ((Title)e).value.length()>20||((Title)e).value.length()<3)
                .collect(Collectors.toCollection(ArrayList::new)).size();
    }
}
