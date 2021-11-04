package com.company;

import com.company.seoSuggester.Component;
import com.company.seoSuggester.SEORanker;
import com.company.seoSuggester.SEOSuggester;
import com.company.utils.htmlParser.Document;
import com.company.utils.htmlParser.Elements.Element;
import com.company.utils.htmlParser.Elements.PageDescription;
import com.company.utils.htmlParser.Elements.Title;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        SEORanker seoRanker = new SEORanker();
        SEOSuggester seoSuggester = new SEOSuggester();

        //Creating document 1
        ArrayList<Element> elements = new ArrayList<>();
        elements.add(new Title("Title1"));
        elements.add(new PageDescription(""));

        Document document = new Document(elements);

        //Calculating SEO rank of document 1
        Integer docRank = seoRanker.calculateDocumentRank(document);

        //Retrieving suggestions of document 1
        Component problems = seoSuggester.getProblems(document);

        System.out.printf("Document rank: %d / %d\n", docRank, seoRanker.getMaxSEOScore());
    }
}
