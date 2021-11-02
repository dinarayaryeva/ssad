package com.company;

import com.company.seoSuggester.SEORanker;
import com.company.utils.htmlParser.Document;
import com.company.utils.htmlParser.Element;
import com.company.utils.htmlParser.PageDescription;
import com.company.utils.htmlParser.Title;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SEORanker seoRanker = new SEORanker();

        ArrayList<Element> elements = new ArrayList<>();

        elements.add(new Title("Title1"));
        elements.add(new PageDescription("Description1"));

        Document document = new Document(elements);

        Integer docRank = seoRanker.calculateDocumentRank(document);

        System.out.printf("Document rank: %d / %d", docRank, seoRanker.getFullSEOScore());
    }
}
