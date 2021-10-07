package com.company.utils.htmlParser;

import java.io.InputStream;

public class HTMLParser {
    public static Document parse(InputStream is) {
        return new Document();
    }
    public static Document parse(String is) {
        return new Document();
    }
    public static Elements selectAll() {
        return new Elements();
    }
}
