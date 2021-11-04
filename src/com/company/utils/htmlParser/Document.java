package com.company.utils.htmlParser;

import com.company.utils.htmlParser.Elements.Element;
import com.company.utils.htmlParser.Elements.Title;

import java.util.ArrayList;

public class Document {

    private static Title emptyTitle = new Title("");
    public ArrayList<Element> elements;

    public Document(ArrayList<Element> elements) {
        this.elements = elements;
    }

    public ArrayList<Element> select(String slector) {
        return elements;
    }

    public ArrayList<Element> selectAll() {
        return elements;
    }

    public String getTitle() {
        return elements.stream()
                .filter(e -> e.getClass().equals(Title.class))
                .findFirst()
                .orElse(emptyTitle)
                .value;
    }
}
