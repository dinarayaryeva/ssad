package com.company.seoSuggester.SEOAspect;

import com.company.seoSuggester.SEOImpactCalculatable;
import com.company.seoSuggester.SEOProblem;
import org.w3c.dom.html.HTMLElement;

import javax.swing.text.html.HTML;
import java.util.ArrayList;
import java.util.Optional;

public class SEOAspect implements SEOImpactCalculatable {

    public static SEOConfigProxy seoConfigProxy;
    public static String name;
    public static ArrayList<HTML.Tag> tags;
    public ArrayList<SEOAspect> childAspects;
    public ArrayList<SEOProblem> seoProblems;

    public int calculateSEOImpact(HTMLElement[] elements, SEOAspect configAspect) {
        int currentAspectImpact = configAspect.seoProblems.stream().reduce(
                (x, y) -> {
                    x.calculateSEOImpact() + y.calculateSEOImpact();
                });
//        Optional<Integer> result = Stream.concat(.stream()
    }
}
