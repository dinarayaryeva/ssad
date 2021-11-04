package com.company.seoSuggester.SEOProblems;

import com.company.seoSuggester.Component;
import com.company.utils.htmlParser.Elements.Element;
import com.company.utils.htmlParser.Elements.Title;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class TitleLengthProblem extends SEOProblem {

    private static Integer seoWeight = 10;

    public TitleLengthProblem() {
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

    @Override
    public Component getProblems(ArrayList<Element> eles) {
        return problemIsPresent(eles) ? this : null;
    }

    @Override
    public Integer calculateSEOImpact(ArrayList<Element> eles) {

        printImpactPreCalcMsg();

        Integer impact = problemIsPresent(eles) ? seoWeight : 0;

        printImpactPostCalcMsg(impact);

        return impact;
    }
}
