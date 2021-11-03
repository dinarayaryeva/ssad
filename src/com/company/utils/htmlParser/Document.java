package com.company.utils.htmlParser;

import com.company.utils.htmlParser.Elements.Element;

import java.util.ArrayList;

public class Document {

    ArrayList<Element> elements;

    public Document(ArrayList<Element> elements) {
        this.elements = elements;
    }

    public ArrayList<Element> select(String slector) {
        return elements;
    }

    public ArrayList<Element> selectAll() {
        return elements;
    }
}
