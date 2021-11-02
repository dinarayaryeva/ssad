package com.company.seoSuggester.SEOProblems;

import com.company.seoSuggester.Component;
import com.company.utils.htmlParser.Element;
import com.company.utils.htmlParser.PageDescription;
import com.company.utils.htmlParser.Title;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class DescriptionNotFoundProblem extends SEOProblem {


    @Override
    public Component getProblems(ArrayList<Element> eles) {
        if(eles.stream()
                .filter(e -> ((PageDescription) e).value.isEmpty())
                .collect(Collectors.toCollection(ArrayList::new)).size()!=0) return this;
        else return null;
    }

    @Override
    public Integer calculateSEOImpact(ArrayList<Element> eles) {
        return eles.size() - eles.stream()
                .filter(e -> ((PageDescription)e).value.isEmpty())
                .collect(Collectors.toCollection(ArrayList::new)).size();
    }
}
