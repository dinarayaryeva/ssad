package com.company.seoSuggester;

import com.company.seoSuggester.SEOAspect.SEOAspect;
import org.w3c.dom.html.HTMLElement;

import javax.swing.text.html.HTML;
import java.util.ArrayList;
import java.util.Optional;

public class SEOProblem implements SEOImpactCalculatable {
    public static String name;
    public static String description;
    public ArrayList<SEOSuggestion> suggestions;
    public static ArrayList<HTML.Tag> tags;
    @Override
    public int calculateSEOImpact(HTMLElement[] elements, SEOAspect configAspect) {
        return 0;
    }
}
