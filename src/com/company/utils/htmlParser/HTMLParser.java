package com.company.utils.htmlParser;

import com.company.utils.PlainDocument;
import com.company.utils.htmlParser.Elements.Element;

import java.io.InputStream;
import java.util.ArrayList;

public class HTMLParser {

    public static Document parse(InputStream is) {
        return new Document(new ArrayList<Element>());
    }

    public static Document parse(String str) {
        return new Document(new ArrayList<Element>());
    }

    public static Document parse(PlainDocument doc) {
        return new Document(new ArrayList<Element>());
    }
}
