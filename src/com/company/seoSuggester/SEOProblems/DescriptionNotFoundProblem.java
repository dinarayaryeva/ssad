package com.company.seoSuggester.SEOProblems;

import com.company.seoSuggester.Component;
import com.company.utils.htmlParser.Elements.Element;
import com.company.utils.htmlParser.Elements.PageDescription;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class DescriptionNotFoundProblem extends SEOProblem {

    private static Integer seoWeight = 40;

    public DescriptionNotFoundProblem() {
        tags = new ArrayList<>();
        tags.add(new PageDescription());
    }

    @Override
    public Component getProblems(ArrayList<Element> eles) {

        if (eles.stream()
                .filter(e -> e.value.isEmpty())
                .collect(Collectors.toCollection(ArrayList::new)).size() != 0) return this;
        else return null;
    }

    @Override
    public Integer calculateSEOImpact(ArrayList<Element> eles) {

        printImpactPreCalcMsg();

        Integer impact = eles.size() - eles.stream()
                .filter(e -> e.value.isEmpty())
                .collect(Collectors.toCollection(ArrayList::new)).size();

        printImpactPostCalcMsg(impact);

        return impact;

    }
}
